package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String htmlContent = "<html><body style=background-color:lightgreen;text-align:center>"
								+ "<h2>edureka limited</h2>"
								+ "<img src=images/edureka.png width=250px height=140px><hr>"
								+ "<p style=text-align:left>Hello, "+request.getParameter("txt_uid")+"</p><hr>"
								+ "</body></html>";
								
		out.println(htmlContent);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
