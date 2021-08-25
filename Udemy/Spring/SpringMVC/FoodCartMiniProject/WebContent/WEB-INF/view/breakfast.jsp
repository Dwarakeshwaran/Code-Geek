<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Breakfast</title>
</head>
<body>

	<h1>${heading}</h1>

	<h3>${foodItems}</h3>

	<c:forEach items="${foodItems}" var="item">

		<div>${item.getItemName()} - ${item.getPrice()}</div>

	</c:forEach>



</body>
</html>