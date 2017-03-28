package com.baitaptuan.servlet.dataFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.baitaptuan.servlet.javabeans.User;

public class UserFactory extends BasicFactory {

	public UserFactory(Connection conn) {
		super(conn);
	}

	public boolean addUser(User user) {
		if (user == null) {
			return false;
		}
		String sql = "Insert into Users values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 0);
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getPassWord());
			ps.setString(8, user.getUserName());
			ps.setString(9, user.getSchool());
			ps.setString(10, user.getClassSchool());
			ps.setString(11, user.getFavourite());
			ps.setString(12, user.getArchivement());
			ps.setString(13, user.getResearch());
			ps.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		String sql = "Update Users Set " + "id = ?, " + "first_name = ?, " + "last_name = ?, " + "age = ?, " + "email = ?, "
				+ "address = ?, " + "pass_word = ?, " + "user_name = ?, " + "school = ?, " + "class_school = ?, "
				+ "favourite = ?, " + "archivement = ?, " + "research = ? where id = ?";
		PreparedStatement ps = null;
		System.out.println("prepare update");
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 0);
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getPassWord());
			ps.setString(8, user.getUserName());
			ps.setString(9, user.getSchool());
			ps.setString(10, user.getClassSchool());
			ps.setString(11, user.getFavourite());
			ps.setString(12, user.getArchivement());
			ps.setString(13, user.getResearch());
			ps.setInt(14, user.getId());
			ps.executeUpdate();
			System.out.println("Update Success");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getUser(int id) {
		String sql = "select * from Users where id = ? LIMIT 1";
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setEmail(rs.getString(5));
				user.setAddress(rs.getString(6));
				user.setPassWord(rs.getString(7));
				user.setUserName(rs.getString(8));
				user.setSchool(rs.getString(9));
				user.setClassSchool(rs.getString(10));
				user.setFavourite(rs.getString(11));
				user.setArchivement(rs.getString(12));
				user.setResearch(rs.getString(13));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

}
