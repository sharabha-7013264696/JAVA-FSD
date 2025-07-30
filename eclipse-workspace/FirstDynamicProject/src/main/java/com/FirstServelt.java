package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hi")
public class FirstServelt extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) {
		resp.setContentType("text/html");
		try {
			PrintWriter writer=resp.getWriter();
			writer.append("hi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
