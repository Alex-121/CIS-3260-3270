package edu.gsu.cis3270.chapter08;
/*(Central city) Given a set of cities, the central city is the city that has the shortest total distance to all other cities. 
 * Write a program that prompts the user to enter the number of the cities and the locations of the cities (coordinates), 
 * and finds the central city and its total distance to all other cities.
 */
import java.util.Scanner;
public class Exercise08_21 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	
		System.out.print("Enter the number of cities: "); 
		int cities = in.nextInt();								// this number will be the rows
		
		double[][] cityCoor = createMatrix(cities);				//creates a matrix 
		centeralPoint(cityCoor);								// finds centeral point
		
	}
	
	public static double[][] createMatrix(int a) {				//creates matrices
		double[][] matrix = new double[a][2];
		System.out.print("Enter the coordinates of the cities: ");
		
		for(int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = in.nextDouble();
		
		return matrix;
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {			//finds distance
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return distance;
	}
	
	public static void centeralPoint(double[][] a) {							//everything else
		
		double[] distancesMatrix = new double[a.length];						//saves all the distances
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a.length; j++)
				if(j != i)
					distancesMatrix[i] += distance(a[i][0], a[i][1], a[j][0], a[j][1]);
		
		//compare all the values in the matrix
		
		int indexOfCenteral = 0;							//saves the index, 0 being first set of x,y ect. will default to 0
		
		for(int i = 1; i < distancesMatrix.length ; i++)
			if(distancesMatrix[0] > distancesMatrix[i])
				indexOfCenteral = i;
		
		System.out.println("The central city is (" + a[indexOfCenteral][0] + ", " + a[indexOfCenteral][1] + ")");
		System.out.println("The total distance to all other cities is " + distancesMatrix[indexOfCenteral]);
	}
	
}
