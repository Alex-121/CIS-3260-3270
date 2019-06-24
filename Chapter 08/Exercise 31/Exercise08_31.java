package edu.gsu.cis3260.chapter08;
import java.util.Scanner;
public class Exercise08_31 {

	public static void main(String[] args) {

	// Create a Scanner
	Scanner in = new Scanner(System.in);

	// Create a 4 x 2 array
	double[][] points = new double[4][2]; 

	// Prompt the user to enter four points
	System.out.println("Enter four points:");
	
	for (int i = 0; i < points.length; i++) {
		
		for (int j = 0; j < points[i].length; j++) {
			
			points[i][j] = in.nextDouble();
			
		}
		
	}

	// Get intersecting point
	double[] result = getIntersectingPoint(points);

	// Display the intersection point
	if (result == null)
		
		System.out.println("The two lines are parallel");
	
		else {
			
			System.out.println("The intersecting point is at (" + 
							result[0] + ", " + result[1] + ")");
		}
		in.close();		
	}
	public static double[] linearEquation(double[][] a, double[] b) {
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
			return null;

		double[] r = new double[2]; // Results x and y
		
		r[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / 
				 (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		r[1] = (b[1] * a[0][0] - b[0] * a[1][0]) /
				 (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		return r;
	}

	// getIntersectingPoint /
	public static double[] getIntersectingPoint(double[][] points) {
		// Create a 2 x 2 matrix
		double[][] a = new double[2][2];

		// Create an array of length 2
		double[] b = new double[2];

		// Calculate the intersecting point
		a[0][0] = points[0][1] - points[1][1];
		
		a[0][1] = -1 * (points[0][0] - points[1][0]);
		
		a[1][0] = points[2][1] - points[3][1];
		
		a[1][1] = -1 * (points[2][0] - points[3][0]);
		
		b[0] = (points[0][1] - points[1][1]) * points[0][0] - 
				 (points[0][0] - points[1][0]) * points[0][1];
		
		b[1] = (points[2][1] - points[3][1]) * points[2][0] - 
				 (points[2][0] - points[3][0]) * points[2][1];

		return linearEquation(a, b);
		
			}
	
}