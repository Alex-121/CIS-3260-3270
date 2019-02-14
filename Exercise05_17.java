package edu.gsu.cis3270.chapter05;
/*(Display pyramid) 
 * Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid
 */

import java.util.Scanner;
public class Exercise05_17 {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a number from 1 to 15: ");
			
			int userInput = in.nextInt();
			
			/*the user input is the number of rows
			 * Pyramid should look something like this
			 *				1  
			 * 			  2 1 2
			 * 			3 2	1 2 3
			 * ect.
			 * a series of nested loops? start loop at 1 instead of zero for 1 to be down the middle
			 */
			
			for(int i = 1; i <= userInput; i++) {
				
				//spaces
				for(int s = 1; s <= (userInput - i); s++) {
					System.out.print("  ");
				}
				//the decreasing numbers
				for(int j = i; j >= 1; j--) {
					
					System.out.print(j + " ");
				}
				
				//increasing
				for(int k = 2; k <= i; k++) {
					System.out.print(k + " ");
				}
				
				System.out.println();
			}
				
		in.close();
		}
}
