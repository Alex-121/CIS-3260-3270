package edu.gsu.cis3260.chapter07;
/* (Average an array) 
 * Write two overloaded methods that return the 
 * average of an array with the following headers:
 * 
 * 		public static int average(int[] array)
 * 		public static double average(double[] array)
 * 
 * Write a test program that prompts the user to 
 * enter ten double values, invokes this method, 
 * and displays the average value.
 */
import java.util.Scanner;
public class Exercise07_08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//set up an array
		double[] value = new double[10];
		
		System.out.print("Enter 10 double values(ie: 10.0): ");
		
		for(int i = 0; i < value.length; i++)
			value[i] = in.nextDouble();
		
		System.out.println("The average is: " + average(value));
		
		in.close();
	}
	public static int average(int[] array) {
		int average = 0;
		 
		for(int i: array)
			average += i;
		return average / array.length;
			
	}
	public static double average(double[] array) {
		double average = 0;
		for(double i: array)
			average += i;
		return average / array.length;
	}
}
