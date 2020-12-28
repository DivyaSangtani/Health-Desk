<%@taglib uri='/WEB-INF/mytags/tmtags.tld' prefix='tm'%>
<jsp:include page='/MasterPageTopSection.jsp'/>
           <li class="nav-item"> 
                      <form action="loginpage.jsp">          
                      <button type="submit" class="btn"><i class="fa fa-user"></i> Login</button>
                    </form>
			</li>

    </nav>
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner" role="listbox" style=" width:100%; height: 700px !important;">
          <div class="carousel-item active">
            <img class="d-block w-100" src="./images/one.jpg" alt="First slide">


          
</div>
          <div class="carousel-item">
            <img class="d-block w-100" src="./images/two.jpg" alt="Second slide">
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="./images/three.jpg" alt="Third slide">
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
<jsp:include page='/MasterPageBottomSection.jsp'/>