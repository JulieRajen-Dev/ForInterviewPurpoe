package com.login_registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login_registration.model.DAOService;
import com.login_registration.model.DAOServiceImpl;


@WebServlet("/verifylogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//classupcasting
		DAOService service= new DAOServiceImpl();
		service.connectDB();
		
		boolean status= service.verifyCredentials(username, password);
		System.out.println(status);
		if (status==true) {
		
			request.getRequestDispatcher("/WEB-INF/Views/welcomepage.jsp").forward(request, response);
		}
		else {
			//System.out.println("invalid");
			request.setAttribute("error", "Invalid Username/password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
		}
	}

		 
		
		

	
