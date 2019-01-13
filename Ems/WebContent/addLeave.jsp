<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Leave</title>
</head>
<body align="center" style="background-color: #70819b">
	<h1 style="text-align: center;">Employee management system</h1>
	<h2 align="center">Add Leave</h2>
	</br>
	</br>
	<center>
		<form action="" method="post">
			</br>Leave ID:<input type="text" name="leaveID" required></br>
			</br>Employee ID:<input type="text" name="empID" required></br>
			</br>Leave Title<input type="text" name="leaveTitle" required></br>
			</br>Leave Description:<input type="text" name="leaveDescription" required></br>
			</br>Leave Apply Date:<input type="text" name="leaveapplydate" required></br>
			</br>Leave start date:<input type="text" name="leavestartdate" required></br>
			</br>Leave end date:<input type="text" name="leaveenddate" required></br></br>
			
			<button>Submit</button>
		</form>
	</center>
</body>
</html>