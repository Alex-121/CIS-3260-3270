package edu.gsu.cis3260.chapter04;
import java.util.Scanner;

public class Exercise04_18 {
	
	public static void main(String[] args) {
		/*
		 * 4.18 (Student major and status) Write a program that prompts 
		 * the user to enter two characters and displays the major and status 
		 * represented in the characters. The first character indicates the major 
		 * and the second is number character 1, 2, 3, 4, which indicates whether 
		 * a student is a freshman, sophomore, junior, or senior. Suppose the 
		 * following characters are used to denote the majors:
		 * M: Mathematics
		 * C: Computer Science
		 * I: Information Technology
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your major and year number: ");
		
		String major = in.nextLine();
		
		String majorLetterUpper = major.toUpperCase();
		char majorLetter = majorLetterUpper.charAt(0);
		char yearLevel = major.charAt(1);
		
		switch (majorLetter) {
			case 'M': System.out.print("Mathematics "); break;
			case 'C': System.out.print("Computer Science "); break;
			case 'I': System.out.print("Information Technology "); break;
			default:  System.out.print("Invalid Entry ");
		}
		switch (yearLevel) {
		case '1': System.out.println("freshman"); break;
		case '2': System.out.println("sophomore"); break;
		case '3': System.out.println("junior"); break;
		case '4': System.out.println("senior"); break;
		default:  System.out.println("Invalid Entry");
	}
	
		in.close();
	}
	
}
