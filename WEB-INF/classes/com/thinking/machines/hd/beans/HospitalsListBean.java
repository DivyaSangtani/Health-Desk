package com.thinking.machines.hd.beans;
import java.math.*;
import java.util.*;
public class HospitalsListBean implements java.io.Serializable
{
private List<HospitalBean> hospitals;
public HospitalsListBean()
{
hospitals=new LinkedList();
}

public void setHospitals(List<HospitalBean> hospitals)
{
this.hospitals=hospitals;
}
public List<HospitalBean> getHospitals()
{
return hospitals;
}
}