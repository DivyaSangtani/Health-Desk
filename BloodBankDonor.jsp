<jsp:include page='/MasterPageTopSection.jsp'/>
</nav>
    <link href="/healthdesk/css/BloodBankDetails.css" rel="stylesheet">

<form action="/healthdesk/CenterForDonor.jsp" style="border:1px solid #ccc">
  <div class="container">
<div style='color:#1430EA' align='center'><h2>Find Blood Donor</h2></div>
    <h3>Personal Details</h3>
    <p>Please fill these details.</p>
    <hr>
   <label for="name"><b>Name</b></label>
   <input type="text" placeholder="Enter Name" name="name" required>

    <label for="cname"><b>City</b></label>
    <input type="text" placeholder="Enter City" name="cname" required>

    <label for="state"><b>State</b></label>
    <select name="states" id="states">
    <option value="andhraPradesh">Andhra Pradesh</option>
    <option value="arunachalPradesh">Arunachal Pradesh</option>
    <option value="assam">Assam</option>
    <option value="bihar">Bihar</option>
<option value="chhatisgarh">Chhatisgarh</option>
    <option value="goa">Goa</option>
    <option value="gujrat">Gujrat</option>
    <option value="haryana">Haryana</option>
<option value="himachalPradesh">Himachal Pradesh</option>
    <option value="jharkhand">Jharkhand</option>
    <option value="karnataka">Karnataka</option>
    <option value="kerela">Kerela</option>
<option value="madhyaPradesh">Madhya Pradesh</option>
    <option value="maharashtra">Maharashtra</option>
    <option value="manipur">Manipur</option>
    <option value="meghalaya">Meghalaya</option>
<option value="mizoram">Mizoram</option>
    <option value="nagaland">Nagaland</option>
    <option value="odisha">Odisha</option>
    <option value="punjab">Punjab</option>
<option value="rajasthan">Rajasthan</option>
    <option value="sikkim">Sikkim</option>
    <option value="tamilNadu">Tamil Nadu</option>
    <option value="telangana">Telangana</option>
<option value="tripura">Tripura</option>
    <option value="uttarakhand">Uttarakhand</option>
    <option value="uttarpradesh">Uttar Pradesh</option>
    <option value="westBengal">West Bengal</option>
 </select>
  <br><br>
<label for="bgname"><b>Blood Group</b></label>
   <input type="text" placeholder="Enter Blood Group" name="bgname" required>

<label for="number"><b>Contact Number</b></label>
<input type="number" placeholder="Enter Number" name="number" required>
<label for="number"><b>Hemoglobin</b></label>
<input type="number" placeholder="Enter Hemoglobin Rate" name="number" required>
 <label for="gdr"><b>Gender</b></label>
<input type="radio" id="male" name="gender" value="male">
  <label for="male">Male</label>
  <input type="radio" id="female" name="gender" value="female">
  <label for="female">Female</label><br><br>
   
  </div>

 <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="submitbtn">Submit</button>
    </div>
</div>
</form>

<jap:include page='/masterPageBottomSection.jsp'/>