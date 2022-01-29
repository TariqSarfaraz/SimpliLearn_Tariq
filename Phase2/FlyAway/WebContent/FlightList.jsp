<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Flight List</title>
</head>
<body >
	<br>
		<h1 align = "center"><a href=index.jsp style="color:black;text-decoration:none;font-size:35px;font-weight:bold;">FlyAway</a></h1>
	<br><br>
	<%
		@SuppressWarnings("unchecked")
		List<String[]> flights=(List<String[]>)session.getAttribute("flights");
		System.out.println(flights.toString());
		if(flights!=null){
	%>
	
	<h1>Available Flights</h1>
	
	<center>
		<table border="1">
		<tr>
			<th>Name</th>
			<th>Departure Time</th>
			<th>Arrival Time</th>
			<th>Price</th>
			<th>Book Now</th>
		</tr>
		
		
		
		<%
			for(String[] flight:flights){
		%>
		
		<tr>
		<td><%=flight[0]%></td>
		<td><%=flight[1]%></td>
		<td><%=flight[2]%></td>
		<td><%=flight[3]%></td>
		<td><a href=BookFlight.jsp?id=<%=flight[4]%>>Book Now</a></td>
		</tr>
		
	</center>
	
	<%
		}
	%>
	
	</table>
	
	<%
		}
		else{
	%>
	<h1>There are no available flights</h1>
	<%
		}
	%>
</body>
</html>