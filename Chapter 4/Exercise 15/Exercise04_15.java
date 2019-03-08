package edu.gsu.cis3270.chapter04;
/*(Phone key pads)
 * Write a program that prompts the user to enter a letter and displays its corresponding number. For a non-letter input, display invalid input.
 */

import java.util.Scanner;
public class Exercise04_15 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String userIn = in.nextLine().toUpperCase();
		
		char characterIn = userIn.charAt(0);
		/*
		 * Switch is an option but I would have to do it for the entire alphabet. if else's could work.
		 * would have to compare input to a letter. Like the if in 4.13 
		 * edit: must be in descending order, if in ascending order the output is not correct. even if you flip the greater than signs
		 */
		int number = 0;
		if(Character.isLetter(characterIn)) {
			if(characterIn >= 'W')
				number = 9;
			else if(characterIn >= 'T')
				number = 8;
			else if(characterIn >= 'P')
				number = 7;
			else if(characterIn >= 'M')
				number = 6;
			else if(characterIn >= 'J')
				number = 5;
			else if(characterIn >= 'G')
				number = 4;
			else if(characterIn >= 'D')
				number = 3;
			else if(characterIn >= 'A')
				number = 2;
			
			System.out.println("The corresponding number is " + number);
		}
		
		else
			System.out.println(characterIn + " is invalid.");
		
		
	in.close();	
	}
	
}
