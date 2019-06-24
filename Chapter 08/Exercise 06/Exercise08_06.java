package edu.gsu.cis3270.chapter08;
/*(Algebra: multiply two matrices) Write a method to multiply two matrices. The header of the method is:
 * 				public static double[][]
    			multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as the number of rows in b, 
 * and the two matrices must have elements of the same or compatible types. Let c be the result of the multiplication. Assume the column size of matrix a is n. 
 * Each element cij is ai1 × b1j + ai2 × b2j + … + ain × bnj. For example, for two 3 × 3 matrices a and b, c is  			
 */
import java.util.Scanner;
public class Exercise08_06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int N = 3;
		System.out.print("Enter matrix1: ");
		
		double[][] matrix1 = new double[N][N];
		
		for(int i  = 0; i < matrix1.length; i++)
			for(int j = 0; j < matrix1[i].length; j++)
				matrix1[i][j] = in.nextDouble();
		
		System.out.print("Enter matrix1: ");
		
		double[][] matrix2 = new double[N][N];
		for(int i  = 0; i < matrix2.length; i++)
			for(int j = 0; j < matrix2[i].length; j++)
				matrix2[i][j] = in.nextDouble();
	
		
		double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
		
		System.out.println("\nThe multiplication of teh matrices is ");
		printResult(matrix1, matrix2, resultMatrix, '*');
		
		
		in.close();
	}
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] result = new double[a.length][b[0].length];
		
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < result.length; j++)
				for(int k = 0; k < result[0].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
		
		return result;
	}
	
	public static void printResult(double[][] a, double[][] b, double[][] c, char op) {
	
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++)
				System.out.print(" " + a[i][j]);
			
			if( i == a.length / 2)
				System.out.print("  " + op + "  ");
			
			else
				System.out.print("     ");
			
			for(int j = 0; j < b[0].length; j++)
				System.out.print(" " + b[i][j]);
				
			if( i == a.length / 2)
				System.out.print("  =  ");
				
			else
				System.out.print("     ");
			
			for(int j = 0; j < c[0].length; j++)
				System.out.print(" " + c[i][j]);
				
			System.out.println();
			
		}
	}
}
