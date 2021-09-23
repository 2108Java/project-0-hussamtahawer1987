//package com.revature.postgres;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class MySql {
//	
//	private static final String URL = "jdbc:postgresql://database-1.c7sdptcxvhco.us-east-2.rds.amazonaws.com/postgres";
//	private static final String USERNAME = "postgres";
//	private static final String PASSWORD = "Farah718$$";
//	
////	public Connection getConnection() throws SQLException {
////		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
////			return conn;
//
//	private void connect() {
//		try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);){
//			if(connection !=null) {
//				System.out.println("Connected to the DB");
//			}else {
//				System.out.println("Failed connection");
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//		
//		public static void main(String[] args) {
//			MySql sqlconnect = new MySql();
//			sqlconnect.connect();
//			
//			
////			UserDao userdao = new UserDaoImpl();
////			userdao.selectUserByUsername(null);
////			
////			Presenation presentation =new presenationImpl();
////			presentation.display();
//
//		}}
//	
