package edu.gsu.cis3270.chapter09;

public class Exercise09_01 {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		
		System.out.println("Rectangle one width: " + r1.width + " height: " + r1.height + " area: " + r1.getArea() + " perimeter: " + r1.getPerimeter());
		System.out.println("Rectangle two width: " + r2.width + " height: " + r2.height + " area: " + r2.getArea() + " perimeter: " + r2.getPerimeter());
	}

}
