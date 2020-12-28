package com.thinking.machines.hd.dl;
import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.sql.*;
public class UserDAO
{
public void add(UserDTO userDTO) throws DAOException
{
try
{
Connection c=DAOConnection.getConnection();
int code;
String name=userDTO.getName().trim();
java.util.Date vdateOfBirth=userDTO.getDateOfBirth();
String contactNumber=userDTO.getContactNumber();
String gender=userDTO.getGender();
String emailId=userDTO.getEmailId().trim();
String password=userDTO.getPassword();

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
String dateOfBirth=sdf.format(vdateOfBirth);
java.sql.Date date=java.sql.Date.valueOf(dateOfBirth);
PreparedStatement ps;
ps=c.prepareStatement("select * from user where email_id=?");
ps.setString(1,emailId);
ResultSet rs;
rs=ps.executeQuery();
if(rs.next())
{
rs.close();
ps.close();
c.close();
throw new DAOException("Email Id "+emailId+"already exists.");
}
rs.close();
ps.close();


ps=c.prepareStatement("insert into user (name,date_of_birth,gender,contact_number,email_id,password) values(?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
ps.setString(1,name);
ps.setDate(2,date);
ps.setString(3,gender);
ps.setString(4,contactNumber);
ps.setString(5,emailId);
ps.setString(6,password);
ps.executeUpdate();
rs=ps.getGeneratedKeys();
rs.next();
code=rs.getInt(1);
userDTO.setCode(code);
rs.close();
ps.close();
c.close();
}catch(Exception e)
{
throw new DAOException(e.getMessage());
}
}

public boolean emailIdExists(UserDTO userDTO)
{
try
{
Connection c=DAOConnection.getConnection();
String emailId=userDTO.getEmailId().trim();
String password=userDTO.getPassword();

PreparedStatement ps;
ps=c.prepareStatement("select * from user where email_id=?");
ps.setString(1,emailId);
ResultSet rs;
rs=ps.executeQuery();
if(rs.next())
{
rs.close();
ps.close();
return true;
}
rs.close();
ps.close();
return false;
}catch(Exception e)
{
//do nothing
}
return false;
}

public boolean isPasswordCorrect(UserDTO userDTO) throws DAOException
{
try
{
Connection c=DAOConnection.getConnection();
String emailId=userDTO.getEmailId().trim();
String password=userDTO.getPassword();
String pass;
PreparedStatement ps;
ps=c.prepareStatement("select password from user where email_id=?");
ps.setString(1,emailId);
ResultSet rs;
rs=ps.executeQuery();
if(rs.next())
{
pass=rs.getString(1);
System.out.println(pass);
System.out.println(password);
if(pass.equals(password))
{
return true;
}
else
{
return false;
}
}
rs.close();
ps.close();
}catch(Exception e)
{
//do nothing
}
return false;
}
}