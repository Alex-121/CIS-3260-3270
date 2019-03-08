package edu.gsu.cis3270.chapter02;
import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter subtotal and Gratuity rate: "); // prompt user
		
		double subtotal = input.nextDouble(); // saves first number
		
		double gratuityRate = input.nextDouble(); // saves second number
		
		// change second value to percent
		
		double tip = (gratuityRate / 100.0) * subtotal;
		
		// calculate the new total
		
		double total = subtotal + tip;
		
		// display output	
			System.out.println("The gratuity is " + tip + " and total is " + total);
		
		input.close();
	
	}
	
}
