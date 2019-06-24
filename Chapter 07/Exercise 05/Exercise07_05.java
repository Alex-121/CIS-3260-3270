package edu.gsu.cis3270.chapter07;
/* (Print distinct numbers) 
 * Write a program that reads in ten numbers and displays the number of distinct numbers and the distinct numbers 
 * in their input order and separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). 
 * (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.)
 *  After the input, the array contains the distinct numbers. 
 */
import java.util.Scanner;
public class Exercise07_05 {
	
	public static void main(String[] args) {
		
		int[] userArray = new int[10]; // sets the array to ten
		int[] distinctArray = new int[10]; // new array for 
		int count = 0;				   // to keep track of the unique numbers 
	
		
		//get user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		for(int i = 0; i < userArray.length; i++)    //for loop for inputs
			userArray[i]  = in.nextInt();
			
		for(int i = 0; i < userArray.length; i++) {  //need nested loops to have the arrays in different [i's]
			boolean numFound = false;				 //set the boolean to false because if it's true you don't want it in the new array
			
			for(int j = 0; j < count; j++) {		 //new loop to check distinct to userArray. 
				
				if( userArray[i] == distinctArray[j]) {		//this will make sure every number before is checked to ensure no duplictes are at the end
					numFound = true;						// if this is true, 1change to true
					break;									// and break out of loop
				}
				
			}
			if(!numFound)									//
				distinctArray[count++] = userArray[i];
		}
		System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distict numbers are: ");
        for (int x=0; x<count; x++)
            System.out.print(distinctArray[x] + " ");
        
	in.close();	
	}

}
