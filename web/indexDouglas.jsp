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
	background-image: url(images/MDDOUGLAS.jpg);
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
}
</style>
<body class="container">
	<h1>
		<img src="images/logo.png" style="width: 50px; height: 50px;">
		Carl's and Jasiel's<br />Aircrafturers
	</h1>
	<h2>McDonnel Douglas Selection</h2>
	<fieldset>
		<h3>The aircraft types by McDonnell Douglas are:</h3>
		<ul style="list-style-type: circle">
			<li>McDonnell Douglas DC-8</li>
			<li>McDonnell Douglas DC-9</li>
			<li>McDonnell Douglas DC-10</li>
			<li>McDonnell Douglas MD-80</li>
			<li>McDonnell Douglas MD-90</li>
			<li>McDonnell Douglas MD-11</li>
		</ul>
		<br />
		<form action='procaircrafttype.html' method='post'>
			<p>
				Select the aircraft type: <select name='selectedAircraftType'>
					<option value="DC8">DC-8</option>
					<option value="DC9">DC-9</option>
					<option value="DC10">DC-10</option>
					<option value="MD80">MD-80</option>
					<option value="MD90">MD-90</option>
					<option value="MD11">MD-11</option>
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