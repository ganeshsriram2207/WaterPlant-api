package com.revature.waterplant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CansAvailable_Servlet
 */
public class CansAvailable_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CansAvailable_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Login_Controller controller = new Login_Controller();
	String json = controller.findAll();
	
	//3 . write
	PrintWriter out = response.getWriter();
	out.write(json);
	out.flush();
	
	
	}

	

}
