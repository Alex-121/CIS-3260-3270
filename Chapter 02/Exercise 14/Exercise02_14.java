package edu.gsu.cis3270.chapter02;
 import java.util.Scanner;
 
public class Exercise02_14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble(); // saves weight
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();// saves height
		
		/* Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
		convert the pounds and inches
		*/
		double conversion1 = weight * 0.45359237;
		double conversion2 = height * 0.0254;
		
		// calculate BMI (weight in kilo / height in meters^2)
		double bmi = conversion1 / (conversion2 * conversion2);
		
		System.out.println("BMI is: " + bmi);
		
		input.close();
		
	}
	
}
