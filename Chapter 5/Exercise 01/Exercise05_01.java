package edu.gsu.cis3270.chapter05;
/*
 * (Count positive and negative numbers and compute the average of numbers) 
 * Write a program that reads an unspecified number of integers, 
 * determines how many positive and negative values have been read, 
 * and computes the total and average of the input values (not counting zeros).
 * Your program ends with the input 0. Display the average as a 
 * floating-point number. If your entire input is 0, 
 * the program displays No numbers are entered except 0
 */
import java.util.Scanner;

public class Exercise05_01 {
	
	public static void main(String[] args) {
		
		int positiveNum = 0; // to count pos numbers
		int negativeNum = 0; // to count negative numbers
		double count = 0; // double to divide right and get the total count 
		int total = 0; // to add the numbers and save the value
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a set numbers with zero being last to indicate the end: ");
		int userInput = in.nextInt(); // saves user input
		
		
		if(userInput == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);//to exit the program
		}
			
		while(userInput != 0) {
			
			if(userInput > 0) 
				positiveNum++; //add to the count of positive numbers
			else
				negativeNum++;// add to the count of negative numbers
			count++;//increases as the loop continues
			total += userInput;// adds all the user inputs as the loop runs
			
			userInput = in.nextInt();// to get the following user input
		}
		
		double average = total / count;
		System.out.println("Total positive numbers: " + positiveNum
				+ "\nTotal negative numbers: "+ negativeNum
				+ "\nTotal of numbers: " + total
				+ "\nAverage: " + average);
		
		in.close();
	}
	
}