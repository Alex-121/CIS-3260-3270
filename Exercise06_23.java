package edu.gsu.cis3270.chapter06;
/*(Occurrences of a specified character) 
 * Write a method that finds the number of occurrences of a specified character in a string using the following header:
 		public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. 
 * Write a test program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.
 */
import java.util.Scanner;
public class Exercise06_23 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String user = in.nextLine();
		System.out.print("Enter a character: ");
		String user1 = in.nextLine();
		char userChar = user1.charAt(0);
		
		int count =count(user, userChar);
		
		System.out.println("The number of occurrences of " + userChar + " in "
				+ user + " is " + count);
		
		in.close();
	}
	
	public static int count(String str, char a) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == a)
				count++;
		
		return count;
	}
}
