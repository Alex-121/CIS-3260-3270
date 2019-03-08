package edu.gsu.cis3270.chapter04;
import java.util.Scanner;

public class Exercise04_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			System.out.print("Enter the number of sides the polygon has: ");
			double sides = in.nextDouble();
			
			System.out.print("Enter the length of the sides: ");
			double length = in.nextDouble();
			
			double area = sides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / sides));
		
			System.out.print("Area of the polygon is " + area);
			
		in.close();
		
	}
	
}
