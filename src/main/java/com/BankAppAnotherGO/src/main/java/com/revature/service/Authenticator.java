package com.revature.service;

import com.revature.models.User;

public interface Authenticator {

	boolean authenticate(String username, String password);
	boolean register(String username, String password);

	User getUser(String username);

	User setUser(String username);

	User setPassword(String password);

}
