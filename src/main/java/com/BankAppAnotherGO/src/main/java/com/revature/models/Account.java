package com.revature.models;

public class Account {
	private int accountNumber;
	private int balance;
	private String accountName;
	private boolean active;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, int balance, String accountName, boolean active) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountName = accountName;
		this.active = active;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountName=" + accountName
				+ ", active=" + active + "]";
	}
	

}
