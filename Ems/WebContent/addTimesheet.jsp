<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add employee timesheet</title>
</head>
<body align="center" style="background-color: #70819b">
	<h1 style="text-align: center;">Employee management system</h1>
	<h2 align="center">Add Employee Timesheet</h2>
	</br>
	</br>
	<center>
		<form action="" method="post">
			</br>Timesheet ID:<input type="text" name="timeID" required></br>
			</br>Employee ID:<input type="text" name="empID" required></br>
			</br>start date:<input	type="text" name="timestartdate" required></br>
			</br>Total hours<input type="text" name="timetotalhours" required></br> 
			</br>Task Name<input type="text" name="timetask" required></br>
			</br>Task Description<input type="text" name"timeDescription" required></br></br>
			<button>Submit</button>
		</form>
	</center>

</body>
</html>