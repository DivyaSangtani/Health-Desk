package com.thinking.machines.hd.beans;
import java.math.*;
import java.util.*;
public class CityStateBean implements java.io.Serializable
{
private String city;
private String state;

public CityStateBean()
{
this.city="";
this.state="";
}

public void setCity(String city)
{
this.city=city;
}
public String getCity()
{
return this.city;
}
public void setState(String state)
{
this.state=state;
}
public String getState()
{
return this.state;
}
}