<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>

	<div align="center">

		<c:if test="${breakfast == 1}">
			<b>${message }</b>
			<br />
			<a href="/FoodCart/menu/breakfast">Back</a>

		</c:if>

		<c:if test="${lunch == 1}">
			<b>${message }</b>
			<br />
			<a href="/FoodCart/menu/lunch">Back</a>

		</c:if>

	</div>

</body>
</html>