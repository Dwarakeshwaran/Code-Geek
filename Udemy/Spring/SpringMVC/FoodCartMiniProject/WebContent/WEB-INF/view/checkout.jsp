<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

		<table border="1">

			<thead>
				<td><b>Food</b></td>
				<td><b>Price</b></td>
			</thead>

			<tr>
				<td>${foodObject.getItemName()}</td>
				<td>${foodObject.getPrice()}</td>
			</tr>

		</table>

		<br />

		<h1>Your have ordered ${totalItems} item(s) and Total Amount is
			${foodObject.getPrice()}</h1>
		<br /> <a href="/FoodCart/menu/breakfast">Back</a>
	</div>

</body>
</html>