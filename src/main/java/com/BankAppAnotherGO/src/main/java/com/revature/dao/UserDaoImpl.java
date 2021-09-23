package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class UserDaoImpl implements UserDao {
	ConnectionFactory connectionFactory = new ConnectionFactory();

	@Override
	public User selectUserByUsername(String username) {
		
		
		String sql = "SELECT * FROM user_table WHERE username = ?";
		
		PreparedStatement ps;
		
		
		User u = new User();
		try {
			Connection connection = connectionFactory.getConnection();
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			
//			System.out.println("Querry Executed");
//			System.out.println(ps.toString());
			
			while(rs.next()) {
				u.setAccountNumber(rs.getInt("user_accountnumber"));
				u.setName(rs.getString("user_real_name"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("user_password"));
//				u.setAccountNumber(0);
				
				
				
			}
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return u;
	}

	@Override
	public User setUserName(String username) {
		String sql = "INSERT INTO user_table WHERE username = ?";
		
		PreparedStatement ps;
		
		
		User u = new User();
		try {
			Connection connection = connectionFactory.getConnection();
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			
//			System.out.println("Querry Executed");
//			System.out.println(ps.toString());
			
			while(rs.next()) {
				u.setAccountNumber(rs.getInt("user_accountnumber"));
				u.setName(rs.getString("user_real_name"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("user_password"));
//				u.setAccountNumber(0);
				
				
				
			}
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return u;
	}

	@Override
	public User setPasword(String password) {		
		
	String sql = "INSERT INTO user_table WHERE username = ?";
	
	PreparedStatement ps;
	
	
	User u = new User();
	try {
		Connection connection = connectionFactory.getConnection();
		
		ps = connection.prepareStatement(sql);
		
		ps.setString(1,password);
		
		ResultSet rs = ps.executeQuery();
		
//		System.out.println("Querry Executed");
//		System.out.println(ps.toString());
		
		while(rs.next()) {
			u.setAccountNumber(rs.getInt("user_accountnumber"));
			u.setName(rs.getString("user_real_name"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("user_password"));
//			u.setAccountNumber(0);
			
			
			
		}
		
		connection.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	return u;
	}

	
	}




