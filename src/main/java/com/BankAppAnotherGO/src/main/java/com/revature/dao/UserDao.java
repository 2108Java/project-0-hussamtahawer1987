package com.revature.dao;

import com.revature.models.Account;
import com.revature.models.User;

public interface UserDao {

	User selectUserByUsername(String username);
	User setUserName(String username);
	User setPasword(String password);
	
}
