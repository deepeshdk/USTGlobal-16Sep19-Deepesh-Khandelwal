<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<fieldset>
<legend>Login</legend>
	<form action="./login" method="post">
		<h2>${msg}</h2>
		<h3>Login Here</h3>
		<table>
		<tr>
		<td>Email:</td>
		<td><input type="text" placeholder="enter email" name="email" required="required"></td>
		</tr>
		<tr>
		<td> Password:</td>
		<td><input type="password" name="password" placeholder="enter Password" required="required"></td>
		</tr>
		<tr>
		<td><button type="submit">Login</button></td>
		<td><button type="reset">Reset</button></td>
		</tr>
		<a href="./register">Register Here</a>
		</table>
	</form>
	</fieldset>
</body>
</html>