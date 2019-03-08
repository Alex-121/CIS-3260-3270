package edu.gsu.cis3260.chapter07;
/*
 * *7.1 (Assign grades) Write a program that 
 * reads student scores, gets the best score, 
 * and then assigns grades based on the following 
 * scheme:

Grade is A if score is ≥ best − 10
Grade is B if score is ≥ best − 20;
Grade is C if score is ≥ best − 30;
Grade is D if score is ≥ best − 40;
Grade is F otherwise.

The program prompts the user to enter the total 
number of students, then prompts the user to 
enter all of the scores, and concludes by 
displaying the grades.
 */
import java.util.Scanner;
public class Exercise07_01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Set up array int[] grades;
		
		//Prompt user for the number of students
		System.out.print("Enter the number of student: ");
		
		int[] grades = new int[in.nextInt()]; // decided to do it on one line
		
		//Prompt user got the grades
		System.out.print("Enter the grades for the students: ");
		 /*
		  * how to get the proper grade in the array? loop would work
		  * something like for(int i = 0; i < grades; i++;){
		  * 					grades[i] = in.nextInt(); 
		  */
		 for(int i = 0; i < grades.length; i++)
			 grades[i] = in.nextInt();
		 
		 
		 //feed grades to the method
		 displayGrades(grades);
		
	in.close();	
	}

	// new method to get the max grade
	
	public static int max(int[] grade) {
		int max = grade[0];
		for(int i = 0; i < grade.length; i++) {
			if(grade[i] > max)
				max = grade[i];
		}
		return max;
	}
	
	// new method to run a switch for the grades to letter.
	public static void displayGrades(int[] grades) {
		int best = max(grades);
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= best - 10)
				System.out.println("Student " + i + " score is "
						+ grades[i] + " and the grade is A" );
			else if (grades[i] >= best - 20)
				System.out.println("Student " + i + " score is "
						+ grades[i] + " and the grade is B" );
			else if (grades[i] >= best - 30)
				System.out.println("Student " + i + " score is "
						+ grades[i] + " and the grade is C" );
			else if (grades[i] >= best - 40)
				System.out.println("Student " + i + " score is "
						+ grades[i] + " and the grade is D" );
			else
				System.out.println("Student " + i + " score is "
						+ grades[i] + " and the grade is F" );
		}
	}
}