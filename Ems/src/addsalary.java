

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
 * Servlet implementation class addsalary
 */
@WebServlet("/addsalary")
public class addsalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addsalary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			int salaryID = Integer.parseInt(request.getParameter("salID"));
			int employeeID=Integer.parseInt(request.getParameter("empID"));
			String salaryDate=request.getParameter("salaryDate");
			String salaryAmt=request.getParameter("salaryamt");
			
			response.setContentType("text/html");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			String SQL="insert into salary values(?,?,?,?);";
			
			
			PreparedStatement pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,salaryID);
			pstmt.setInt(2,employeeID);
			pstmt.setString(3,salaryDate);
			pstmt.setString(4, salaryAmt);
			
			pstmt.executeUpdate();
			
			response.sendRedirect("adminHome.jsp");
			
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
