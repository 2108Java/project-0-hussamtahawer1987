package com.revature.service;

import com.revature.dao.AccountDao;
import com.revature.dao.UserDao;
import com.revature.models.User;

public class AuthenticatorImpl implements Authenticator {

	private UserDao userDao;
	private AccountDao accountDao;
	
	public AuthenticatorImpl(UserDao uDao, AccountDao aDao) {
				this.userDao = uDao;
				this.accountDao =aDao;
	}
	@Override
	public boolean register(String username, String password) {
		User u = setUser(username);
		boolean success = true;
		
		if(u != null) {
			
			if( u.getPassword() != null && u.getPassword().equals(password)) {
			success = true;}}
		return success;

}

	@Override
	public boolean authenticate(String username, String password) {
		User u = getUser(username);
		boolean success = false;
		
		if(u != null) {
			
			if( u.getPassword() != null && u.getPassword().equals(password)) {
			success = true;
		}
	}
		return success;
			
}
		

	@Override
	public User getUser(String username) {
		User u = userDao.selectUserByUsername(username);
		u.setAccountList(accountDao.selectActivitiesByAccountNumber(u.getAccountNumber()));
	
		return u;
	}

	@Override
	public User setUser(String username) {
		User u = userDao.selectUserByUsername(username);
		u.setUsername(userDao.selectUserByUsername(u.setUsername(username)));
		return u;
	}

	@Override
	public User setPassword(String password) {
		User u = userDao.selectUserByUsername(password);
		u.setPassword(userDao.selectUserByUsername(password));
		return u;	}
	}


