package edu.gsu.cis3270.chapter07;
/*7.17 (Sort students) 
 * Write a program that prompts the user to enter the number of students, the students’ names, 
 * and their scores, and prints student names and scores in decreasing order of their scores. 
 * Assume that the name is a string without spaces, use the Scanner’s next() method to read a name.
 */
import java.util.Scanner;
public class Exercise07_17 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int studentNum = in.nextInt();
		double[] studentScores = new double[studentNum];
		String[] studentNames = new String[studentNum];
		
		for(int i = 0; i < studentScores.length; i++) {
			System.out.print("Enter a student name: ");
			studentNames[i] = in.next();
			System.out.print("Enter student score: ");
			studentScores[i] = in.nextDouble();
		}
		
		
		/*ok so this is simple sorting,
		 * every studentScore is in the same position as name. so sort the scores and the names should follow
		 * make the sort go from highest score to least
		 */
		for(int i = 0; i < studentNum - 1; i++) {
			double maxScore = studentScores[i];      		// defaults the first to highest
			String maxName = studentNames[i];
			int currentMaxIndex = i;

				for(int j = i+ 1; j < studentNum; j++) {   //start a 1 cause 0 is default
					if(maxScore < studentScores[j]) {
						maxScore = studentScores[j];  	// swaps the numbers
						maxName = studentNames[j];
						currentMaxIndex = j;
		
						}
				} 
				if (currentMaxIndex != i) {
				        studentScores[currentMaxIndex] = studentScores[i];
				        studentScores[i] = maxScore;
				        studentNames[currentMaxIndex] = studentNames[i];
				        studentNames[i] = maxName;
				        
				      }
				
		}
		
		System.out.println("The names in decreasing order of their scores are: ");
			for(int i = 0; i < studentNum; i++)
				System.out.println(studentNames[i] + " " + studentScores[i]);
			
	in.close();	
	}
	
}
