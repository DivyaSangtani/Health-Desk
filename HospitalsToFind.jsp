<jsp:include page='/MasterPageTopSection.jsp'/>
</nav>
    <link href="/healthdesk/css/HospitalsToFind.css" rel="stylesheet">

<div style='padding:10px;color:#105B56'>
<div style='color:#1430EA' align='center'><h2>Hospitals to Find</h2></div>

</div>
<form action="htf.jsp">
  <div class="container">
    <label for="statename"><br>Enter State :</br></label>
    <input type="text"  name="state" id="state" required>
    
    <label for="cityname"><br>Enter City: </br></label>
    <input type="text" name="city" id="city" required>
        
    <button type="submit">Search for Hospitals</button>
  </div>
</form> 
<jsp:include page='/MasterPageBottomSection.jsp'/>