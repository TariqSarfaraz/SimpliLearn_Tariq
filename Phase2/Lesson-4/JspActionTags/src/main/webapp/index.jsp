<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Using Bean
	<br>

	<jsp:useBean id="productBean" class="com.phase2.Product"
		scope="session"></jsp:useBean>
	<jsp:setProperty property="id" name="productBean" value="12" />
	<jsp:setProperty property="name" name="productBean" value="Laptop" />

	<a href="showbean.jsp">Access bean properties from another page </a>
	<br>
	<a href="forward.jsp">Use Forward action to go to Google</a>
	<br>

</body>
</html>