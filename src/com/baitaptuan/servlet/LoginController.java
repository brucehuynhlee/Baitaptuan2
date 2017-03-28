package com.baitaptuan.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.baitaptuan.servlet.dataFactory.UserFactory;
import com.baitaptuan.servlet.javabeans.User;
/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns={"/Login"})
public class LoginController extends BasicController {
	private static final long serialVersionUID = 1L;
    static Logger logger = Logger.getLogger(LoginController.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
        if(session == null || session.getAttribute("id") == null){
        	System.out.println("Login");
       	    response.sendRedirect("login.jsp");
        }else{
        	System.out.println("ShowUser");
       	    response.sendRedirect("ShowUser");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = (String) request.getParameter("Username");
		String password = (String) request.getParameter("Password");
		System.out.println("Login Post:" + username + ":" + password);
		ArrayList<String> errorMsg = new ArrayList<String>();
		request.setAttribute("errorMessages", errorMsg);
		if(username == null || username.equals("")){
			errorMsg.add("Username can't empty.");
		}
		if(password == null || password.equals("")){
			errorMsg.add("Password cant't empty");
		}
		
		if(errorMsg.size() > 0){
			System.out.println(errorMsg);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);	
		}else{
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				ps = getConnection().prepareStatement("select * from Users where user_name = ? and pass_word = ? LIMIT 1");
				ps.setString(1,username);
				ps.setString(2, password);
				rs = ps.executeQuery();
				
				if(rs != null && rs.next()){
					User user = new User();
					user.setId(rs.getInt("id"));
					user.setFirstName(rs.getString("first_name"));
					user.setLastName(rs.getString("last_name"));
					user.setAge(rs.getInt("age"));
					user.setAddress(rs.getString("address"));
					user.setEmail(rs.getString("email"));
					
					HttpSession session = request.getSession();
					session.setAttribute("id", user.getId());
					session.setMaxInactiveInterval(60*30);
					
					
					System.out.println("Login success");
					logger.info("User found with name:" + user.getFirstName() + user.getLastName());
					response.sendRedirect("ShowUser");
				}else{
					logger.error("User not found with username=" + username);
					System.out.println("User not found with username=" + username);
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
					errorMsg.add("User not found, if you are new user, go <a href=\"register.jsp\">register page</a>");
					dispatcher.forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
			}
			
		}
	}

}
