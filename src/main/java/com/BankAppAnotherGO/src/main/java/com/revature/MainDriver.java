package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.revature.dao.AccountDao;
import com.revature.dao.AccountDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.models.User;
import com.revature.presentation.Presenation;
import com.revature.presentation.presenationImpl;
import com.revature.service.Authenticator;
import com.revature.service.AuthenticatorImpl;

public class MainDriver {
		
	public static void main(String[] args) {
		
		

		

//		
		UserDao uDao = new UserDaoImpl();
		AccountDao aDao = new AccountDaoImpl();
////		
//		System.out.println(uDao.selectUserByUsername("Niks"));
////		
//		User u = uDao.selectUserByUsername("Niks");
//		u.setAccountList(aDao.selectActivitiesByAccountNumber(u.getAccountNumber()));
////		
//		System.out.println(u);
		
		Authenticator auth = new AuthenticatorImpl(uDao,aDao);
		
		Presenation presentation =new presenationImpl(auth);
		presentation.display();
	

	}

}
