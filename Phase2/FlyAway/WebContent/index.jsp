<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
	<h1 align ="center">FlyAway</h1>

	<div align="left">
		<a href="adminPage.jsp">Admin Login</a>
	</div>

	<%
		@SuppressWarnings("unchecked")
		HashMap<String, String> user = (HashMap<String, String>) session.getAttribute("user");
		if (user != null) {
	%>
	<p>
		Welcome
		<%=user.get("name")%></p>
	<a href="Logout">Logout</a>
	<%
	} 
	else
	{
	%>
	<a href=login.jsp>User Login</a>
	<%
	}
	%>
	<br>
	<br>
	<center>
		<div style="border: 5px solid black; width: 25%; border-radius: 20px; padding: 20px" align="center">
			<form action = "FlightList" method = "post" >			
				<label for=from> Source City : </label> <input type=text name=from id=from /> <br>
				<br> <label for=to> Destination : </label> <input type=text name=to id=to /><br>
				<br> <label for=departure> Date of Travel : </label> <input type=date name=departure id=departure /><br>
				<br> <label for=travellers> No of Travellers : </label> <input type=number name=travellers id=travellers /><br>
				<br> <input type=submit value=Search /> <input type=reset />				
			</form>
		</div>
	</center>
</body>
</html>