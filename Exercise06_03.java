package edu.gsu.cis3270.chapter06;
/* (Palindrome integer) 
 * Write the methods with the following headers:
 	// Return the reversal of an integer, e.g., reverse(456) returns 654
			public static int reverse(int number)
 
	// Return true if number is a palindrome
			public static boolean isPalindrome(int number)
 *
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */

import java.util.Scanner;
public class Exercise06_03 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int userInput = in.nextInt();
		int reverse = reverse(userInput);
		System.out.println("The reverse is " + reverse);
		
		
		if(isPalindrome(userInput)) 
			System.out.print(userInput + " is a palindrome.");
		else
			System.out.print(userInput + " is not a palindome.");
		
	in.close();	
	}
	
	public static int reverse(int number) {
		
		int reverse = 0;
		
		while(number != 0) {
			int i = number % 10;
			reverse = reverse * 10 + i;
			number = number / 10;
		}
		
		return reverse;
			
	}
	public static boolean isPalindrome(int number) {
		
		return(number == reverse(number));
	}
	
	
}