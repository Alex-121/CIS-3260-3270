package edu.gsu.cis3270.chapter09;

public class Exercise09_09 {

	public static void main(String[] args) {
		
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("Polygon r1 perimeter: " + r1.getPerimeter() + " and area: " + r1.getArea() + ".");
		System.out.println("Polygon r2 perimeter: " + r2.getPerimeter() + " and area: " + r2.getArea() + ".");
		System.out.println("Polygon r3 perimeter: " + r3.getPerimeter() + " and area: " + r3.getArea() + ".");
	}

}
