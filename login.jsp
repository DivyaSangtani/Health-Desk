<jsp:useBean id='loginBean' scope='application' class='com.thinking.machines.hd.beans.LoginBean' />
<jsp:useBean id='userBean' scope='request' class='com.thinking.machines.hd.beans.UserBean' />
<jsp:setProperty name='userBean' property='*'/>
<jsp:forward page='/login' />
