<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
</head>
<body>
	<center>
		<h1>
			<b>RESET YOUR PASSWORD</b>
		</h1>
		<br> <br> 
		<form action="adminServlet" method="POST">

			<table style="width: 50%; margin: 0px auto;">
				<tr>
					<td><label for="oldPass" style="font-size: 15pt;">Old Password</label></td>
					<td><input type="password" name="oldPass" style="font-size: 15pt; width: 270px;" /></td>
				</tr>

				<tr>
					<td><label for="newPass" style="font-size: 15pt;">New Password</label></td>
					<td><input type="password" name="newPass" style="font-size: 15pt; width: 270px;" /></td>
				</tr>

				<tr>
					<td><label for="confirmPass" style="font-size: 15pt;">Confirm Password</label></td>
					<td><input type="password" name="confirmPass" style="font-size: 15pt; width: 270px;" /></td>
				</tr>
			</table>

			<br> <br>
			<table style="width: 20%">
				<tr>
					<td><input type="submit" value="Submit" style="font-size: 15pt; width: 86pt; background: grey" /></td>
				</tr>
			</table>
	</center>
</body>
</html>