package com.thinking.machines.hd.dl;
import java.math.*;
import java.util.*;
public class UserDTO implements java.io.Serializable,Comparable<UserDTO>
{
private int code;
private String name;
private java.util.Date dateOfBirth;
private String contactNumber;
private String gender;
private String emailId;
private String password;

public UserDTO()
{
this.code=0;
this.name="";
this.dateOfBirth=null;
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
public void setDateOfBirth(Date dateOfBirth)
{
this.dateOfBirth=dateOfBirth;
}
public Date getDateOfBirth()
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
public int hashCode()
{
return code;
}
public boolean equals(Object object)
{
if(!(object instanceof UserDTO)) return false;
UserDTO user=(UserDTO)object;
return this.code==user.code;
}
public int compareTo(UserDTO user)
{
return this.emailId.compareTo(user.emailId);
} 
}