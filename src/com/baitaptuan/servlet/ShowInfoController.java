package com.baitaptuan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.baitaptuan.servlet.dataFactory.UserFactory;

/**
 * Servlet implementation class ShowInfoController
 */
@WebServlet("/ShowUser")
public class ShowInfoController extends BasicController {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowInfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ShowInfoController");
		HttpSession session = request.getSession();
		int id = (int)session.getAttribute("id");
		basicFactory = new UserFactory(getConnection());
		request.setAttribute("user", basicFactory.getUser(id));
		getServletContext().getRequestDispatcher("/user/view_user.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
