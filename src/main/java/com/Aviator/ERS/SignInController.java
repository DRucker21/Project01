package com.Aviator.ERS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Aviator.ERS.dao.LoginDAO;
import com.Aviator.ERS.dao.LoginDAOImpl;
import com.Aviator.ERS.model.User;

/**
 * Servlet implementation class SignInController
 */
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String qualification = request.getParameter("qualification");

		User user = new User(-1, username, password, qualification, gender);
		
		LoginDAO login = new LoginDAOImpl();
		login.register(user);
		
		out.println("<html><body>");
		out.println("Welcome :"+username);
		out.println("<h1>You Are Registered Successfully And Your Password is :"+password);
		out.println("<h1><a href=EmployeeLogin.html>Login</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
