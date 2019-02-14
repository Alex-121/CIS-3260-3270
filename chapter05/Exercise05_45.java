package edu.gsu.cis3270.chapter05;
/*(Statistics: compute mean and standard deviation) 
 * In business applications, you are often asked to compute the mean and standard deviation of data. 
 * The mean is simply the average of the numbers. The standard deviation is a statistic that tells you how tightly all the various data are clustered around the mean in a set of data. 
 * Write a program that prompts the user to enter ten numbers, and displays the mean and standard deviations of these numbers using the following formula:
 * mean = summation of all userIn / total amount of numbers(in this case 10)
 * Std = sqrt(userin^2 - ((mean)^2 / total number) / total number - 1)
 */

import java.util.Scanner;
public class Exercise05_45 {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		//variables 
		
		
		double  average, standardDeviation;
		average = standardDeviation = 0;
		
			for(int i = 0; i < 10; i++) {
				System.out.print("Enter a number: ");
				
				double userInput = in.nextDouble();
				average += userInput;
				standardDeviation += Math.pow(userInput, 2);
					
			}
			
			
			
			standardDeviation = Math.sqrt((standardDeviation - (Math.pow(average, 2) / 10)) / (10 - 1)); 
			average /= 10;
			
			System.out.println(average);
			System.out.println(standardDeviation);
			
		
	in.close();	
	}
	
}
