<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Customer Confirmation</title>

<style>
.custom {
	border: solid 1px;
	padding: 10px 80px;
	width: 40%;
}
</style>
</head>

<body>
<h1>Customer Confirmation Page</h1>
	<div class="custom">
		The customer is confirmed: ${customer.firstName} ${customer.lastName}<br>
		<br> Free passes: ${customer.freePasses} <br>
		<br> Postal Code: ${customer.postalCode} <br>
		<br> Course code: ${customer.courseCode}
	</div>
</body>

</html>










