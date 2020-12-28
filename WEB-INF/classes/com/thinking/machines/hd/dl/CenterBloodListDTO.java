package com.thinking.machines.hd.dl;
import java.math.*;
import java.util.*;
public class CenterBloodListDTO implements java.io.Serializable
{
private int centerCode;
private int quantity;
private String bloodGroup;

public CenterBloodListDTO()
{
this.centerCode=0;
this.quantity=0;
this.bloodGroup="";
}

public void setCenterCode(int centerCode)
{
this.centerCode=centerCode;
}
public int getCenterCode()
{
return this.centerCode;
}
public void setQuantity(int quantity)
{
this.quantity=quantity;
}
public int getQuantity()
{
return this.quantity;
}
public void setBloodGroup(String bloodGroup)
{
this.bloodGroup=bloodGroup;
}
public String getBloodGroup()
{
return this.bloodGroup;
}
}