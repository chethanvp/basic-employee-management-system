

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addTimesheet
 */
@WebServlet("/addTimesheet")
public class addTimesheet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int timeID=Integer.parseInt(request.getParameter("timeID"));
			int empID=Integer.parseInt(request.getParameter("empID"));
			String timestartdate=request.getParameter("timestartdate");
			String timetotalhours=request.getParameter("timetotalhours");
			String timetask=request.getParameter("timetask");
			String timeDescription=request.getParameter("timeDescription");
			
			response.setContentType("text/html");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			String SQL="insert into timesheet values(?,?,?,?,?,?);";
			
			PreparedStatement pstmt=con.prepareStatement(SQL);
			
			pstmt.setInt(1, timeID);
			pstmt.setInt(2, empID);
			pstmt.setString(3, timestartdate);
			pstmt.setString(4, timetotalhours);
			pstmt.setString(5, timetask);
			pstmt.setString(6, timeDescription);
			
			pstmt.executeUpdate();
			
			response.sendRedirect("adminHome.jsp");
			
			
			con.close();
		} catch (Exception e) {
			response.sendRedirect("addTimesheet.jsp");
		}
	}

}
