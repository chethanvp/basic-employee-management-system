<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body align="center" style="background-color: #70819b">
<%@ page import="javax.servlet.*"%>


<h1 style="text-align:center;">Employee management system</h1></br>
<h1 style="text-align:center;">Admin Home</h1><br><br>


 <% if(session.getAttribute("ID")==null) {
			%>
            <a href="adminLogin.jsp">Login</a>
            <%} else {
				%>
                <a href="logout.jsp">Logout</a>
                <%}%>

	<div align="center">
		<table cellspacing="50" border="1"><tr>
					<td><a href="empRegister.jsp"><button>Add Employee</button></a></td>
					<td><a href="empReport.jsp"><button>Employee Report</button></a></td>
				</tr>
				
				<tr>
					<td><a href="AddEmpSalary.jsp"><button>Add Employee Salary</button></a></td>
					<td><a href="salReport.jsp"><button>Salary Report</button></a></td>
				</tr>
				
				<tr>
					<td><a href="addDepartment.jsp"><button>Add department</button></a></td>
					<td><a href="deptReport.jsp"><button>Department Report</button></a></td>
				</tr>
				
				<tr>
					<td><a href="addTimesheet.jsp"><button>Add Employee Timesheet</button></a></td>
					<td><a href="TimesheetReport.jsp"><button>Timesheet Report</button></a></td>
				</tr>
				
				<tr>
					<td><a href="addLeave.jsp"><button>Add Employee Leave</button></a></td>
					<td><a href="leaveReport.jsp"><button>Leave Report</button></a></td>
				</tr>
		</table>		
	</div>
</body>
</html>