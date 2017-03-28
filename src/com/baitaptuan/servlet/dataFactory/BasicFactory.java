package com.baitaptuan.servlet.dataFactory;

import java.sql.Connection;

import com.baitaptuan.servlet.javabeans.User;

public abstract class BasicFactory {
	protected static Connection conn = null;
	public BasicFactory(Connection conn){
		if(this.conn == null) this.conn = conn; 
	}
	public abstract boolean addUser(User user);
	public abstract boolean removeUser(User user);
	public abstract boolean updateUser(User user);
	public abstract User getUser(int id);
}
