

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
 * Servlet implementation class addLeave
 */
@WebServlet("/addLeave")
public class addLeave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int leaveID=Integer.parseInt(request.getParameter("leaveID"));
			int empID=Integer.parseInt(request.getParameter("empID"));
			String leaveTitle=request.getParameter("leaveTitle");
			String leaveDescription=request.getParameter("leaveDescription");
			String leaveapplydate=request.getParameter("leaveapplydate");
			String leavestartdate=request.getParameter("leavestartdate");
			String leaveenddate=request.getParameter("leaveenddate");
			
			response.setContentType("text/html");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			String SQL="insert into leavee values(?,?,?,?,?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(SQL);
			
			pstmt.setInt(1, leaveID);
			pstmt.setInt(2, empID);
			pstmt.setString(3, leaveTitle);
			pstmt.setString(4, leaveDescription);
			pstmt.setString(5, leaveapplydate);
			pstmt.setString(6, leavestartdate);
			pstmt.setString(7, leaveenddate);
			
			pstmt.executeUpdate();
			
			response.sendRedirect("adminHome.jsp");
		}
		catch(Exception e)
		{
			response.sendRedirect("addLeave.jsp");
		}
	}

}
