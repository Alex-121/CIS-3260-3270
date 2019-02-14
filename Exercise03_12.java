package edu.gsu.cis3270.chapter03;
import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a three digit integer: ");
		
		int number = input.nextInt(); // saves the users number
		
		int number1 = number / 100; // saves only the first number 
		
		int number3 = number % 10; // saves the third value
		
			/* used to see if the values saved the way i thought
			System.out.println(number1);
			System.out.println(number2);
			System.out.println(number3);
			*/
		if (number1 == number3) {
		
			System.out.println("The number " + number + " is a palindrome.");
		
		}
		
		else {
				
			System.out.println("The number " + number + " is not a palindrome.");
		
		}
	
		input.close();	
	}

}