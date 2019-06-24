package edu.gsu.cis3260.chapter07;
/*(Eliminate duplicates)
 * Write a method that returns a new array by 
 * eliminating the duplicate values in the array 
 * using the following method header:
 * public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in ten integers, 
 * invokes the method, and displays the numbers 
 * separated by exactly one space. 
 */
import java.util.Scanner;

public class Exercise07_15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] userInput = new int[10];
		
		System.out.print("Enter 10 values: ");
		
		for(int i = 0; i < userInput.length; i++)
			userInput[i] = in.nextInt();
		
		//something here
		int[] distinct = eliminateDuplicates(userInput);
		
		//display all the results
		System.out.println("The distint numbers are:");
		for(int i: distinct) {
			
			if( i > 0)
				
				System.out.print(" " + i );
			
			
		}
		
		in.close();
	}
	public static int[] eliminateDuplicates(int[] list) {
		int newList = list.length;
		for(int i = 1; i < list.length; i++) {
			for(int j = 0; j < i; j++) {
				if(list[i] == list[j]) {
					newList--;
					break;
				}
				
			}
		}
		
	    int[] newArray = new int[newList]; // create new array with new length
	    newArray[0] = list[0];  // 1st element goes to new array
	    int inx = 1;            // index for 2nd element of new array
	    boolean isDuplicate;

	    for (int i = 1; i < list.length; i++) {
	        isDuplicate = false;
	        for (int j = 0; j < i; j++) {
	            if (list[i] == list[j]) {  // if duplicate founded then change boolean variable and break
	                isDuplicate = true;
	                break;
	            }
	        }
	        if (!isDuplicate) {     // if it's not duplicate then put it to new array
	            newArray[inx] = list[i];
	            inx++;
	        }
	    }
	    return newArray;
	}
}
