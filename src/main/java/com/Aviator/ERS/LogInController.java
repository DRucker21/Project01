package com.Aviator.ERS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.log4j.Logger;

import com.Aviator.ERS.dao.LoginDAO;
import com.Aviator.ERS.dao.LoginDAOImpl;

/**
 * Servlet implementation class LogInController
 */
public class LogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//private static Logger log = Logger.getLogger(LogInController.class);
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

			out.println("<h1>Welcome :"+uname);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ManagerHome.jsp");
			dispatcher.include(request, response);
		}
		else {
			session.setAttribute("message", "Invalid User");

			out.println("<h1>Your username/password is incorrect , Please <a href=LogIn.html>login</a> again");
		}
		out.println("</body></html>");
	}

}
