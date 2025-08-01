package com.flm.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flm.dao.UserDao;
import com.flm.model.User;
import com.mysql.cj.xdevapi.Session;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user=new User(email,password);
		UserDao ud=new UserDao();
		boolean isValid=ud.validateUser(user);
		if(isValid) {
			HttpSession session=request.getSession();
			String name=user.getEmail().split("@")[0];
			session.setAttribute("email",name);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("EmployeesServlet");
			requestDispatcher.forward(request,response);
		}
		else {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request,response);
		}
	}

}
