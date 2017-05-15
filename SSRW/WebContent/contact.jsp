<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<%@page import="ssrw.javafiles.ContactDao"%>
<html>
<head>
<title>Crops an Agriculture Category Flat bootstrap Responsive website Template | Contact :: w3layouts</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Crops Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script> 
<!-- //js -->	
<!-- start-smoth-scrolling-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<!--//end-smoth-scrolling-->
</head>
<body>
   <%! String session; Object sesObj; %>
   <%ContactDao obj = new ContactDao();
    %>
	<!--header-->
	<div class="logo">
		<div class="container">
			<div class="logo-info">
				<a href="Home.jsp">
					<h1>Rice</h1>	
					<span class="glyphicon glyphicon-grain" aria-hidden="true"></span>
				</a>
			</div>
		</div>	
	</div>
	<!--//header-->		
	<!--navigation-->
	<div class="top-nav">
		<nav class="navbar navbar-default">
			<div class="container">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">Menu						
				</button>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="hvr-bounce-to-bottom active"><a href="Home.jsp">Home</a></li>
					<li class="hvr-bounce-to-bottom"><a href="about.html">About</a></li>
					<li class="hvr-bounce-to-bottom"><a href="gallery.html">Gallery</a></li>	
					<li class="hvr-bounce-to-bottom"><a href="codes.html">Short Codes</a></li>
					<li class="hvr-bounce-to-bottom"><a href="contact.jsp">Contact Us</a></li>
				</ul>	
				<div class="clearfix"> </div>
			</div>	
		</nav>		
	</div>	
	<!--//navigation-->
	<!--baner-->
	<div class="baner about-bnr">
		<div class="container">
			<div class="baner-grids">
				<div class="col-md-6 baner-top">
					<img src="images/img16.jpg" alt=""/>
				</div>
				<div class="col-md-6 baner-top">
					<img src="images/img17.jpg" alt=""/>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--//baner-->
	<!--map-->
	<div class="map">
		<iframe  src="https://www.google.com/maps/embed/v1/place?q=SEVENSTAR+RICE+MILL&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU"></iframe>
	</div>
	<!--//map-->
	<!--contact-->
	<div class="contact">
		<div class="container">
			<h3 class="title">Contact us</h3>
			<div id="messageDiv" style="color:green;display:<%=obj.getDivInd()%>;">
			 <h5><p align="center" color="GREEN"><b>Record has been inserted successfully</b></p></h5>
			 <%obj.setDivInd("none"); %>
		    </div>
		    <div id="messageErrorDiv" style="color:red;display:<%=obj.getErrInd()%>;">
			 <h5><p align="center" color="RED"><b>Error occured, Record has not been inserted successfully.Please try again</b></p></h5>
			 <%obj.setErrInd("none"); %>
		    </div>
			<div class="contact-form">
				<form method="post" action="ContactHandler">
					<input type="text" id="name" name="name"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="true">
					<div class="col-md-6 cnt-inpt">
						<input type="email" id="email" name="email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="true">
					</div>
					<div class="col-md-6 cnt-inpt">
						<input type="text" id="telephone" name="telephone"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Telephone';}" required="true">
					</div>
					<div class="clearfix"> </div>
					<textarea id="message" name="message" onfocus="this.value = '' ;" onblur="if (this.value == '') {this.value = 'Message...';}" required="true"> Message... </textarea>
					<input type="submit" value="Submit">
				</form>
			</div>			
		</div>
	</div>
	<!--//contact-->	
	<!-- footer -->
	<div class="footer">	
		<div class="container">
			<div class="footer-grids">
			
								<div class="col-md-3 footer-grid">
					<h3 class="title">Information</h3>
					 <ul>
						
						<li><a href="#">Testimonals</a></li>
						<li><a href="#">Clients</a></li>
						<li><a href="#">Our Staff</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h3 class="title">More details</h3>
					<ul>
						<li><a href="about.html">About us</a></li>
						<li><a href="contact.jsp">Site map</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid contact-grid">
						<h3 class="title">Contact us</h3>
						<ul>
							<li><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>Mirapota,Burdwan-Arambagh Road.</li>							
							<li class="adrs">Burdwan,WestBengal</li>
							<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>+919434122577</li>
							<li><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>sevenstarricemill@gmail.com</li>
						</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<div class="copy">
		<div class="container">
			<div class="copy-left">
				<p>Copyright © 2015 Rice. All rights reserved | Design by <a href="">SSRW</a></p>
			</div>
			<div class="social-icons">
				<ul>
					<li><a href="#" class="fb"></a></li>				
				</ul>	
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--//footer-->
	<!--smooth-scrolling-of-move-up-->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>