<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<jsp:useBean id="aircraft" type="com.aviation.model.aircraft.Aircraft"
	scope="request"></jsp:useBean>

<%@ page import="java.text.NumberFormat"%>
<%
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(2);
	nf.setMinimumFractionDigits(2);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<title>Aircraft Details</title>
</head>

<style>
body {
	background-image: url(images/Image_Background.jpg);
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
}

h4 {
	font-size: 175%;
	font-family: inherit;
	color: red;
	text-decoration: underline;
	text-shadow: -1px -1px 0 white, 1px -1px 0 white, -1px 1px 0 white, 1px
		1px 0 white;
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
	padding-top: 15px;
	padding-left: 35px;
	padding-right: 35px;
	padding-bottom: 75px;
}

.image {
	max-width: 100%;
	display: block;
    margin: 0 auto;
}
</style>

<body class="container">
	<h1>
		Carl's and Jasiel's Airfacturers <img src="images/logo.png"
			style="width: 50px; height: 50px;">
	</h1>
	<h2><%=aircraft.viewModel()%></h2>
	<div class="image">
		<b><%=aircraft.viewImage()%></b>
	</div>
	<br />
	<br />
	<form action="procorder.html" method='post'>

		<h4 align="center">
			<b><%=aircraft.displayStatus()%></b>
		</h4>

		<input type="hidden" name="acid" value=<%=aircraft.acID()%> />
		<%
			if (aircraft.acPrice() != 0) {
		%>
		<input type="submit" style="float: right;" class="btn btn-primary"
			value="Add to Cart">
		<%
			}
		%>
		<input type="button" value="Go Back" class="btn btn-danger"
			style="float: left;" onClick="history.go(-1)"> <br /> <br />
		<br />

		<p>
			<b><%=aircraft.viewDescription()%></b>
		</p>
		<br />
		<p>
			<b><%=aircraft.getDetail().displayDetail()%></b>
		</p>
		<p>
			Manufacturer: <b><%=aircraft.getDetail().displayManufacturer()%></b>
		</p>
		<p>
			Similar Models: <b><%=aircraft.viewSimilarModels()%></b>
		</p>
		<p>
			Engine Types: <b><%=aircraft.viewEngineTypes()%></b>
		</p>
		<p>
			Price: $<b><%=nf.format(aircraft.acPrice())%></b>
		</p>
		<br /> <br />
		<%
			if (aircraft.acPrice() != 0) {
		%>
		<input type="submit" style="float: right;" class="btn btn-primary"
			value="Add to Cart">
		<%
			}
		%>
		<input type="button" value="Go Back" class="btn btn-danger"
			style="float: left;" onClick="history.go(-1)">

	</form>
</body>
</html>