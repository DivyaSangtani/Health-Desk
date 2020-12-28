<jsp:useBean id='userBean' scope='request' class='com.thinking.machines.hd.beans.UserBean' />
<jsp:useBean id='errorBean' scope='request' class='com.thinking.machines.hd.beans.ErrorBean' />
<jsp:useBean id='loginBean' scope='application' class='com.thinking.machines.hd.beans.LoginBean' />

<jsp:include page='/MasterPageTopSection.jsp'/>
    <link href="/healthdesk/css/loginpage.css" rel="stylesheet">

</div>
</nav>
<div>
<h2>Login Page</h2>
<form action="login.jsp" method="post">

  <div class="container">
     <span class='error' style='color:#F11A10'>
<jsp:getProperty name='errorBean' property='error'/>
</span>
<br>
    <label for="emailid"><b>Email Id</b></label>
    <input type="text" placeholder="Enter Email Id" name="emailId" id="emailId" required>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required>
       
    <div class="clearfix">
      <button type="button" onclick="cancelLogin()" class="cancelbtn">Cancel</button>
      <button type="submit" class="loginbtn">Login</button>
    </div>

 
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  

   <span class="txt"> 

Don't have an account?<a href="signuppage.jsp">Sign up</a>

</span>
</form>

<form id='cancelLogin' action='/healthdesk/index.jsp'>
</form>

</div>
<jsp:include page='/MasterPageBottomSection.jsp'/>