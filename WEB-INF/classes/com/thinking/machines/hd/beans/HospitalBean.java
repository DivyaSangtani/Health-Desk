package com.thinking.machines.hd.beans;
import java.math.*;
import java.util.*;
public class HospitalBean 
{
private String name;
private String address;
private String contactNumber;
private String city;
private String state;
public HospitalBean()
{
this.name="";
this.contactNumber="";
this.address="";
this.city="";
this.state="";
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
public void setAddress(String address)
{
this.address=address;
}
public String getAddress()
{
return this.address;
}

}