package edu.gsu.cis3270.chapter03;
/*(Algebra: solve quadratic equations)
 * Write a program that prompts the user to enter values for a, b, and c 
 * and displays the result based on the discriminant. 
 * If the discriminant is positive, display two roots. If the discriminant is 0, display one root. 
 * Otherwise, display “The equation has no real roots”.
 */
import java.util.Scanner;

public class Exercise03_01 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a, b and c: ");
		double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
		
		double discriminant = Math.pow(b, 2) - 4* a * c;
		
		if(discriminant == 0) {
			
			double r1 = (-1 * b + discriminant) / (2 * a);
			System.out.println("The equation as one root: " + r1);
		}
		
		else if(discriminant > 0) {
			double r1 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
			double r2 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The equation has two roots: r1 = " + r1 + " r2 = " + r2);
			
		}
		
		else
			System.out.println("The equation has no real roots");
	
	in.close();
	}

}
