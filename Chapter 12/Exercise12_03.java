package edu.gsu.cis3270.chapter12;
import java.util.Random;
/*(ArrayIndexOutOfBoundsException) 
 * Write a program that meets the following requirements:
 * Creates an array with 100 randomly chosen integers.
 * Prompts the user to enter the index of the array, then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds.
 */
import java.util.Scanner;
public class Exercise12_03 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		
		Scanner in = new Scanner(System.in);
		
		Random num  = new Random();
		int[] randomArray = new int[100];
		for(int i = 0; i < randomArray.length; i++) { 
			randomArray[i] = 1 + num.nextInt(245);
		}
			
		System.out.print("Enter a random number: ");
		int userGuess = in.nextInt();
		
		
		try {
		System.out.println("The value at " + userGuess + " is: " + randomArray[userGuess]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Out of Bounds");
		}
	
		in.close();
	}

}
