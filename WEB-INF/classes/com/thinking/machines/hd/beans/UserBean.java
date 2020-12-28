package com.thinking.machines.hd.beans;
import java.math.*;
import java.util.*;
public class UserBean implements java.io.Serializable
{
private int code;
private String name;
private String dateOfBirth;
private String contactNumber;
private String gender;
private String emailId;
private String password;

public UserBean()
{
this.code=0;
this.name="";
this.dateOfBirth="";
this.contactNumber="";
this.gender="";
this.emailId="";
this.password="";
}

public void setCode(int code)
{
this.code=code;
}
public int getCode()
{
return this.code;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}
public void setDateOfBirth(String dateOfBirth)
{
this.dateOfBirth=dateOfBirth;
}
public String getDateOfBirth()
{
return this.dateOfBirth;
}
public void setGender(String gender)
{
this.gender=gender;
}
public String getGender()
{
return this.gender;
}
public void setContactNumber(String contactNumber)
{
this.contactNumber=contactNumber;
}
public String getContactNumber()
{
return this.contactNumber;
}
public void setEmailId(String emailId)
{
this.emailId=emailId;
}
public String getEmailId()
{
return this.emailId;
}
public void setPassword(String password)
{
this.password=password;
}
public String getPassword()
{
return this.password;
}
}