<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lunch</title>
</head>
<body>

	<div align="center">

		<h1>Lunch Items Info</h1>
		<hr />

		<table border="1">

			<thead>
				<tr>
					<td><b>Food</b></td>
					<td><b>Price</b></td>
				</tr>
			</thead>

			<c:forEach items="${lunchItems}" var="item">
				<tr>
					<td>${item.getItemName()}</td>
					<td>${item.getPrice()}</td>
				</tr>

			</c:forEach>

		</table>
		<br /> <br />

		<form action="/FoodCart/menu/lunch/cart">
			<label for="lunchNames">Food Name</label> <input id="lunchNames"
				type="text" placeholder="Enter food Items..." name="lName">
			<label for="lunchQuantity">Qty.</label> <input id="lunchQuantity"
				type="text" size="5" name="quantity"> <input type="submit"
				value="Add to Cart">
		</form>
		<br />

		<form action="/FoodCart/menu/lunch/checkout">
			<input type="submit" value="Buy Now">
		</form>
		<br /> <a href="/FoodCart/">Back</a>

	</div>


</body>
</html>