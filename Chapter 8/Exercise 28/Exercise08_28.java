package edu.gsu.cis3270.chapter08;
/* 8.28 (Strictly identical arrays) 
 * The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. 
 * Write a method that returns true if m1 and m2 are strictly identical, using the following header:
 * 			public static boolean equals(int[][] m1, int[][] m2)
 */

import java.util.Scanner;
public class Exercise08_28 {

	public static void main(String[] args) {
	
	
	int[][] matrixOne = createMatrix();
	int[][] matrixTwo = createMatrix();
	
	System.out.println("The arrays are " + (equals(matrixOne, matrixTwo) ? "" : " not") + "identical");
		
	}
	
	public static int[][] createMatrix() {
		final int SIZE = 3;
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[SIZE][SIZE]; 
		System.out.print("Enter matrix: ");
		
		for(int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = in.nextInt();
		
		return matrix;
	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++)
				if(m1[i][j] != m2[i][j])
					return false;
		}
							
		return true;
	}
}
