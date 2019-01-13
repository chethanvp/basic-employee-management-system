<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Report</title>
</head>
<body style="background-color:#A9A9A9">

<h1 style="text-align:center;">Employee management system</h1></br>
<h1 style="text-align:center;">Department Report</h1>

 <%@ page language="java" %>
        <%@ page import="java.sql.*" %>
         <%@ page import="java.io.*" %>
         
     <div align="center">
     <form method="post">
     <table border="2">
     <tr>
     	<td>Department ID</td>
     	<td>Department Name</td>
     	<td>Department Manager</td>
     	
     </tr>
     
     <%
     	try
     	{
     		String SQL="select * from Department";
     		Class.forName("com.mysql.jdbc.Driver");
     		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");
     		Statement stmt=con.createStatement();
     		ResultSet rs=stmt.executeQuery(SQL);
     		while(rs.next())
     		{
     	%>
     		<tr>
     			<td><%= rs.getInt(1) %></td>
     			<td><%= rs.getString(2) %></td>
     			<td><%= rs.getString(3) %></td>
     			
     		</tr>
     		<%} %>		
     </table>
     <%
     	rs.close();
     	stmt.close();
     	con.close();
     	}
     catch(Exception e){
    	 e.printStackTrace();
     }
     %>
     </form></br></br>
     <a href="adminHome.jsp"><button>Back</button></a>
     
     </div>
</body>
</html>	