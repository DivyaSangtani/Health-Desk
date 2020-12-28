<jsp:include page='/MasterPageTopSection.jsp'/>
<link href="/healthdesk/css/feedbackform.css" rel="stylesheet">


</nav>


<h2>Feedback Form</h2>

<form action="/healthdesk/feedback.jsp" method="post">
  </div>

  <div class="container">
    <label for="realname"><br>Enter your full name :</br></label>
    <input type="text" placeholder="Please enter your name" name="realname" required>

    <label for="eml"><br>Enter your Email Id : </br></label>
    <input type="email" placeholder="Enter your email id" name="eml" required>
    
    <label for="txt"><br>Your comments: </br></label>
    <input type="text" placeholder="Please give us your valuable feedback "name="comments" rows="15" cols="50">

    <label for="txt"><br>Any Suggestions: </br></label>
    <input type="text" placeholder="Your Suggestions are always welcome!! "><br><br>
        
    <button type="submit">Submit</button>
  </div>
 </form> 



<jsp:include page='/MasterPageBottomSection.jsp'/>