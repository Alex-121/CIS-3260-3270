package edu.gsu.cis3270.chapter04;
import java.util.Scanner;

public class Exercise04_08 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code (in interger between 0 and 127): ");
		int code = in.nextInt();
		
		char changedCode = (char) code;
		
		System.out.println("The character for ASCII code " + code + " is " + changedCode);
		
		in.close();
		
	}
	
}