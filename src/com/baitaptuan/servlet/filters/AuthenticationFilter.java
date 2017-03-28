package com.baitaptuan.servlet.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class AuthenticationFilters
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	private Logger logger;

	/**
	 * Default constructor.
	 */
	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
		logger = Logger.getLogger(AuthenticationFilter.class);
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession(false);
		String requestUri = req.getRequestURI();

		if ((session == null || session.getAttribute("id") == null)&& !(requestUri.endsWith("register.jsp") || requestUri.endsWith("login.jsp") || requestUri.endsWith("css")
				|| requestUri.endsWith("js") || requestUri.endsWith("Register") || requestUri.endsWith("Login"))) {
			System.out.println(requestUri);
			res.sendRedirect("Login");
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		logger.info("AuthenticationFilter init success");
	}

}
