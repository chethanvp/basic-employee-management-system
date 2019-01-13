<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Leave</title>
</head>
<body align="center" style="background-color: #70819b">
	<h1 style="text-align: center;">Employee management system</h1>
	<h2 align="center">Add Department</h2>
	</br>
	</br>
	<center>
		<form action="addDept" method="post">
			</br>Department ID:<input type="text" name="deptID" required></br>
			</br>Department Name:<input type="text" name="deptName" required></br>
			</br>Department Manager:<input type="text" name="deptManager" required></br></br>
			
			<button>Submit</button>
		</form>
	</center>
</body>
</html>