
<%@page import="com.ustglobal.retailerproductapp.bean.User"%>
<%@page import="com.ustglobal.retailerproductapp.bean.Product"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
User bean =(User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg} </h3>
	<a href="./changepassword">Change Password</a>
	<a href="./order">Ordered item</a>
	<a href="./logout" style="float:right">Logout</a>
	<h2>Welcome <%=bean.getName()%></h2>

	<fieldset>
		<form action="./search" method="post">
		<table>
		<tr>
			<td><input type="text" name="pname" placeholder="enter product name"></td>
			<td><button type="submit" style="color: blue;">search</button></td>
			</tr>
			</table>
		</form>

		<%
			Product product = (Product) request.getAttribute("product");
		%>
		<%
			if (product != null) {
		%>
		<fieldset>
		<table border="2px">
			<tr>
				<th>PID</th>
				<th>Name</th>
				<th>Price</th>
				<th>Buy</th>
			</tr>
			<tr>
				<td><%=product.getPid()%></td>
				<td><%=product.getPname()%></td>
				<td><%=product.getPrice()%></td>
				<td><a href="./buy">Buy</a></td>
			</tr>
		</table>
		</fieldset>

		<%
			}
		%>
	</fieldset>

<h3 style="color: red;">${msg}</h3>
</body>
</html>