package edu.gsu.cis3260.chapter08;
/*8.10 (Largest row and column)
 * Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, 
 * prints the matrix, and finds the first row and column with the most 1s.
 */
public class Exercise08_10 {

	public static void main(String[] args) {

		//create the matrix with random numbers
		int[][] matrix = new int[4][4];
		
		for(int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = (int) (Math.random() * 2);
		//print the matrix so user can see
		print(matrix);
		//pass matrix into method that counts rows
		countMaxRows(matrix);
		//pass matrix into method that counts columns
		countMaxColumn(matrix);
	}
	
	//create method that counts rows
	public static void countMaxRows(int[][] a) {
		int maxRow = 0;
		int count = 0;
		
		for(int i = 1; i < a.length; i++) {
			int total = 0;
			
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] == 1)
					total++;
			}
			if(total > count) {
			 count = total;
			 maxRow = i;
			 
			}
		}
		System.out.println("The row with the most 1s is: " + maxRow);
	}
	
	//create method that counts
	public static void countMaxColumn(int[][] a) {
		int maxColumn = 0;
		int count = 0;
		
		for(int j = 1; j < a[0].length; j++) {
			int total = 0;
			
			for(int i = 0; i < a.length; i++) {
				if(a[i][j] == 1)
					total++;
			}
			if(total > count) {
			 count = total;
			 maxColumn = j;
			 
			}
		}
		System.out.println("The column with the most 1s is: " + maxColumn);
	}
	
	
	//create method to print matrix
	public static void print(int[][] a) {
	System.out.println("The matrix is: ");
	
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++)
				
				System.out.print(a[i][j] + " ");
			
		System.out.println();
		
		}
		
	}
	
}