

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/DeleteTime")
public class DeleteTime extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
try {
			
			response.setContentType("text/html");
			
			int timeID=Integer.parseInt(request.getParameter("timesheetID"));
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system","root","root");
			
			Statement stmt=con.createStatement();
			
			
			
			stmt.executeUpdate("delete from timesheet where timesheetID="+timeID);
			
			response.sendRedirect("adminHome.jsp");
		}
		catch(Exception e) {
			response.sendRedirect("deleteTime.jsp");
		}
	}

}
