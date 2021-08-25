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

	<div align="center">

		<h1>${heading}</h1>
		<hr />



		<table border="1">

			<thead>
				<td><b>Item</b></td>
				<td><b>Price</b></td>
			</thead>

			<c:forEach items="${foodItems}" var="item">

				<tr>
					<td>${item.getItemName()}</td>
					<td>${item.getPrice()}</td>
				</tr>

			</c:forEach>

		</table>

		<br />

		<form action="breakfast/checkout">

			<label for="food">Food: </label> <input name="foodName" id="food"
				type="text" placeholder="Enter the food item...">
			<button>Add to Cart</button><br />
			<br /> <input type="submit" value="Buy Now">

		</form><br />

		<a href="/FoodCart">Back</a>

	</div>

</body>

</html>