package edu.gsu.cis3270.chapter03;
/*Find future dates) 
  Write a program that prompts the user to enter an integer for today’s day of the week 
  (Sunday is 0, Monday is 1, …, and Saturday is 6). 
  Also prompt the user to enter the number of days after today for a future day 
  and display the future day of the week.
 */

import java.util.Scanner;
public class Exercise03_05 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer for the today's date. Ex: Sunday is 0, Mon: 1... Saturday: 6");
		int date = in.nextInt();
		
		System.out.println("Enter the number of days in the future.");
		int futureDays = in.nextInt();
		
		int futureDate = (futureDays + date) % 7;
		System.out.print("Today is ");
		switch(date) {
		
		case 0: System.out.print("Sunday"); break;
		case 1:	System.out.print("Monday"); break;
		case 2:System.out.print("Tuesday"); break;
		case 3:System.out.print("Wednesday"); break;
		case 4:System.out.print("Thursday"); break;
		case 5:System.out.print("Friday"); break;
		case 6:System.out.print("Saturday");
		
		}	
		
		System.out.print(" and the future day is ");
		switch(futureDate) {
		
		case 0: System.out.println("Sunday."); break;
		case 1:	System.out.println("Monday."); break;
		case 2:System.out.println("Tuesday."); break;
		case 3:System.out.println("Wednesday."); break;
		case 4:System.out.println("Thursday."); break;
		case 5:System.out.println("Friday."); break;
		case 6:System.out.println("Saturday.");
		
		}	
		
	in.close();
	}
	
}
