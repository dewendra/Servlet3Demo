package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationPage
 */
@WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter s=response.getWriter();
		s.write("<form action='WelcomePage.htm' method='POST' >");
		s.write("<html>");
		s.write("<Body>");
		s.write("<h1><b>Registration Page!</b></h1><br>");
		s.write("<form>");
		s.write("<br>First Name: <input type='text' placeholder='John' size='20' maxlength='20' fname='firstname' ><br>");
		s.write("<br>Last Name: <input type='text'placeholder='Smith' size='20' maxlength='10' lname='lastname'> <br>");
		s.write("<br>User Name: <input type='text'placeholder='web username'size='20' maxlength='20' name='username'> <br>");
		s.write("<br>Password: <input type='password' name='password'> <br>");
		s.write("<br>Mobile No.: +91 <input type='number' placeholder='Mobile Number' mobile='mobileno'> <br>");
		s.write("<br>Birthday: <input type='text' dob='birthday'> <br>");
		s.write("<br><b><input type='submit'> ");
		s.write("<br><br><button type='button' onclick='alert('Hello world!')'>Submit</button>");
		s.write("</form>");

		//s.write("<p>sbdcdbckdi</p>");
		//s.write("<title>Register Page</title>");
		//s.write("<b><br><br>This is my first Servlet Page On Servlet 3.0");
		
		//s.write("<b><br><br>This is my Second change in my first Servlet Page On Servlet 3.0");
		//s.write("<b><br><br>This is my Second change in my first Servlet Page On Servlet 3.0");

		//s.write("</title>");

		s.write("<Body");

		s.write("</html");
		s.flush();
		s.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
