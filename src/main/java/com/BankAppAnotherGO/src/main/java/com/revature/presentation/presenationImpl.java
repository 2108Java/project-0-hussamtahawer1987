package com.revature.presentation;

import java.util.Scanner;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.service.Authenticator;
import com.revature.service.AuthenticatorImpl;

public class presenationImpl implements Presenation {
	
	private Authenticator auth;
	
	public presenationImpl(Authenticator auth) {
		this.auth = auth;
	}

	public void welcomeMessage() {
		System.out.println("Welcome to the Bank Of Hussam! ");
		
	}
	
	public User registerMenu(Scanner keyboard) {
		User u = null;
		System.out.println("Please Create  a Username and Password");
		System.out.println("Username");
		
		String username = keyboard.nextLine();
		
		System.out.println("Password:");
		String password = keyboard.nextLine();
		
		System.out.println(username);
		System.out.println(password);
		
		u = auth.setUser(username);
		u = auth.setPassword(password);
		boolean authenticated = auth.authenticate(username,password);
		
		if(authenticated) {
		
			u = auth.getUser(username);
			
		}else {
			System.out.println("Please try again!");
		}
		return u;
	}
		



	public User loginMenu(Scanner keyboard) {
		
		System.out.println("Please login with your Username! ");
		System.out.println("Username");
		
		String username = keyboard.nextLine();
		
		System.out.println("Password:");
		String password = keyboard.nextLine();
		
		boolean authenticated = auth.authenticate(username,password);
		User u = null;
		if(authenticated) {
			
			u = auth.getUser(username);
			
		}else {
			System.out.println("Please try again!");
		}
		return u;
	}
	
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		welcomeMessage();
		boolean register = true;
		User u = null;
		while(register) {
			u = registerMenu(keyboard);
			if(u != null) {
				register = false;
				}
			}
		
		welcomeMessage();
		boolean logginIn = true;
		while(logginIn) {
			u = loginMenu(keyboard);
			if(u != null) {
				logginIn = false;
				
			}
		}
		
		System.out.println("Welcome User!");
		boolean running = true;
		
		while(running) {
			System.out.println("Here is Your Account");
			System.out.println("What would you like to do today");
//			System.out.println("1) Create a new Account");
//			System.out.println("2) Access your Account");
			System.out.println("1) Make a Deposit");
			System.out.println("2) Make a Withdrawl");
			System.out.println("3) Check last Transaction");
			System.out.println("0) Exit The Application");
			
			String input = keyboard.nextLine();
			
			switch(input) {
//			case "1":
//				createNewAccount(u, keyboard);
//				break;
//			case "2":
//				accessAccount(u, keyboard);
//				break;
			case "1":
				Account a = new Account();
				doDeposit(a, keyboard);
				break;
			case "2":
				doWithdrawl(u, keyboard);
				break;
			case "3":
				lastTransaction(u);
				break;
			case "0":
				running = false;
				break;
			default:
				System.out.println("Invalid input, Please try again!");
				}
			}
	}

	private void lastTransaction(User u) {
		// TODO Auto-generated method stub
		
	}

	private void doWithdrawl(User u, Scanner keyboard) {
		// TODO Auto-generated method stub
		
	}

	private Account doDeposit(Account a, Scanner keyboard) {
		if(a != null) {
			System.out.printf("Please Enter Deposit Amount!");
			keyboard.nextInt();
			keyboard = a.setBalance();
		
			System.out.println(a.setBalance());
		
			
			
			
			
//			System.out.println(u);
//			u.getAccountList(this.doDeposit(u, keyboard));
			
			
		}
		
		return a;

		
		// TODO Auto-generated method stub
		
//	}
//
//	private void accessAccount(User u, Scanner keyboard) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public User createNewAccount(User u, Scanner keyboard){	
//		System.out.println(u.getAccountNumber());
//		System.out.println(u.getAccountList());
//		System.out.println(u.getName());
//		System.out.println(u.getUsername());
//		
//		return u;
		
	
	
	}
		}
	
