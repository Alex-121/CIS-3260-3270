package edu.gsu.cis3270.chapter07;
/* (Culture: Chinese Zodiac) 
 * Simplify Listing 3.9 using an array of strings to store the animal names.
 * 
 */
import java.util.Scanner;
public class Exercise07_33 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
		
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		
		System.out.println(animals[year % 12]);
		
	in.close();
	}
}
