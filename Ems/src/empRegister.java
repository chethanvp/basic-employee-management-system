
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class empRegister
 */
@WebServlet("/empRegister")
public class empRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public empRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			String 	empname = request.getParameter("empname");
		
			int empID = Integer.parseInt(request.getParameter("empID"));
			String empPhno=request.getParameter("empPhno");
			String deptID=request.getParameter("deptID");
			String empEmail=request.getParameter("empEmail");

			response.setContentType("text/html");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			String SQL="insert into Employee values(?,?,?,?,?);";
			
			
			PreparedStatement pstmt = con.prepareStatement(SQL);
			
			pstmt.setString(1, empname);
			pstmt.setInt(2, empID);
			pstmt.setString(3, empPhno);
			pstmt.setString(4, deptID);
			pstmt.setString(5, empEmail);
			
			pstmt.executeUpdate();
			
			response.sendRedirect("home.jsp");
			
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
