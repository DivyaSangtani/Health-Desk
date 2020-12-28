package com.thinking.machines.hd.dl;
import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.sql.*;
public class HospitalsDAO
{
public List<HospitalsDTO> getAll() throws DAOException
{
try
{
Connection c=DAOConnection.getConnection();

Statement s;
s=c.createStatement();
ResultSet rs;
rs=s.executeQuery("select * from Hospitals");
if(!rs.next())
{
rs.close();
s.close();
c.close();
throw new DAOException("No Hospitals Found");
}

List<HospitalsDTO> hospitals=new LinkedList();
HospitalsDTO hospital;
while(rs.next())
{
hospital=new HospitalsDTO();
hospital.setName(rs.getString(1));
hospital.setAddress(rs.getString(1));
hospital.setContactNumber(rs.getString(1));
hospital.setCity(rs.getString(1));
hospital.setState(rs.getString(1));
hospitals.add(hospital);
}


rs.close();
s.close();
c.close();
return hospitals;
}catch(Exception e)
{
throw new DAOException(e.getMessage());
}
}

public List<HospitalsDTO> getList(String city,String state) throws DAOException
{
List<HospitalsDTO> hospitals=new LinkedList();
try
{
System.out.println("**************");
System.out.println(city);
System.out.println(state);

System.out.println("**************");
Connection c=DAOConnection.getConnection();

PreparedStatement ps;
ps=c.prepareStatement("select * from Hospitals where city=? and state=?");
ps.setString(1,city);
ps.setString(2,state);
ResultSet rs;
rs=ps.executeQuery();

hospitals=new LinkedList();
HospitalsDTO hospital;
System.out.println(hospitals.size());
while(rs.next())
{
hospital=new HospitalsDTO();
hospital.setName(rs.getString("name"));
hospital.setAddress(rs.getString("address"));
hospital.setContactNumber(rs.getString("contact_no"));
hospital.setCity(rs.getString("city"));
hospital.setState(rs.getString("state"));
hospitals.add(hospital);

}
System.out.println(hospitals.size());

rs.close();
ps.close();
c.close();
return hospitals;
}catch(Exception e)
{
System.out.println(e.getMessage());
}
return hospitals;
}

}