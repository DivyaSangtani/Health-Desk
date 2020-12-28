package com.thinking.machines.hd.servlets;
import com.thinking.machines.hd.dl.*;
import com.thinking.machines.hd.beans.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.text.*;
public class Login extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
UserBean userBean;
userBean=(UserBean)request.getAttribute("userBean");

String emailId=userBean.getEmailId();
String password=userBean.getPassword();
UserDTO userDTO=new UserDTO();
userDTO.setEmailId(emailId);
userDTO.setPassword(password);

UserDAO userDAO;
userDAO=new UserDAO();
System.out.println(emailId);
System.out.println(password);
if(userDAO.emailIdExists(userDTO))
{
if(userDAO.isPasswordCorrect(userDTO))
{
MessageBean messageBean;
messageBean=new MessageBean();
messageBean.setHeading("Login");
messageBean.setMessage("Login successful");
messageBean.setGenerateButtons(true);
messageBean.setGenerateTwoButtons(false);
messageBean.setButtonOneText("OK");
messageBean.setButtonOneAction("index.jsp");
request.setAttribute("messageBean",messageBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/Notification.jsp");
requestDispatcher.forward(request,response);

}else
{
ErrorBean errorBean;
errorBean=new ErrorBean();
errorBean.setError("Invalid Password");
request.setAttribute("errorBean",errorBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/loginpage.jsp");
requestDispatcher.forward(request,response);
}
}else
{
ErrorBean errorBean;
errorBean=new ErrorBean();
errorBean.setError("Invalid Email Id");
request.setAttribute("errorBean",errorBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/loginpage.jsp");
requestDispatcher.forward(request,response);
}
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