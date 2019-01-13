

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
 * Servlet implementation class addDept
 */
@WebServlet("/addDept")
public class addDept extends HttpServlet {
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

			int deptID = Integer.parseInt(request.getParameter("deptID"));
			String deptName=request.getParameter("deptName");
			String deptManager=request.getParameter("deptManager");
			
			response.setContentType("text/html");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			String SQL="insert into Department values(?,?,?);";
			
			
			PreparedStatement pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1, deptID);
			pstmt.setString(2,deptName);
			pstmt.setString(3,deptManager);
			
			pstmt.executeUpdate();
			
			response.sendRedirect("adminHome.jsp");
			
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
