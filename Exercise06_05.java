package edu.gsu.cis3270.chapter06;
/* (Sort three numbers) 
 * Write a method with the following header to display three numbers in increasing order:
 * 		public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
 */
import java.util.Scanner;
public class Exercise06_05 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers");
		double one, two, three;
		one = in.nextDouble();
		two = in.nextDouble();
		three = in.nextDouble();
		displaySortedNumbers(one,two,three);
		
	in.close();	
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double temp = 0;
		//have to check the numbers in pairs?
		if(num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		else if(num2 < num1 && num2 < num3) {
			
			temp = num1;
			num2 = num1;
			num2 = temp;
		}
		else if(num3 < num2) {
			temp = num3;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("The sorted numbers is: " + num1 + " " + num2 + " " + num3 );
	}
		
}
