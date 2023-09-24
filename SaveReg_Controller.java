package com.login_registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login_registration.model.DAOService;
import com.login_registration.model.DAOServiceImpl;


@WebServlet("/save")
public class SaveReg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SaveReg_Controller() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("fname");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobile=request.getParameter("contact");
		Long contact=Long.parseLong(mobile);
		System.out.println(name);
		System.out.println(city);
		System.out.println(email);
		System.out.println(contact);
		
		//classupcasting
				DAOService service= new DAOServiceImpl();
				service.connectDB();
				service.saveNewRegistration(name, city, email, contact);
	}

}
