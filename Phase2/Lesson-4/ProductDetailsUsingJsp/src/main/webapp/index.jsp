<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body >

<h2>Enter Product Details:</h2>
<form action="Servlet1" method="get">
	<table>
		<tr><td>Product Id :</td><td> <input type="number" name="pid" required="true"> </td></tr>
		<tr><td>Product Name :</td> <td><input type="text" name="pname" required="true"></td></tr>
		<tr><td><input type="submit" name="Enter"></td></tr>
	</table>
</form>
</body>
</html>