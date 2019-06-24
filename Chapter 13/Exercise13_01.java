package edu.gsu.cis3270.chapter13;
/*(Triangle class) 
 * Design a new Triangle class that extends the abstract GeometricObject class. 
 * Draw the UML diagram for the classes Triangle and GeometricObject and then 
 * implement the Triangle class. Write a test program that prompts the user
 *  to enter three sides of the triangle, a color, and a Boolean value to 
 *  indicate whether the triangle is filled. The program should create a 
 *  Triangle object with these sides and set the color and filled properties 
 *  using the input. The program should display the area, perimeter, color,
 *   and true or false to indicate whether it is filled or not.
 */
import java.util.Scanner;
public class Exercise13_01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the three sides of triangle, a color and whether the triangle is filled or not.");
		double s1 = in.nextDouble();
		double s2 = in.nextDouble();
		double s3 = in.nextDouble();
		String color = in.next();
		boolean filled = in.nextBoolean();
		
		Triangle t1 = new Triangle(color, filled,s1,s2,s3);
		
		System.out.println("The triangle object T1 was " + t1.toString());
		
		in.close();
	}

}
abstract class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date(); 
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "created on: " + dateCreated + " \ncolor: " + color + "\nfilled: " + filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle() {
		
	}
	public Triangle(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		
	}
	public Triangle(String color, boolean filled, double s1, double s2, double s3) {
		super(color,filled);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public double getArea() {
		double s = (s1+s2+s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		
	}
	
	public double getPerimeter() {
		return s1 + s2 + s3;
	}
	
	public String toString() {
		return super.toString() + "\narea: " + getArea() + "\nperimeter: " + getPerimeter();
	}
}
