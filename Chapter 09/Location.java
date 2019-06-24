package edu.gsu.cis3270.chapter09;

public class Location {
	public static int row;
	public static int column;
	public static double maxValue;
	
	Location() {
		
	}
	
	Location(double m, int r, int c) {
		Location.row = r;
		Location.column = c;
		Location.maxValue = m;
	}
	
	public static Location locateLargest(double[][] a) {
		
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				if(a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
		Location location = new Location(maxValue, row, column);
		return location;
	}
	
}
