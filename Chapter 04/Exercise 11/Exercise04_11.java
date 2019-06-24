package edu.gsu.cis3270.chapter04;
import java.util.Scanner;

public class Exercise04_11 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an interger between 0 and 15: ");
		int userNumber = in.nextInt();
		
		
		if(userNumber >= 0 && userNumber <= 9)
			System.out.println("The hex value is " + userNumber);
		
		else if(userNumber >= 10 && userNumber <=15) 
			System.out.println("The hex value is " + (char) (userNumber + 'A' - 10));
			
		else
			System.out.println("Invalid entry.");
		
		in.close();
		
	}
	
}
