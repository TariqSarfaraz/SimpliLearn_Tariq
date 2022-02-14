<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Enter User ID: <br> <br>
	
    <form method="post">
        ID : <input type="number" name="id" required="required">
        <input type="submit" />
    </form> 
    
    <font color="red">${errorMessage}</font> 
</body>
</html>