package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static PreparedStatement pst = null;
	
	public void init(ServletConfig config) throws ServletException{
		/*-- make a database connection --*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
			
			pst = con.prepareStatement("select * from users where username=? and password=?");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*-- get form data --*/
		String uid = request.getParameter("txt_uid");
		String pwd = request.getParameter("txt_pwd");		
		
		/*-- authentication steps --*/
		try {
			pst.setString(1, uid);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("welcome");
				dispatcher.forward(request, response);
			}else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<p style=text-align:center;font-size:20px;color:yellow>Invalid User Name/ Password</p>");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
				dispatcher.include(request, response);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
