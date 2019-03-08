package edu.gsu.cis3270.chapter08;
/* 8.4 (Compute the weekly hours for each employee) 
 * Suppose the weekly hours for all employees are stored in a two-dimensional array. 
 * Each row records an employee’s seven-day work hours with seven columns. For example, the following array stores the work hours for eight employees. 
 * Write a program that displays employees and their total hours in decreasing order of the total hours.
 * 
 */
public class Exercise08_04 {

	public static void main(String[] args) {
		
		//array with all the hours
		
		int[][] employeeArray = { {2,4,3,4,5,8,8},
								  {7,3,4,3,3,4,4},
								  {3,3,4,3,3,2,2},
								  {9,3,4,7,3,4,1},
								  {3,5,4,3,6,3,8},
								  {3,4,4,6,3,4,4},
								  {3,7,4,8,3,8,4},
								  {6,3,5,9,2,7,9}};
		
		//create a new single array to hold all the sums
		
		int[] hoursArray = new int[8];			
		
		//loop to add all the elements of the columns 
		for(int i = 0; i < employeeArray.length; i++)
			
			for(int j = 0; j < employeeArray[i].length; j++) 
				
				hoursArray[i] += employeeArray[i][j];
			

	}
	
}
