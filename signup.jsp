<jsp:useBean id='userBean' scope='request' class='com.thinking.machines.hd.beans.UserBean' />
<jsp:setProperty name='userBean' property='*'/>
<jsp:forward page='/signUp' />
