package edu.gsu.cis3260.chapter08;
/*8.5 (Algebra: add two matrices
 *  Write a method to add two matrices. The header of the method is as follows:
 *  public static double[][] addMatrix(double[][] a, double[][] b)
 *  In order to be added, the two matrices must have the same dimensions and the same or 
 *  compatible types of elements. Let c be the resulting matrix. Each element cij is aij + bij. 
 *  Write a test program that prompts the user to enter two 3 × 3 matrices and displays their sum. 
 */  

import java.util.Scanner;
public class Exercise08_05 {

	public static void main(String[] args) {
		
		System.out.println("The data must be in 3 X 3 format!");
		System.out.println("Enter the data for matrix one: ");
		double[][] matrixOne = createMatrix();
		
		System.out.print("Enter data for matrix two: ");

		double[][] matrixTwo = createMatrix();
	
		double[][] matrixThree =addMatrix(matrixOne,matrixTwo);
		
		/*System.out.println("The sum of the matrices is: ");
		*for(int i = 0; i < matrixThree.length; i++) {
		*	for(int j = 0; j < matrixThree[i].length; j++)
		*		System.out.print(matrixThree[i][j] + " ");
		*System.out.println();
		*use methods for this (to print all three)
		*/
		
		print(matrixOne,matrixTwo, matrixThree);
			
	}
	
	public static double[][] createMatrix() {
		
		double[][] b = new double[3][3];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++)
				b[i][j] = in.nextDouble();
		}
		
		in.close();
		return b;
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		
		double[][] sumOfMatrices =new double[a.length][a[0].length];
		for(int i = 0; i < sumOfMatrices.length; i ++)
			for(int j = 0; j < sumOfMatrices[i].length; j++)
			sumOfMatrices[i][j] = a[i][j] + b[i][j];
			
			return sumOfMatrices;
	}
	
	public static void print(double[][] a, int b) {
		
		for(int i = 0; i < a[b].length; i++) 
			System.out.print(a[b][i] + " ");
	}
	
	public static void print (double[][] a, double[][] b, double[][] c) {
		for(int i = 0; i < 3; i++) {
			print(a, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(b, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(c, i);
			System.out.println();
		}
	}	
}
