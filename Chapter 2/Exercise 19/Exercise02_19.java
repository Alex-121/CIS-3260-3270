package edu.gsu.cis3270.chapter02;
import java.util.Scanner;

public class Exercise02_19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three points of the triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		/*
		 distance formula
		 Heron's formula
		 via this handy site
		 https://www.mathexpression.com/find-the-area-of-a-triangle.html
		 	
		*/
		double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double sides = (side1 + side2 + side3) / 2;
		
		double area = Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));	
		
		System.out.println("Area of triangle is: " + area);
		
		input.close();
	
	}
	
}
