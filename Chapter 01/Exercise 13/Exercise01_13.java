package edu.gsu.cis3270.chapter01;

public class Exercise01_13 {

	public static void main(String[] args) {
		/* use cramer's rule to solve this
		  3.4x+50.2y=44.5
		  2.1x+.55y=5.9
		 */
		
		// can't use variables double x,y;
		
		System.out.println("x equals " + ((44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1)));
		System.out.println("y equals " + ((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1)));
		

	}

}
