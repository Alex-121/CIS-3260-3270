package edu.gsu.cis3270.chapter03;
/*(Compute the perimeter of a triangle) 
  Write a program that reads three edges for a triangle and 
  computes the perimeter if the input is valid. Otherwise, display that the input is invalid.
  The input is valid if the sum of every pair of two edges is greater than the remaining edge. 
 */

import java.util.Scanner;

public class Exercise03_19 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three edges in double. Ex 3.0, 5.56, 56.4): ");
		
		double edge1 = in.nextDouble(), edge2 = in.nextDouble(), edge3 = in.nextDouble();
		
		if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
			double perimeter = edge1 + edge2 + edge3;
			System.out.println("The perimeter is " + perimeter);
		}
		else
			System.out.println("Input is invalid.");
		
	in.close();	
	
	}
	
}
