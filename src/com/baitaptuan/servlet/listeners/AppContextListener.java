package com.baitaptuan.servlet.listeners;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import com.baitaptuan.servlet.javabeans.DbManager;

/**
 * Application Lifecycle Listener implementation class AppContextListener
 *
 */
@WebListener
public class AppContextListener implements ServletContextListener, ServletContextAttributeListener {

	/**
	 * Default constructor.
	 */
	public AppContextListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		Connection conn = (Connection) arg0.getServletContext().getAttribute("DBConnection");

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent contextEvent) {
		ServletContext context = contextEvent.getServletContext();
		String dbURL = context.getInitParameter("DbURL");
		String dbUser = context.getInitParameter("DbUser");
		String dbPassword = context.getInitParameter("DbPassword");
		try {
			DbManager dbManager = new DbManager(dbURL, dbUser, dbPassword);
			context.setAttribute("DBConnection", dbManager.getConnection());
			System.out.println("DBConnection created:-" + dbManager.getConnection());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String log4jConfig = context.getInitParameter("log4j-config");
		if (log4jConfig == null) {
			System.out.println("Not found initparam, Init with default config");
			BasicConfigurator.configure();

		} else {
			String webAppPath = context.getRealPath("/");
			String log4jPath = webAppPath + log4jConfig;
			File log4jFile = new File(log4jPath);
			if (log4jFile.exists()) {
				System.out.println("File Exist, init success");
				DOMConfigurator.configure(log4jPath);
			} else {
				System.out.println("File not found, init with default config");
				BasicConfigurator.configure();
			}
		}
		System.out.println("Log4j configured property");

	}

}
