package com.thinking.machines.hd.servlets;
import com.thinking.machines.hd.dl.*;
import com.thinking.machines.hd.beans.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.text.*;
public class FeedBack extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
MessageBean messageBean;
messageBean=new MessageBean();
messageBean.setHeading("FeedBack");
messageBean.setMessage("Thanku for your feedback");
messageBean.setGenerateButtons(true);
messageBean.setGenerateTwoButtons(false);
messageBean.setButtonOneText("OK");
messageBean.setButtonOneAction("index.jsp");
request.setAttribute("messageBean",messageBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/Notification.jsp");
requestDispatcher.forward(request,response);
}catch(Exception e)
{
//do nothing
}
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
doPost(request,response);
}
}