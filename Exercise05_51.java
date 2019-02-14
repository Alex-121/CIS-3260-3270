package edu.gsu.cis3270.chapter05;
/* (Longest common prefix) 
 * Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings. 
 * If two strings have no common prefix, display no common prefix. 
 */
import java.util.Scanner;
public class Exercise05_51 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string one.");
		String one = in.nextLine();
		System.out.println("Enter string two.");
		String two = in.nextLine();
		
		String shared ="";
		int i = 0;
		/*to compare the strings we need to see if the prefix's are the same. charAt(i) == charAt(i) will help with that 
		 * a for loop won't really work for this because there is no real limit? so while is the better loop
		 * 
		 */
		while (one.charAt(i) == two.charAt(i)) {
			
			shared += one.charAt(i);
			i++;
		}
		if(shared.length() > 0)
			System.out.println("The shared prefix is: " + shared);
		else
			System.out.println("The strings don't have a common prefix");
		
		
		
	in.close();	
	}
	
}
