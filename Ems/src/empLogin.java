

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/empLogin")
public class empLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			String loginID=request.getParameter("LoginID");
			String password=request.getParameter("password");
			
			PrintWriter pw=response.getWriter();
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from employee where employeeID="+loginID+" and EmployeePassword='"+password+"'");
			if(rs.next()) {
				HttpSession session=request.getSession();  
		        session.setAttribute("ID",loginID);  
				response.sendRedirect("empHome.jsp?msg=login successful");
			}
			else {
				response.sendRedirect("../empLogin.jsp?msg=login unsuccessful");;
			}
			con.close();
		} catch (Exception e) {
			response.sendRedirect("empLogin.jsp");
		}
	}

}
