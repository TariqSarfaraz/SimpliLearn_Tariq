<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

	<h1>Product Details:</h1>
	
	<table border="1">
		<th>Product Id</th> <th>Product Name</th>
		<tr>
			<td> <%out.println(session.getAttribute("pid")); %></td> 
			<td><% out.println(session.getAttribute("pname")); %></td>
		</tr>
	</table> 
	
</body>
</html>