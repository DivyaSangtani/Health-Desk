package com.thinking.machines.hd.servlets;
import com.thinking.machines.hd.dl.*;
import com.thinking.machines.hd.beans.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.text.*;
public class HospitalsToFind extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
CityStateBean cityStateBean;
cityStateBean=(CityStateBean)request.getAttribute("cityStateBean");

String city=cityStateBean.getCity();
String state=cityStateBean.getState();
System.out.println(city);
System.out.println(state);

HospitalsDAO hospitalsDAO;
hospitalsDAO=new HospitalsDAO();
List<HospitalsDTO> list=hospitalsDAO.getList(city,state);
System.out.println(list.size());
List<HospitalBean> hospitals=new LinkedList();
HospitalsDTO hospitalDTO;
HospitalBean hospital;
for(int i=0;i<list.size();i++)
{
hospitalDTO=list.get(i);
hospital=new HospitalBean();
hospital.setName(hospitalDTO.getName());
hospital.setAddress(hospitalDTO.getAddress());
hospital.setContactNumber(hospitalDTO.getContactNumber());
hospital.setCity(hospitalDTO.getCity());
hospital.setState(hospitalDTO.getState());
hospitals.add(hospital);
}
System.out.println(hospitals.size());
HospitalsListBean hlb;
hlb=new HospitalsListBean();
hlb.setHospitals(hospitals);

request.setAttribute("hospitalsListBean",hlb);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/HospitalsList.jsp");
requestDispatcher.forward(request,response);

}catch(Exception exception)
{
//do nothing
}
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
doPost(request,response);
}
}