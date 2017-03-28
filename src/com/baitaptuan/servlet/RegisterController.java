package com.baitaptuan.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.baitaptuan.servlet.dataFactory.UserFactory;
import com.baitaptuan.servlet.javabeans.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterController extends BasicController {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         HttpSession session = request.getSession(false);
         if(session == null || session.getAttribute("id") == null){
        	 response.sendRedirect("register.jsp");
         }else{
        	 response.sendRedirect("ShowUser");
         }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User)request.getAttribute("user");
		System.out.println(user.getFavourite() + user.getResearch());
        basicFactory = new UserFactory(getConnection());
		basicFactory.addUser(user);
		response.sendRedirect("Login");
	}

}
