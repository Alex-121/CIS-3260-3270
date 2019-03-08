package edu.gsu.cis3260.chapter07;
/* (Computing gcd) 
 * Write a method that returns the gcd of an 
 * unspecified number of integers. The method header 
 * is specified as follows:
 * 
 * public static int gcd(int... numbers)
 * 
 * Write a test program that prompts the user to 
 * enter five numbers, invokes the method to find the
 *  gcd of these numbers, and displays the gcd.
 *  */
import java.util.Scanner;

public class Exercise07_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Create a Scanner
		int[] numbers = new int[5]; // Create an array of length 5
		
		// Prompt the user to enter five numbers
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}

		// Display the gcd
		System.out.println("The greatest common divisor is " + gcd(numbers));
		
		in.close();
	}


	public static int gcd(int... numbers) {
		int gcd = 1;		
		boolean isDivisor;	

		for (int i = 2; i < min(numbers); i++) {
			isDivisor = true;
			for (int e: numbers) {
				if (e % i != 0)
					isDivisor = false;
			}
			if (isDivisor)
				gcd = i;
		}
		return gcd;
	}


	public static int min(int... numbers) {
		int min = numbers[0];
		for (int e: numbers) {
			if (e < min)
				min = e;
		}
		return min;
	}
}