

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
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			String userName=request.getParameter("LoginID");
			String password=request.getParameter("password");
			
			PrintWriter pw=response.getWriter();
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee_management_system", "root","root");

			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from user where userName='"+userName+"' and loginPassword='"+password+"'");
			if(rs.next()) {
				HttpSession session=request.getSession();  
		        session.setAttribute("ID",userName);  
				response.sendRedirect("adminHome.jsp?msg=login successful");
			}
			else {
				response.sendRedirect("adminLogin.jsp?msg=login unsuccessful");;
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
