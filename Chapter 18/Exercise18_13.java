package chapter18;

import java.util.Scanner;

/* 18.13 (Find the largest number in an array)
 * Write a recursive method  that returns the largest integer in an array. Write a test program that prompts the user to enter a list of eight integers and displays the largest element.
 */
public class Exercise18_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] userArray= new int[8];
		System.out.print("Enter 8 integers: ");
		for(int i = 0; i < userArray.length; i++)
			userArray[i] = in.nextInt();
		
		System.out.println("The largest element is: " + largestNum(userArray));
		in.close();
	}
	
	public static int largestNum(int[] array) {
		int max = array[array.length-1];
		int index = array.length -1;
		return largestNum(array,index,max);
	}
	public static int largestNum(int[] a, int index, int max) {
		if(index < 0)
			return max;
		else if(a[index] > max)
			return largestNum(a, index -1, a[index]);
		else
			return largestNum(a, index-1, max);
	}
}
