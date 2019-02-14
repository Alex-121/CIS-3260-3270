package edu.gsu.cis3270.chapter05;
/*Find the two highest scores) 
Write a program that prompts the user to enter the number of 
students and each student’s name and score, 
and finally displays the student with the highest score and 
the student with the second-highest score.
Use the next() method in the Scanner class to 
read a name rather using the nextLine() method. 
*/

import java.util.Scanner;
public class Exercise05_09 {

	public static void main(String[] args) {
		
		//
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		
		int students = in.nextInt();
		
		//Initialize a variable for max(and second highest) score and the name associated with both
		
		int max = 0, secondHighest = 0;
		String maxStudent = "", secondStudent = "";
		
		// loop needs to collect names and the scores. must be self contained
		for(int i = 0; i < students; i++) {
			System.out.print("Enter student " + (i + 1) + " name: ");
			String studentName = in.next();
			System.out.print("Enter student's score: ");
			int score = in.nextInt();
		
			//the first value is default the max so set it to max
				if( i == 0) { 
				
					max = score;
					maxStudent = studentName;
				}
			//must test if the second input is greater than the first
				else if(i == 1 && score > max) {
					secondHighest = max;
					max = score;
					secondStudent = maxStudent;
					maxStudent = studentName;
				}
				
			//if the above isn't true than that is default second highest
				else if( i == 1) {
					secondHighest = score;
					secondStudent = studentName;
				}
				
			// test if the last student entered has the highest score 
				else if (i > 1 && score > max && score > secondHighest) {
					secondHighest = max;
					max = score;
					secondHighest = max;
					maxStudent = studentName;
				}
				
			// Last student entered has the second highest score 
				else if (i > 1 && score > secondHighest) {
					secondStudent = studentName;
					secondHighest = score;
				}

		}	
		
		System.out.println("Highest student and score: " + maxStudent + 
				" " + max);
		System.out.println("Second highest student and score: " + secondStudent + 
				" " + secondHighest);	
					
	in.close();	
	}

}
