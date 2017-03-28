package com.baitaptuan.servlet.handlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppErrorHandler
 */
@WebServlet("/AppErrorHandler")
public class AppErrorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppErrorHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Error Handler Get");
		handleError(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Error Handler Post");
		handleError(request,response);
	}
	
	private void handleError(HttpServletRequest req, HttpServletResponse res) throws IOException{
		System.out.println("huynh");
		// Analyze servlet exception
		Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");
		String serverName = (String) req.getAttribute("javax.servlet.error.server_name");
		String requestURI = (String) req.getAttribute("javax.servlet.error.request_uri");
	    Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
	    
	    PrintWriter printWriter = res.getWriter();
	    printWriter.println("<html><head><title>Error page</title></head><body>");
	    if(statusCode != 505){
	    	printWriter.println("You've entered a error!!! Error Detail:");
	    	printWriter.println("<br><strong>Status code:</strong> " + statusCode);
	    	printWriter.println("<br><strong>Request Uri:</strong> " + requestURI);
	    	
	    }else{
	    	  printWriter.write("<h3>Exception Details</h3>");
	    	  printWriter.write("<ul><li>Servlet Name:"+serverName+"</li>");
	    	  printWriter.write("<li>Exception Name:"+throwable.getClass().getName()+"</li>");
	    	  printWriter.write("<li>Requested URI:"+requestURI+"</li>");
	    	  printWriter.write("<li>Exception Message:"+throwable.getMessage()+"</li>");
	    	  printWriter.write("</ul>");
	    }
	    printWriter.write("<br><br>");
	    printWriter.write("<a href=\"/Baitaptuan2/Login\">Login Page</a></body>");
		
	}

}
