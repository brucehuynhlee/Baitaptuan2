package com.baitaptuan.servlet.javabeans;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DbManager {
     private Connection conn;
     public DbManager(String dbURL, String user, String password) throws ClassNotFoundException, SQLException{
    	 Class.forName("com.mysql.jdbc.Driver");
    	 this.conn = (Connection) DriverManager.getConnection(dbURL, user, password);
    	 
     }
     public Connection getConnection(){
    	 return this.conn;
     }
}
