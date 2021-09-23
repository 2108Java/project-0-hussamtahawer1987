package com.revature.models;

import java.util.Scanner;

public class Account {
	private int accountNumber;
	private int balance;
	private int previousTransaction;
	private boolean active;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, int balance, boolean active) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.active = active;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
//	public static void doDeposit(Account accounts [], int count, Scanner keyboard) {
//		System.out.println("Please Enter Account Number");
//		int accountNumber = keyboard.nextInt();
//		
//		int index = searchAccount(accounts, count, accountNumber);
//		if(index >= 0) {
//			
//			System.out.printf("Please Enter Deposit Amount!", + accountNumber);
//			int amount = keyboard.nextInt();
//			
//			accounts[index].deposit(amount);		
//		}else {
//			System.out.printf("No Account Exist With this Account Number: ", + accountNumber);
//			
		
//	}		
//private void deposit(int amount) {
//		// TODO Auto-generated method stub
		
	
//private static int searchAccount(Account[] accounts, int count, int accountNumber2) {
//		// TODO Auto-generated method stub
//		return 0;
	
//	public void createNewAccount(){
//		this.createNewAccount();
//		
//	}
				
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", active=" + active + "]";
	}
	public Scanner setBalance() {
		
		return null;
	}
	
	public void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
		
	}
	

}
