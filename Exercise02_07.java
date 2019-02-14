package edu.gsu.cis3270.chapter02;
/*(Find the number of years) 
  Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
  and displays the number of years and days for the minutes. 
  For simplicity, assume a year has 365 days.
 */
import java.util.Scanner;

public class Exercise02_07 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int userMinutes = in.nextInt();
		//60 min in hour, 24 hour in day, 365 days in a year
		
		int years = (userMinutes / 60 / 24 / 365); // returns year
		int days = userMinutes / 60 / 24 % 365; // have to do remainder 365 because however many days are left after a full year would be in the remainder.
		
		System.out.println(userMinutes + " minutes is about " + years + " years and " + days + " days.");
	in.close();
	}

}
