package com.revature.waterplant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Setavailable_Cans
 */
public class Setavailable_Cans extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       Integer noOfCans = Integer.parseInt(request.getParameter("noOfCans"));
		
		
		
		//2. call controller
		Login_Controller controller = new Login_Controller();		
		String json = controller.setavailablecans(noOfCans);
		
		//3 . write
		PrintWriter out = response.getWriter();
		out.write(json);
		out.flush();
	}

	
}
