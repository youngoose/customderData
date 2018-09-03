<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			input {
				margin: 5px;
			}
		</style>
	</head>
	<body>
	
		<form action="deleteOrder" method="post">		
			<fieldset>
				<legend>Please type the existing orderID to delete the order:</legend>
				<input type="text" name="order_id"><br>
			</fieldset>
		
			<input type="submit" value="Delete the order">
		</form>
		
		<br>
		
		<a href="cs" style="text-decoration: none">-> Check the updated database</a><br>
		<a href="newOrder.jsp" style="text-decoration: none"><- Go back to new order</a>
		
	</body>
</html>