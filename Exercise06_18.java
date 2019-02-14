package edu.gsu.cis3270.chapter06;
/*6.18 (Check password) Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid password. 
 * Suppose the password rules are as follows:
	A password must have at least eight characters.
	A password consists of only letters and digits.
	A password must contain at least two digits.

 *Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or Invalid Password otherwise. 
 */

import java.util.Scanner;
public class Exercise06_18 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a password that follows these guide lines: "
				+ "\n • A password must have at least eight characters. "
				+ "\n • A password consists of only letters and digits."
				+ "\n • A password must contain at least two digits.");
		
		String userInput = in.nextLine();
		
		checkPassword(userInput);
		
	in.close();	
	
	}
	
	public static void checkPassword(String pass) {
	
		int count = 0; // this is to make sure the loop goes through the length of the pass
		int digits = 0; // this keeps track of digits. there must be at least two
		boolean valid = pass.length() >= 8; // if the password has less than eight character's it it automatically invalid
		
		if(valid) {
			
			for(int i = 0; i < pass.length(); i++) { // loop enough times to check every character or digit

				if(Character.isLetterOrDigit(pass.charAt(i))) { // will check if it is letter or digit
					count++; // i need this count for later
					
					if(Character.isDigit(pass.charAt(i)) == true) // if the input happens to be a digit
						digits++; // need to count it
					
				}
						
			}	
			
				if(count == pass.length() && digits >= 2) // if the loop happened to stop because something made it no longer true it won't have correct length, thus invalid. otherwise check digits
					System.out.println("Valid Password"); // if it all checks out. gg valid password
				
				else
					System.out.println("Invalid Password");
			
		}
		
		else
			System.out.println("Invalid Password");
		
	}
	
}