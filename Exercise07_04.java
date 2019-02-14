package edu.gsu.cis3260.chapter07;
/*(Analyze scores) 
 * Write a program that reads an unspecified number of scores 
 * and determines how many scores are above or equal to the average 
 * and how many scores are below the average. Enter a negative 
 * number to signify the end of the input. 
 * Assume that the maximum number of scores is 100.
 */

import java.util.Scanner;
public class Exercise07_04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//prompt user
		System.out.print("Enter scores with the last number being negative to signify end: ");
		double [] grades = new double[100]; //max limit is 100
		// create variables for average count and count above average
		double count, average;
		average=count= 0; // start them both at zero
		
		//loop the inputs into the array
		
		for(int i = 0; i < 100; i++) {
			grades[i] = in.nextInt();
			// loop that checks the values and increments count to find the average and breaks if it it's negative
			if(grades[i] < 0)
				break;
			average += grades[i];
			count++;
			
		}
		average /= count;
		
		int abAverage, below;
		abAverage = below = 0;
		for(int i = 0; i < count; i++) {
			if(grades[i] >= average)
				abAverage ++;
			else
				below ++;
		}
		// display everything
		
System.out.println("Average of scores: " + average
		+ "\n Number of scores above equal to average: " + abAverage
		+ "\n Number of scores below average: " + below);

in.close();
	}

}
