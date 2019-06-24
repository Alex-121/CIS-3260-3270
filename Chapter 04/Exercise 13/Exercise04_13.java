package edu.gsu.cis3270.chapter04;
/*(Vowel or consonant?) 
 * Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant. 
 * For a non-letter input, display invalid input.
 */
import java.util.Scanner;
public class Exercise04_13 {
	
	public static void main(String[] args) {
		
		System.out.println("Vowel or Consonant?");
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String userInput= in.nextLine().toUpperCase();
		
		char userInputSole = userInput.charAt(0);
		
		if(userInputSole >= 'A' &&  userInputSole <= 'Z' ) {
			switch(userInputSole) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U': System.out.println(userInputSole + " is a vowel."); break;
				default: System.out.println(userInputSole + " is a consonant.");
			}
			
		}
		
		else
			System.out.println(userInputSole + " is invalid.");
	in.close();
	}

}
