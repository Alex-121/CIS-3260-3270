package edu.gsu.cis3270.chapter04;
/*(Check SSN) 
 * Write a program that prompts the user to enter a Social Security number 
 * in the format DDD-DD-DDDD, where D is a digit. 
 * Your program should check whether the input is valid.
 */

import java.util.Scanner;
public class Exercise04_21 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Socical Security number in this format: DDD-DD-DDDD where D is a digit.");
		String userSocial = in.nextLine();
		
		/* ok so one way to do this is to get the sub string of the input and make sure they are all digits. 
		 * substring one = 0-2; 4-5; 7-10
		 * i can concat all of those then simply  Character.isdigit
		 * forget ^ just do char.isDigit(charAt()) ect for them all. Does with same without the need of a sub string
		 * do a very long if statement with all the variables
		 * there also must be 11 spots? 9 digits plus the dashes
		 */
		if ((userSocial.length() == 11) && 
			(Character.isDigit(userSocial.charAt(0))) &&
			(Character.isDigit(userSocial.charAt(1))) &&
			(Character.isDigit(userSocial.charAt(2))) &&
			(userSocial.charAt(3) == '-') && 
			(Character.isDigit(userSocial.charAt(4))) &&
			(Character.isDigit(userSocial.charAt(5))) &&
			(userSocial.charAt(6) == '-') &&
			(Character.isDigit(userSocial.charAt(7))) &&
			(Character.isDigit(userSocial.charAt(8))) &&
			(Character.isDigit(userSocial.charAt(9))))
			
			System.out.println(userSocial + " is a vaild Social Security number.");
		
		else
			System.out.println(userSocial + " is invalid Social Security number.");
		
		in.close();
	}
	
}
