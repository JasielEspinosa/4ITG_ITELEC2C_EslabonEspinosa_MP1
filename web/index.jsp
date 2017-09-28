<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<title>Carl's and Jasiel's Aircrafturers</title>
</head>

<style>
body {
	background-image: url(images/first_pic_first_page.jpg);
	-moz-background-size: cover;
	-webkit-background-size: cover;
	background-size: cover;
	background-position: top center !important;
	background-repeat: no-repeat !important;
	background-attachment: fixed;
}

h1 {
	text-align: center;
	font-size: 45px;
	font-family: cursive;
	color: yellow;
	border: double;
	border-color: white;
	background-color: teal;
	border-color: white;
	color: yellow;
}

h2 {
	color: #FFF;
	font-family: Aldrich;
	font-size: 5rem;
	text-align: center;
	color: black;
	text-shadow: white 0.05em 0.05em 0.05em
}

h2_old {
	text-align: center;
	font-size: 35px;
	font-family: fantasy;
	color: white;
	border-style: dotted;
	border-color: white;
	color: white;
	text-shadow: black 0.1em 0.1em 0.1em
}

li {
	font-size: 18px;
	color: white;
	text-shadow: black 0.1em 0.1em 0.2em
}

h3 {
	font-size: 25px;
	font-family: inherit;
	color: white;
	text-shadow: navy 0.1em 0.1em 0.2em
}

p {
	font-size: 150%;
	font-family: inherit;
	color: white;
	text-shadow: navy 0.1em 0.1em 0.2em
}

select {
	font-size: 18px;
	font-style: italic;
	color: blue;
}

option {
	font-size: 12px;
	font-style: normal;
	color: black;
}

.container {
	width: 650px;
}

.airbus-thumbnail {
	transition-property: background;
	background: #f0d011;
	transition-duration: 0.25s;
}

.airbus-thumbnail:hover {
	background: #161616;
}

.boeing-thumbnail {
	transition-property: background;
	background: #ea5140;
	transition-duration: 0.25s;
}

.boeing-thumbnail:hover {
	background: #161616;
}

.douglas-thumbnail {
	transition-property: background;
	background: #008984;
	transition-duration: 0.25s;
}

.douglas-thumbnail:hover {
	background: #161616;
}
</style>

<body>
	<h1>Carl's and Jasiel's Aircrafturers</h1>
	<div class="block block-projects-breaker">
		<h2>SELECT AIRCRAFT MANUFACTURER</h2>
	</div>
	<!---<div style="float: left">
			<img src="images/logo.png" style="width: 250px; height: 250px;">
		</div>
		<div style="float: right">
			<h3>The aircraft manufacturers are:</h3>
			<ul style="list-style-type: circle">
				<li>Airbus</li>
				<li>Boeing</li>
				<li>McDonnell Douglas</li>
			</ul>
			<br />--->
	<form action='procacmanufacturerselection.html' method='post'>
		<div class="row" style="padding: 50px">
			<div class="col-md-4">
				<a href="indexAirbus.jsp"> <img alt="Airbus Logo"
					src="images/airbus_logo_white.png" width="100%"
					class="airbus-thumbnail" />
				</a>
			</div>
			<div class="col-md-4">
				<a href="indexBoeing.jsp"> <img alt="Boeing Logo"
					src="images/boeing_logo_white.png" width="100%"
					class="boeing-thumbnail" />
				</a>
			</div>
			<div class="col-md-4">
				<a href="indexDouglas.jsp"> <img alt="Douglas Logo"
					src="images/mcdoug_logo_white.png" width="100%"
					class="douglas-thumbnail" />
				</a>
			</div>
		</div>
		<!---<p>
			Select Aircraft Manufacturer: <br /> <select
				name='selectedManufacturer'>
				<option value="AIRBUS">Airbus</option>
				<option value="BOEING">Boeing</option>
				<option value="DOUGLAS">McDonnell Douglas</option>
			</select> &ensp; <input type='submit' value='Select' class="btn btn-success"
				style="float: right" />
		</p>--->
	</form>
</body>
</html>