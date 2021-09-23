package com.revature.models;

import java.util.List;

public class User {
	
	private int accountNumber;
	private String username;
	private String password;
	
	private String name;
	private List<Account> accountList;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int accountNumber, String username, String password, String name, List<Account> accountList) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
		this.name = name;
		this.accountList = accountList;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	@Override
	public String toString() {
		return "User [accountNumber=" + accountNumber + ", username=" + username + ", password=" + password + ", name="
				+ name + ", accountList=" + accountList + "]";
	}
	
	
	

}
