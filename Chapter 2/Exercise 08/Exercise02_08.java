package edu.gsu.cis3270.chapter02;
/*(Current time) Listing 2.7 ShowCurrentTime.java gives a program that displays the current time in GMT. 
  Revise the program so that it prompts the user to enter the time zone offset to GMT and displays 
  the time in the specified time zone. 
 */
import java.util.Scanner;
public class Exercise02_08 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the time zone offset: ");
		
		int offset = in.nextInt();
		
	    // Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;
	    
	    /* you would need to add or remove time here to adjust from GMT. 
	     * minutes and seconds will stay the same but hours change
	     */
	    
	    long offsetHour = currentHour + offset;

	    // Display results
	    System.out.println("Current time is " + offsetHour + ":"
	      + currentMinute + ":" + currentSecond);
	    
	    in.close();
	    
	}
	
}