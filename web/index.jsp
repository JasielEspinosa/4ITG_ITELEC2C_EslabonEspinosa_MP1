<!DOCTYPE html>
<html>
<title>ITELEC2C-MP1</title>
<link rel="icon" href="images/logo.png">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Allerta Stencil|Audiowide|Antic'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.allerta {
	font-family: Allerta Stencil;
}

.audiowide {
	font-family: Audiowide;
}

.antic {
	font-family: Antic
}

a:link {
	text-decoration: none;
}
</style>
<body id="myPage">
	<div class="w3-top">
		<div class="w3-bar w3-theme-d2 w3-left-align">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-hover-white"
				href="javascript:void(0);" onclick="openNav()"><i
				class="fa fa-bars"></i></a> <a href="index.jsp"
				class="w3-bar-item w3-button w3-green allerta w3-large">Carl and
				Jasiel's Aircraft Wiki</a>
			<div class="w3-dropdown-hover w3-hide-small">
				<button class="w3-button allerta w3-large" title="Notifications">
					Shop Aircraft Wikifactures <i class="fa fa-caret-down"></i>
				</button>
				<div class="w3-dropdown-content w3-card-4 w3-bar-block w3-large">
					<a href="indexAirbus.jsp" class="w3-bar-item w3-button allerta">Airbus</a>
					<a href="indexBoeing.jsp" class="w3-bar-item w3-button allerta">Boeing</a>
					<a href="indexDouglas.jsp" class="w3-bar-item w3-button allerta">McDonnell
						Douglas</a>
				</div>
			</div>
		</div>
		<div id="navDemo"
			class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium">
			<a href="indexAirbus.jsp" class="w3-bar-item w3-button allerta">Airbus</a>
			<a href="indexBoeing.jsp" class="w3-bar-item w3-button allerta">Boeing</a>
			<a href="indexDouglas.jsp" class="w3-bar-item w3-button allerta">McDonnell
				Douglas</a>
		</div>
	</div>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item active">
				<img src="images/header-airbus-2.jpg" alt="Los Angeles"
					style="width: 100%;">
			</div>

			<div class="item">
				<img src="images/header-boeing-2.jpg" alt="Chicago"
					style="width: 100%;">
			</div>

			<div class="item">
				<img src="images/header-douglas-2.jpg" alt="New york"
					style="width: 100%;">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<div class="w3-container w3-padding-64 w3-center audiowide" id="team">
		<h2>OUR TEAM</h2>
		<p>Meet the team</p>
		<div class="w3-row">
			<br>
			<div class="w3-half">
				<img src="images/chixspotted.jpg" style="width: 35%"
					class="w3-circle w3-hover-opacity">
				<h3>Jasiel Espinosa</h3>
				<p>Chairman, President and CEO</p>
			</div>
			<div class="w3-half">
				<img src="images/carl-elec.jpg" style="width: 35%"
					class="w3-circle w3-hover-opacity">
				<h3>Carl Eslabon</h3>
				<p>Business Development and Strategy</p>
			</div>
		</div>
	</div>
	<div class="w3-row-padding w3-padding-64 w3-theme-l1 antic" id="work">
		<div class="w3-quarter">
			<h2>Our Work</h2>
			<p>Aircraft Wikifactures is an international pioneer in the
				aerospace industry. We are a leader in designing, manufacturing and
				delivering aerospace products, services and solutions to customers
				on a global scale. We aim for a better-connected, safer and more
				prosperous world.</p>
			<p>A commercial aircraft manufacturer, with Space and Defence as
				well as Helicopters Divisions, Airbus is the largest aeronautics and
				space company in Europe and a worldwide leader. Aircraft
				Wikifactures has built on its strong European heritage to become
				truly international, with roughly 180 locations and 12,000 direct
				suppliers globally. The company has aircraft and helicopter final
				assembly lines across Asia, Europe and the Americas, and has
				achieved a more than sixfold order book increase since 2000.</p>
		</div>
		<div class="w3-quarter">
			<div class="w3-card-2 w3-white">
				<img src="images/aces-edited.png" alt="First Partner"
					style="width: 100%">
				<div class="w3-container">
					<p>Founded on August 30, 1971, by a group of 13 Colombian
						entrepreneurs, amongst them, most notably Orlando Botero Escobar
						and German Peñaloza Arias from Manizales and Luis H. Coulson,
						Jorge Coulson R., Alberto Jaramillo and Hernán Zuluaga from
						Medellín.</p>
				</div>
			</div>
		</div>
		<div class="w3-quarter">
			<div class="w3-card-2 w3-white">
				<img src="images/adria-edited.png" alt="Cinque Terre"
					style="width: 100%">
				<div class="w3-container">
					<p>Formerly Inex-Adria Aviopromet, later Inex-Adria Airways, is
						the largest airline in Slovenia. The majority of Adria Airways'
						business is in scheduled flights, but it also provides charter and
						ad hoc flights. Adria currently operates to 24 scheduled and 22
						charter destinations throughout Europe.</p>
				</div>
			</div>
		</div>
		<div class="w3-quarter">
			<div class="w3-card-2 w3-white">
				<img src="images/aegean.png" alt="Monterosso" style="width: 100%">
				<div class="w3-container">
					<p>Largest Greek airline by total number of passengers carried,
						by number of destinations served and by fleet size. A Star
						Alliance member since June 2010, it operates scheduled and charter
						services from Athens and Thessaloniki to other major Greek
						destinations as well as to a number of European destinations.</p>
				</div>
			</div>
		</div>
	</div>
	<!-- Pricing Row -->
	<div class="w3-row-padding w3-center w3-padding-64 antic" id="pricing">
		<h2>PROMOS</h2>
		<p>Valid until December 2017!</p>
		<br>
		<div class="w3-third w3-margin-bottom">
			<ul class="w3-ul w3-border w3-hover-shadow">
				<li class="w3-theme">
					<p class="w3-xlarge">A300 PAL</p>
				</li>
				<li class="w3-padding-16"><b>FL</b> State</li>
				<li class="w3-padding-16"><b>2016</b></li>
				<li class="w3-padding-16">Serial no.<b> 6166</b></li>
				<li class="w3-padding-16">
					<h2 class="w3-wide">
						<i class="fa fa-usd"></i>62,850,000
					</h2>
				</li>
			</ul>
		</div>
		<div class="w3-third w3-margin-bottom">
			<ul class="w3-ul w3-border w3-hover-shadow">
				<li class="w3-theme">
					<p class="w3-xlarge">A310 PFDX</p>
				</li>
				<li class="w3-padding-16"><b>NJ</b> State</li>
				<li class="w3-padding-16"><b>2015</b></li>
				<li class="w3-padding-16">Serial no.<b> 9527</b></li>
				<li class="w3-padding-16">
					<h2 class="w3-wide">
						<i class="fa fa-usd"></i>13,995,000
					</h2>
				</li>
			</ul>
		</div>
		<div class="w3-third w3-margin-bottom">
			<ul class="w3-ul w3-border w3-hover-shadow">
				<li class="w3-theme">
					<p class="w3-xlarge">A318 PAL</p>
				</li>
				<li class="w3-padding-16"><b>VA</b> State</li>
				<li class="w3-padding-16"><b>2014</b></li>
				<li class="w3-padding-16">Serial no.<b> 463</b></li>
				<li class="w3-padding-16">
					<h2 class="w3-wide">
						<i class="fa fa-usd"></i> 52,900,000
					</h2>
				</li>
			</ul>
		</div>
	</div>
	<!-- Contact Container -->
	<div class="w3-container w3-padding-64 w3-theme-l5 antic" id="contact" align="center">

			<div class="w3-padding-16">
				<span class="w3-xlarge w3-border-teal w3-bottombar">Contact
					Us</span>
			</div>
			<h3>Address</h3>
			<p>Swing by for more details.</p>
			<p>
				<i class="fa fa-map-marker w3-text-teal w3-xlarge"></i>  Manila, PHL
			</p>
			<p>
				<i class="fa fa-phone w3-text-teal w3-xlarge"></i>  +63 9299692289
			</p>
			<p>
				<i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>  carleslabon@gmail.com
			</p>

	</div>
	<!-- Google Maps -->
	<div id="googleMap" style="width: 100%; height: 420px;"></div>
	<script>
		function myMap() {
			myCenter = new google.maps.LatLng(14.6097, 120.9896);
			var mapOptions = {
				center : myCenter,
				zoom : 12,
				scrollwheel : false,
				draggable : false,
				mapTypeId : google.maps.MapTypeId.ROADMAP
			};
			var map = new google.maps.Map(document.getElementById("googleMap"),
					mapOptions);
			var marker = new google.maps.Marker({
				position : myCenter,
			});
			marker.setMap(map);
		}
	</script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBukntHWDgN5ipmdxeTnGJUhpvM__jF39Y&callback=myMap"></script>
	<!--
					To use this code on your website, get a free API key from Google.
					Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
					-->
	<!-- Footer -->
	<footer class="w3-container w3-padding-32 w3-theme-d1 w3-center antic">
		<h4>Follow Us</h4>
		<a class="w3-button w3-large w3-teal"
			href="https://www.facebook.com/CocoaJasz?fref=ts" title="Facebook"><i
			class="fa fa-facebook"></i></a> <a class="w3-button w3-large w3-teal"
			href="https://www.facebook.com/CocoaJasz?fref=ts" title="Twitter"><i
			class="fa fa-twitter"></i></a> <a class="w3-button w3-large w3-teal"
			href="https://www.facebook.com/CocoaJasz?fref=ts" title="Instagram"><i
			class="fa fa-instagram"></i></a>
		<p>
			Powered by <a href="https://www.facebook.com/CocoaJasz?fref=ts"
				target="_blank">97Espi Research Team</a>
		</p>
		<div style="position: relative; bottom: 100px; z-index: 1;"
			class="w3-tooltip w3-right">
			<span class="w3-text w3-padding w3-teal w3-hide-small">Go To
				Top</span> <a class="w3-button w3-theme" href="#myPage"><span
				class="w3-xlarge"> <i class="fa fa-chevron-circle-up"></i></span></a>
		</div>
	</footer>
	<script>
		// Script for side navigation
		function w3_open() {
			var x = document.getElementById("mySidebar");
			x.style.width = "300px";
			x.style.paddingTop = "10%";
			x.style.display = "block";
		}
		// Close side navigation
		function w3_close() {
			document.getElementById("mySidebar").style.display = "none";
		}
		// Used to toggle the menu on smaller screens when clicking on the menu button
		function openNav() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>
</body>
</html>
