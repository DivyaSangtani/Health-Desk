package com.thinking.machines.hd.servlets;
import com.thinking.machines.hd.dl.*;
import com.thinking.machines.hd.beans.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.text.*;
public class SignUp extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
UserBean userBean;
userBean=(UserBean)request.getAttribute("userBean");

int code;
String name=userBean.getName().trim();
String dateOfBirth=userBean.getDateOfBirth();
String contactNumber=userBean.getContactNumber();
String gender=userBean.getGender();
String emailId=userBean.getEmailId().trim();
String password=userBean.getPassword();

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
UserDTO userDTO=new UserDTO();
userDTO.setName(name);
userDTO.setDateOfBirth(sdf.parse(dateOfBirth));
userDTO.setContactNumber(contactNumber);
userDTO.setGender(gender);
userDTO.setEmailId(emailId);
userDTO.setPassword(password);

UserDAO userDAO;
userDAO=new UserDAO();

try
{

userDAO.add(userDTO);
userBean.setCode(userDTO.getCode());
MessageBean messageBean;
messageBean=new MessageBean();
messageBean.setHeading("SignUp");
messageBean.setMessage("Signup successful");
messageBean.setGenerateButtons(true);
messageBean.setGenerateTwoButtons(false);
messageBean.setButtonOneText("OK");
messageBean.setButtonOneAction("index1.jsp");
request.setAttribute("messageBean",messageBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/Notification.jsp");
requestDispatcher.forward(request,response);
}catch(DAOException daoException)
{
ErrorBean errorBean;
errorBean=new ErrorBean();
errorBean.setError(daoException.getMessage());
System.out.println(daoException.getMessage());
request.setAttribute("errorBean",errorBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/signuppage.jsp");
requestDispatcher.forward(request,response);
}
}catch(Exception exception)
{
System.out.println(exception+"yyyy");
/*
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("ErrorPage.jsp");
try
{
requestDispatcher.forward(request,response);
}catch(Exception e)
{
//do nothing
}
*/
}
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
doPost(request,response);
}
}