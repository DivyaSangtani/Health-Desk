<!DOCTYPE html>
<html>
<body>
<table width="1350" height="640" border="1" >
<tr>
<td colspan="2" style="background-color:#FFF5EE;">
<h1>HOSPITAL MANAGEMENT SYSTEM</h1>
<h3 align="center">ADMIN PANEL</h3>
</td>
</tr>
<tr>
<td style="background-color:#00FFFF;width:50px;height:400px;">
<table align="center">
<tr>
<td><form action="nurse.php" align="center">
<input type="submit" align="center" value="       nurse       ">
</form></td>
</tr>
<tr>
	<td><form action="patient.php" align="center">
<input type="submit" align="center" value="      patient      ">
</form></td>
</tr>
<tr>
<td><form action="pharmacist.php" align="center">
<input type="submit" align="center" value="  pharamacist  ">
</form></td>
</tr>
<tr>
	<td><form action="laboratorist.php" align="center">
<input type="submit" align="center" value="  laboratorist    ">
</form></td>
	<tr>
	<td><form action="accountant.php" align="center">
<input type="submit" align="center" value="  accountant    ">
</form></td>
</tr>
</table>
</td>
<td style="background-color:#eeeeee;height:200px;width:400px;height:400px;">
<?php
      $host='localhost';
      $username='root';
      $password='';
      $dbname='hospital';
      $con=mysql_connect($host,$username,$password);
mysql_select_db($dbname);
  $result = mysql_query("SELECT * FROM doctor");
echo "<h4 align='center'> doctors list </h4>";
  echo "<table border=1 align=center><tr><th>s.no</th><th>name</th><th>d_id</th><th>qualification</th><th>speciality</th><th>age</th></tr>";
while($row = mysql_fetch_array($result)) 
  {
echo "<tr>";
echo "<td>" . $row['s_no'] . "</td>";    
echo "<td>" . $row['name'] . "</td>";
echo "<td>" . $row['d_id'] . "</td>";
echo "<td>" . $row['qualification'] . "</td>";
echo "<td>" . $row['speciality'] . "</td>";
echo "<td>" . $row['age'] . "</td>";
echo "</tr>";

  }

echo "</table>";
mysql_close($con);
?>
<br><br>
<table align="right">
<th>
<tr>
<form action="adddoctor.php" align="center">
<input type="submit" align="center" value="    add new doctor    ">
</form>
</tr>
	<tr>
	<form action="deletedoctor.php" align="center">
<input type="submit" align="center" value="   delete doctor   ">
</form></tr>
<tr>
<form action="viewcompletedoctor.php" align="center">
<input type="submit" align="center" value="  viewcomplete  ">
</form>
</tr>
<tr>
	<form action="admin.html" align="center">
<input type="submit" align="center" value="    home    ">
</form>
</tr></table>
</td>
</tr><tr>
<td colspan="2" style="background-color:#9ACD32;text-align:center;">
<table align="right">
<th>
<tr><form action="appointment.php" align="center">
<input type="submit" align="center" value="    appointment     ">
</form>
</tr><tr><form action="payment.php" align="center">
<input type="submit" align="center" value="    payment   ">
</form>
</tr><tr><form action="bloodbank.php" align="center">
<input type="submit" align="center" value="   bloodbank   ">
</form>
</tr><tr>
	<form action="medicine.php" align="center">
<input type="submit" align="center" value="  medicine  ">
</form>
</tr><tr><form action="operations.php" align="center">
<input type="submit" align="center" value="  operations  ">
</form>
</tr><tr>
	<form action="birthreport.php" align="center">
<input type="submit" align="center" value="  birthreport  ">
</form>
</tr><tr><form action="deathreport.php" align="center">
<input type="submit" align="center" value="  deathreport  ">
</form>
</tr><tr><form action="bedallotment.php" align="center">
<input type="submit" align="center" value="  bedallotment  ">
</form>
</tr></th>	</table>
</td></tr></table>
</body>
</html>
