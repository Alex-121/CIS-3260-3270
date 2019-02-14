package edu.gsu.cis3260.chapter08;
/*8.2 (Sum the major diagonal in a matrix)
 * Write a method that sums all the numbers in the major diagonal in an n × n matrix of double values 
 * using the following header:
 * public static double sumMajorDiagonal(double[][] m)
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the 
 * major diagonal.
 */

import java.util.Scanner;
public class Exercise08_02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the data:");

		double[][] userInput = new double[4][4];
		
		for(int i = 0; i < userInput.length; i++)
			for(int j = 0; j < userInput[i].length; j++)
				userInput[i][j] = in.nextDouble();
		
		System.out.println("The sum of the diagional is " + sumMajorDiagonal(userInput));
		in.close();
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
			for(int i = 0; i < m.length; i++) {
				sum += m[i][i];
				// was testing all the ways to do this. System.out.println(sum);
			}
		
		return sum;
	}
}
