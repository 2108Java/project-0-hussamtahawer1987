package com.revature.presentation;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.service.Authenticator;

public class presenationImpl implements Presenation {
	
	private Authenticator auth;
	
	public void welcomeMessage() {
		System.out.println("Welcome to the Bank Of Hussam! ");
		
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
			System.out.println("Your are not authenticated");
			System.out.println("Please try again!");
		}
		return u;
	}
	
	public boolean registerMenu() {return false;}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		welcomeMessage();
		boolean logginIn = true;
		User u = null;
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
			System.out.println("1) Create a new Account");
			System.out.println("2) Access your Account");
			System.out.println("3) Make a Deposit");
			System.out.println("4) Make a Withdrawl");
			System.out.println("5) Check last Transaction");
			System.out.println("0) Exit The Application");
			
			String input = keyboard.nextLine();
			
			switch(input) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "0":
				break;
			default:
				}
			}
			
			}
		}
	
