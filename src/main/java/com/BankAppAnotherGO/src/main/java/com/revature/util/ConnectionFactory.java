package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	private static final String URL = "jdbc:postgresql://database-1.c7sdptcxvhco.us-east-2.rds.amazonaws.com/postgres";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Farah718$$";
	
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return conn;
		}
}

