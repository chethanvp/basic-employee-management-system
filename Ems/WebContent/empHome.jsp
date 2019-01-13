<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Home</title>
</head>
<body align="center" background="back.jpg">
<%@ page import="javax.servlet.*"%>


<h1 style="text-align:center;">Employee management system</h1></br>
<h1 style="text-align:center;">Employee Home</h1><br><br>

<div align="center">
		<table cellspacing="30" border="1"><tr>
					
					<td><a href="empReportonly.jsp"><button>Your Report</button></a></td>
				</tr>
				
				<tr>
					
					<td><a href="salReportonly.jsp"><button>Salary Report</button></a></td>
				</tr>
				
				<tr>
					
					<td><a href="TimesheetReportonly.jsp"><button>Timesheet Report</button></a></td>
				</tr>
				
				<tr>
					
					<td><a href="LeaveReportonly.jsp"><button>Leave Report</button></a></td>
				</tr>
		</table>	
		</br>
<a href="empLogin.jsp"><button>logout</button></a>	
	</div>
</body>
</html>