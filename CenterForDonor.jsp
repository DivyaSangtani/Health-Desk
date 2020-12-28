<jsp:include page='/MasterPageTopSection.jsp'/>
</nav>
    <link href="/healthdesk/css/CenterForDonor.css" rel="stylesheet">
<div style='height:80vh;width:auto'>
<div style='padding:10px;color:#4A5B5A'>
<h3>You can donate your blood in specified areas in your city.</h3>
</div>
<%
for(int i=0;i<4;i++)
{
%>
<button class="accordion">aaa</button>
<div class="panel">
  <p>Contact no.: 09876543211<br> Address: 1, Saint Road, Mumbai</p>
</div>

<button class="accordion">bbb</button>
<div class="panel">
  <p>Contact no.: 09876543211<br> Address: 1, Saint Road, Mumbai</p>
</div>

<button class="accordion">ccc</button>
<div class="panel">
  <p>Contact no.: 09876543211<br> Address: 1, Saint Road, Mumbai</p>
</div>

<%
}
%>

</div>
<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.display === "block") {
      panel.style.display = "none";
    } else {
      panel.style.display = "block";
    }
  });
}
</script>
<jsp:include page='/MasterPageBottomSection.jsp'/>