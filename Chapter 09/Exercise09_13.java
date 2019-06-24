package edu.gsu.cis3270.chapter09;
import java.util.Scanner;
public class Exercise09_13 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("Enter the rows and columns in the array: ");
		int r = in.nextInt();
		int c = in.nextInt();
		double[][] array = new double[r][c];
		System.out.println("Enter the array");
		array = createArray(array);
		
		Location.locateLargest(array);	
		System.out.println("The loacation with the largerst element is " + Location.maxValue + " at (" + Location.row + ", " 
							+ Location.column + ")");

	}
	public static double[][] createArray(double[][] a) {
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				a[i][j] = in.nextDouble();
		
		return a;
	}
}
