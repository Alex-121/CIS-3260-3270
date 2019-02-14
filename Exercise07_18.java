package edu.gsu.cis3270.chapter07;
/*7.18 (Bubble sort) 
 * Write a sort method that uses the bubble-sort algorithm. 
 * The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. 
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort 
 * or sinking sort because the smaller values gradually “bubble” their way to the top and the larger values “sink” to the bottom. 
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */
import java.util.Scanner;
public class Exercise07_18 {
	
	public static void main(String[] args) {
		
		double[] userInputs = new double[10];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ten double numbers: ");
		for(int i = 0; i < userInputs.length; i++)
			userInputs[i]= in.nextDouble();
	bubbleSort(userInputs);	
	in.close();	
	}
	
	/*nested loop for this
	 * the outer loop is just to ensure we do the entire 10 numbers
	 * the inner loop need to check the current position against the next
	 *     if the current number is greater it needs to swap them
	 *     
	 * that should do it
	 */
	public static void bubbleSort(double[] num) {
		
		for(int i = 0; i < num.length; i++)
			for(int j = 0; j < num.length - 1; j++) 
				if(num[j] > num[j + 1]) {
					double temp = num[j];
					num[j] = num[j + 1];
					num[j+1] = temp;
				}
		
		for(int i =0; i < num.length; i++)
			System.out.print(num[i] + " ");
	}

}
