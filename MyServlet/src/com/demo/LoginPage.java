package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter login = response.getWriter();
		login.write("<html>");
		login.write("<title>Login Page !</title>");
		login.write("<body>");
		login.write("<form action='WelcomePage.htm' method='POST' >");
		
		login.write("Enter User Name <input type='text' name='username'> <br>");
		login.write("Enter Password <input type='password' name='password'> <br>");
		login.write("<input type='submit' value='Submit'> ");
		login.write("</body>");
		login.write("</html>");
		login.flush();
		login.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter s1 = response.getWriter();
		s1.write("Your request is received");
		s1.flush();
		s1.close();
	}

}
