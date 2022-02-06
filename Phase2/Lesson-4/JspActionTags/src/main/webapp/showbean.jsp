<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="productBean" class="com.phase2.Product" scope="session"></jsp:useBean>
        Product Id:    <jsp:getProperty name="productBean" property="id" />  <br>
        Product Name:    <jsp:getProperty name="productBean" property="name" />  <br>
	

</body>
</html>