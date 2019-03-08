package edu.gsu.cis3270.chapter02;
import java.util.Scanner;

public class Exercise02_06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value between 0 and 1000: ");
		
		int value = input.nextInt();
		
		int calculationPt1 = (value % 10); 
		
		// takes the input and divides by ten then saves the remainder
		
		
		int calculationPt2 = (value / 10) % 10;
			/*
			takes the input and divides by ten (takes off the last number) 
			then divides that shorter value by ten then saves the remainder
			*/
			int calculationPt3 = (value / 100);
			/*
			takes the input and divides by 100 (takes off the last two number)
			example 345/100 in java returns 3 
			*/
		
		// Do the final calculation
		
		int calculationFinal = calculationPt1 + calculationPt2 + calculationPt3;

		System.out.println("The sum all of the digits in " + value + 
			" is " + calculationFinal);
		input.close();
		
	}
	
}
