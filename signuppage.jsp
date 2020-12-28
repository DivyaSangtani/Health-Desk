<jsp:useBean id='userBean' scope='request' class='com.thinking.machines.hd.beans.UserBean' />
<jsp:useBean id='errorBean' scope='request' class='com.thinking.machines.hd.beans.ErrorBean' />
<jsp:include page='/MasterPageTopSection.jsp'/>
<script src='/healthdesk/js/signuppage.js'></script>
        <link href="./css/signuppage.css" rel="stylesheet">
                       <li class="nav-item"> 
                      <form action="loginpage.html">          
                      <button type="submit" class="btn"><i class="fa fa-user"></i> Login</button>
                    </form>
			</li>
    </nav>
          
</div>
<form action="/healthdesk/signup.jsp"  style="border:1px solid #ccc">
  <div class="container">
    <h3>Sign Up</h3>
    <p>Please fill in this form to create an account.</p>
    <hr>
   <label for="name"><b>Name</b></label>
   <input type="text" placeholder="Enter Name" name="name" id="name" required>
      <span class='error'>
<jsp:getProperty name='errorBean' property='error'/>
</span>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="emailId" id="emailId" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="password-repeat" id="password-repeat" required>
 
    <label for="number"><b>Contact Number</b></label>
    <input type="number" placeholder="Enter Contact Number" name="contactNumber" id="contactNumber" required>
    
<label for="dateofbirth"><b>Date of Birth</b></label>
<input type="date" placeholder="Enter Date of Birth" name="dateOfBirth" id="dateOfBirth" required>

  
  <label for="gender"><b>Gender</b></label>
<input type="radio" id="male" name="gender"  value="M">
  <label for="male">Male</label>
  <input type="radio" id="female" name="gender" value="F">
  <label for="female">Female</label><br><br>
    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    <div class="clearfix">
      <button type="button" onclick="cancelSignUp()" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

<form id='cancelSignUp' action='/healthdesk/index.html'>
</form>

<jsp:include page='/MasterPageBottomSection.jsp'/>