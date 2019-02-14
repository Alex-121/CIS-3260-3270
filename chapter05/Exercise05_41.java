package edu.gsu.cis3270.chapter05;
/*
 * (Occurrence of max numbers) 
 * Write a program that reads integers, finds the largest of them, 
 * and counts its occurrences. Assume that the input ends with number 0. 
 * Suppose that you entered 3 5 2 5 5 5 0; the program finds that the 
 * largest is 5 and the occurrence count for 5 is 4.
 */
import java.util.Scanner;

public class Exercise05_41 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a set of integers(zero at the end to indicate the end): ");
		int max = in.nextInt();
		int count = 1;
		int number;
		
		do {
			number = in.nextInt();
			
			if (number > max) {
				max = number;
				count = 0;
			}
			if (number == max)
				count++;
			
		} while(number != 0);
		
		System.out.println("The largest number is: " + max
				+ "\nThe number " + max + " occurs " + count);
		in.close();
	}

}
