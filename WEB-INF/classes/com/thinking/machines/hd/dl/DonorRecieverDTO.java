package com.thinking.machines.hd.dl;
import java.math.*;
import java.util.*;
public class DonorRecieverDTO implements java.io.Serializable
{
private int drid;
private String name;
private String contactNumber;
private String city;
private String state;
private String bloodGroup;

public DonorRecieverDTO()
{
this.drid=0;
this.name="";
this.contactNumber="";
this.city="";
this.state="";
this.bloodGroup="";
}

public void setDrid(int drid)
{
this.drid=drid;
}
public int getDrid()
{
return this.drid;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}
public void setCity(String city)
{
this.city=city;
}
public String getCity()
{
return this.city;
}
public void setContactNumber(String contactNumber)
{
this.contactNumber=contactNumber;
}
public String getContactNumber()
{
return this.contactNumber;
}
public void setState(String state)
{
this.state=state;
}
public String getState()
{
return this.state;
}
public void setBloodGroup(String bloodGroup)
{
this.bloodGroup=bloodGroup;
}
public String getBloodGroup()
{
return this.bloodGroup;
}
public int hashCode()
{
return drid;
}
public boolean equals(Object object)
{
if(!(object instanceof DonorRecieverDTO)) return false;
DonorRecieverDTO dr=(DonorRecieverDTO)object;
return this.drid==dr.drid;
}
}