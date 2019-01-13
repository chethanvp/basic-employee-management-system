<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new employee</title>
</head>
<body style="background-color:#4C517D">

<h1 style="text-align:center;">Employee management system</h1></br>
<h1 style="text-align:center;">Employee registration</h1>

<form action="empRegister" method="post">
	<table align="center" cellspacing="20px">
		<tr>
			<td style="color:white">Employee Name</td>
			<td><input type="text" placeholder="Employee Name" name="empname" required></td>
		</tr>
		
		<tr>
			<td style="color:white">Employee ID</td>
			<td><input type="text" placeholder="Employee ID" name="empID" required></td>
		</tr>
		
		<tr>
			<td style="color:white">Employee Phno</td>
			<td><input type="text" placeholder="Employee Phno" name="empPhno" required></td>
		</tr>
		
		<tr>
			<td style="color:white">Department ID</td>
			<td><input type="text" placeholder="Department ID" name="deptID" required></td>
		</tr>
		
		<tr>
			<td style="color:white">Employee Email</td>
			<td><input type="text" placeholder="Employee Email" name="empEmail" required></td>
		</tr>
	</table>
	
	<center><button>Submit</button></center>
</form></br></br>
    <center> <a href="adminHome.jsp"><button>Back</button></a></center>

</body>
</html>