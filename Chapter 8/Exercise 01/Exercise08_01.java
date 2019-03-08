package edu.gsu.cis3260.chapter08;
/*(Sum elements column by column)
 * Write a method that returns the sum of all the elements in a specified column in a matrix
 * using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * 
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 */
import java.util.Scanner;

public class Exercise08_01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[][] userInput = new double[3][4];
		System.out.println("Enter the data:");
		
		for(int i = 0; i < userInput.length; i++) {
			for(int j = 0; j < userInput[i].length; j++)
				userInput[i][j] = in.nextDouble();
			
		}
		
			for(int i = 0; i < userInput[0].length; i++)
			System.out.println("The sum of the elements at column " + i + " is " + sumColumn(userInput, i));
		
		in.close();
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
				for(int j = 0; j < m.length; j++)
					sum += m[j][columnIndex];
		
		return sum;
	}
}
