package edu.gsu.cis3260.chapter07;
/*7.26 (Strictly identical arrays)
 * The arrays list1 and list2 are strictly identical if their corresponding elements are equal.
 * Write a method that returns true if list1 and list2 are strictly identical, using the following header:
 * public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and displays whether the 
 * two are strictly identical. 
 */
import java.util.Scanner;
public class Exercise07_26 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter list one length: ");
		int[] listOne= new int[in.nextInt()];
		for(int i = 0; i < listOne.length; i++)
			listOne[i] = in.nextInt();
		
		System.out.print("Enter list two: ");
		int[] listTwo= new int[in.nextInt()];
		for(int i = 0; i < listTwo.length; i++)
			listTwo[i] = in.nextInt();
		
		System.out.println("Two lists are" + (equals(listOne, listTwo) ? " " : " not ") 
				+ "strictly identical");		
		
		in.close();
		
		
	}
	public static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
			
		}
		
		return true;
	}

	
}
