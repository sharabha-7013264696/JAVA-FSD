import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupsuccess")
public class Signupservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse resp) {
		String username=request.getParameter("username");
		String pass =request.getParameter("password");
		PrintWriter writer = null;
		try {
			writer = resp.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.setContentType("text/html");
		writer.append("hi" + username);
		
	}
	

}
