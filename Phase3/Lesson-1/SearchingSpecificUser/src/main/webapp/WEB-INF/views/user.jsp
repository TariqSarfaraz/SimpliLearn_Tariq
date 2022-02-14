<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	USER DETAILS:
	<br> <br>

	${user}
	<br> <br>
	
	UPDATE USER: <br> <br>
	
	<form action="/update" method="post">
		ID: <input type="number" name="id" required="required"> <br>
		Name: <input type="text" name="name" required="required"> <br>
		Email: <input type="text" name="email" required="required"> <br> <br>
		<input type="submit">
	</form>
	<br> <br>
	
	<a href="/login">HOME</a>
	
</body>
</html>