<%@page import="com.ustglobal.retailerproductapp.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Buy Product</legend>
	<form action="./buy" method="post">
		<a href="./home">Home</a> 
		<a href="./logout" style="float: right">Logout</a>
		<%
			Product product = (Product) request.getAttribute("product");
		%>
		<table>
			<tr>
				<th>Pname</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Buy</th>
			</tr>
			<tr>
				<td><%=product.getPname()%></td>
				<td><%=product.getPrice()%></td>
				<td><input type="number" name="quantity"></td>
				<td><button type="submit">Buy</button></td>
			</tr>
		</table>
	</form>
	</fieldset>
</body>
</html>