package com.thinking.machines.hd.dl;
import java.sql.*;
public class DAOConnection
{
private DAOConnection(){}
public static Connection getConnection() throws DAOException
{
Connection connection=null;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthdesk","admin","admin");
return connection;
}catch(Exception exception)
{
throw new DAOException(exception.getMessage());
}
}
}