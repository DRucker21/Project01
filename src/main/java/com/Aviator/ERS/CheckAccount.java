package com.Aviator.ERS;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Aviator.ERS.dao.LoginDAO;
import com.Aviator.ERS.dao.LoginDAOImpl;

/**
 * Servlet implementation class CheckAccount
 */
public class CheckAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		//log.info(uname+" Has Logged in "+new java.util.Date());
		HttpSession session = request.getSession();
		session.setAttribute("username", uname);
		
		LoginDAO loginDAO = new LoginDAOImpl();
		
		boolean result = loginDAO.validate(uname, pwd);
		
		if(result) {
			session.setAttribute("message", "Valid User");

			out.println("<h1>Welcome :"+uname+" you have a vaild account login into <a href=EmployeeLogin.hmtl>Employee Account|</a> "
											+ "or <a href=login.hmtl>Manager Account</a> ");
		}
		else {
			session.setAttribute("message", "Invalid User");

			out.println("<h1>Your username/password is incorrect , Please try again <a href=CheckAccount.html>here</a>");
		}
		out.println("</body></html>");
	}

}
