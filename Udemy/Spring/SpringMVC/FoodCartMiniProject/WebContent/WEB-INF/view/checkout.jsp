<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
</head>
<body>

	<div align="center">

		<h1>Checkout Page</h1>
		<hr />

		<h1>Your Orders</h1>
		<br />

		<table border="1">

			<tr>

				<c:forEach items="${food}" var="foodObject">
					<td>${foodObject}</td>
				</c:forEach>

			</tr>
			<tr>

				<c:forEach items="${quantity}" var="quantityObject">
					<td>${quantityObject}</td>
				</c:forEach>

			</tr>


		</table>


		<h1>Your have ordered ${size} item(s) and Total Amount is ${sum}</h1>
		<br /> <a href="/FoodCart/menu/breakfast">Back</a> <br /> <br />

		<form action="/FoodCart">
			<input type="submit" value="Done">
		</form>


	</div>

</body>
</html>