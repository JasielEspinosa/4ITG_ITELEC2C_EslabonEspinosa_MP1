<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<title>Airbus Selection</title>
</head>
<style>
body {
	background-image: url(images/AIRBUS.jpg);
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
	background-color: black;
}
</style>
<body class="container">
	<h1>
		<img src="images/logo.png" style="width: 50px; height: 50px;">
		Carl's and Jasiel's<br />Aircrafturers
	</h1>
	<h2>Airbus Selection</h2>
	<fieldset>
		<h3>The aircraft types by Airbus are:</h3>
		<table>
			<tr>
				<th>
					<ul style="list-style-type: circle">
						<li>Airbus A300</li>
						<li>Airbus A310</li>
						<li>Airbus A318</li>
						<li>Airbus A319</li>
						<li>Airbus A320</li>
					</ul>
				</th>
				<th>
					<ul style="list-style-type: circle">
						<li>Airbus A321</li>
						<li>Airbus A330</li>
						<li>Airbus A340</li>
						<li>Airbus A350</li>
						<li>Airbus A380</li>
					</ul>
				</th>
			</tr>
		</table>
		<br />
		<form action='procaircrafttype.html' method='post'>
			<p>
				Select the aircraft type: <select name='selectedAircraftType'>
					<option value="A300">A300</option>
					<option value="A310">A310</option>
					<option value="A318">A318</option>
					<option value="A319">A319</option>
					<option value="A320">A320</option>
					<option value="A321">A321</option>
					<option value="A330">A330</option>
					<option value="A340">A340</option>
					<option value="A350">A350</option>
					<option value="A380">A380</option>
				</select> <input type='reset' value='Reset' class="btn btn-warning" />
			</p>
			<input type='submit' value='Select' style="float: right;"
				class="btn btn-success" />
		</form>
		<form>
			<input TYPE="button" VALUE="Go Back" class="btn btn-danger"
				style="float: left;" onClick="history.go(-1)">
		</form>


	</fieldset>
</body>
</html>