package edu.gsu.cis3270.chapter10;

import edu.gsu.cis3270.chapter09.Account;
import java.util.Scanner;
public class Exercise10_07 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	// an array of Account objects
	Account[] a = new Account[10];
	
	// fill each instance with a new object with id(0-9) and balance(100)  
	for(int i = 0; i < a.length; i++)
		a[i] = new Account(i, 100);
	
	// checks the id. will also not stop(loop is infinite)
	do {
	System.out.print("Enter an id: ");
	int id = in.nextInt();
		
		//if id is valid go into the menu
		if(idCheck(id, a)) {
			int userChoice;	//will save the choices 1-4
			
			do {
				
				userChoice = mainMenu(in);
				transactions(userChoice, a, id, in);
			}while(userChoice !=4);	// if user enters 4 it exits menu loop and asks for id again
		} 
		else 
			System.out.println("ID invalid");
	
	}while(true);	
	}
	
	//checks id to ensure user inputs a valid input
	public static boolean idCheck(int id, Account[] ids) {
		for(int i = 0; i < 10; i++) {
			if(id == ids[i].getId())
				return true;
		}			
		return false;
	}
	
	//main menu options
	public static int mainMenu(Scanner in) {
		System.out.print("Main Menu \n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
		
		return in.nextInt();
	}
	
	//this will let the user cycle through the menu, and do what they want. 
	public static void transactions(int a, Account[] ids, int id,Scanner in) {
		switch(a) {
		case 1: System.out.println("The current balance is: " + ids[id].getBalance()); break;
		case 2: System.out.print("Enter an ammont to withdraw: "); ids[id].withdraw(in.nextDouble()); break;
		case 3: System.out.print("Enter an ammount to deposit: "); ids[id].deposit(in.nextDouble()); break;
		}
	}

}
