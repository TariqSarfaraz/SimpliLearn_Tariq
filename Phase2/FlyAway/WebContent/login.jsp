<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
	<br>
		<h1 align ="center"><a href=index.jsp style="color: black; text-decoration: none; font-size: 35px; font-weight: bold;">FlyAway</a></h1>
	<br>
	<br>
	<center>
		<h2>Login</h2>
		<div style="border: 2px solid black; width: 25%; border-radius: 20px; padding: 20px" align="center">
			<form action=UserLogin method=post>
				<table>
					<tr>
						<td><label for=email>Email</label><br></td>
						<td><input type="email" name=username id=username /></td>
					</tr>
					<tr>
						<td><label for=pass>Password</label><br></td>
						<td><input type="password" name=password id=pass /></td>
					</tr>

					<tr>
						<td><input type=submit value=submit /></td>
						<td><input type=reset /></td>
					</tr>
				</table>

			</form>
		</div>
	</center>
	<br>
	<br>
	New User-Create account
	<h4>
		<a href=register.jsp style="font-size: 25; color: blue;">Create Account</a>
	</h4>

	<%
	String message = (String) session.getAttribute("message");
	if (message != null) {
	%>
	<p style="color: silver;"><%=message%></p>
	<%
	session.setAttribute("message", null);
	}
	%>
</body>
</html>