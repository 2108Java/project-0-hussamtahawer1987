package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;
import com.revature.models.User;
//import com.revature.models.usersAccountNumber;
import com.revature.util.ConnectionFactory;

public class AccountDaoImpl implements AccountDao {
	
	ConnectionFactory connectionFactory = new ConnectionFactory();

	@Override
	public List<Account> selectActivitiesByAccountNumber(int accountNumber) {
//		select * from account_table where fk_user_accountnumber =1;
		String sql = "SELECT * FROM account_table WHERE fk_user_accountnumber = ?";
		
		List<Account> userAccountNumbers = new ArrayList<>();	
		
		try {
			Connection connection = connectionFactory.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps = connection.prepareStatement(sql);
			
			ps.setInt(1, accountNumber);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				userAccountNumbers.add(
						new Account(rs.getInt("account_accountNumber"),
								rs.getInt("account_balance"),
										rs.getBoolean("active")));
						
				
			}
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return userAccountNumbers;
	}

}


