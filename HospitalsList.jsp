<jsp:include page='/MasterPageTopSection.jsp'/>
</nav>
    <link href="/healthdesk/css/CenterForDonor.css" rel="stylesheet">
<div style='height:80vh;width:auto'>
<div style='padding:10px;color:#4A5B5A'>
<h3>Hospitals.</h3>
</div>

<button class="accordion">${hospitalsListBean.hospitals.get(0).name}
</button>
<div class="panel">
  <p>Contact no.: ${hospitalsListBean.hospitals.get(0).contactNumber}
<br> ${hospitalsListBean.hospitals.get(0).address}
</p>
</div>


<button class="accordion">${hospitalsListBean.hospitals.get(1).name}
</button>
<div class="panel">
  <p>Contact no.: ${hospitalsListBean.hospitals.get(1).contactNumber}
<br> ${hospitalsListBean.hospitals.get(1).address}
</p>
</div>






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