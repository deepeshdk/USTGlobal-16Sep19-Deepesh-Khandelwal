<%@page import="com.ustglobal.retailerproductapp.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
	%>
	<fieldset>
	<legend>Update Password</legend>
	<form action="./changepassword" method="post">
	<table>
	<tr>
		<tr>
		<td>Password:</td>
		<td><input type="password" name="password"></td>
		</tr>
		<tr>
		<td>Confirm Password:</td> 
		<td><input type="password" name="confirmpassword"></td>
		</tr>
		<tr>
		<td><button type="submit">Change</button></td>
		</tr>
		</table>
	</form>
	</fieldset>
</body>
</html>