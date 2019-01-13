<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pay Salary</title>
</head>
<body align="center" style="background-color: #70819b">
	<h1 style="text-align: center;">Employee management system</h1>
	<h2 align="center">Pay Employee Salary</h2>
	</br>
	</br>
	<center>
		<form action="/addsalary" method="post">
			</br>Salary ID:<input type="text" name="salID" required></br> </br>Employee
			ID:<input type="text" name="empID" required></br> </br> Salary date:<input
				type="text" name="salarydate" required></br> </br> Salary Amount:<input
				type="text" name="salaryamt" required></br> </br>

			<button>Submit</button>
		</form>
	</center>
</body>
</html>