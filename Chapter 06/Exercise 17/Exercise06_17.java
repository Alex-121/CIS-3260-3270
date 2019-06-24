package edu.gsu.cis3270.chapter06;
/* (Display matrix of 0s and 1s) 
 * Write a method that displays an n-by-n matrix using the following header:
 * 		public static void printMatrix(int n)
 * Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to enter n and displays an n-by-n matrix.
 */
import java.util.Scanner;
public class Exercise06_17 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = in.nextInt();
		
		printMatrix(userInput);
		
	in.close();	
	
	}
	
	public static void printMatrix(int n) {
	
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
			
				int randomNumber = (int) (Math.random() * 2);
				
				System.out.print(randomNumber + " ");
			}
			
			System.out.println();
		}
	}
	
}
