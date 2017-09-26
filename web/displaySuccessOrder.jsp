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
<title>Confirm Order</title>
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
}
</style>

<body class="container">
	<h1>
		Carl's and Jasiel's Aircrafturers <img src="images/logo.png"
			style="width: 50px; height: 50px;">
	</h1>
	<h2><%=aircraft.viewModel()%></h2>
	<br />
	<br />
	<p style="text-align: center;">
		You have successfully ordered
		<%=aircraft.viewModel()%>.
	</p>
	<!--<p>
		<b>Your current budget is now at: </b>
	</p>-->
	<br />
	<br />
	<form action="index.jsp" style="text-align: center;">
		<input type="submit" class="btn btn-primary" value="Order Again">
	</form>
</body>
</html>