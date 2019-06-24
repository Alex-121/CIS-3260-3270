package edu.gsu.cis3270.chapter11;
/*(The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:

Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.

A no-arg constructor that creates a default triangle.

A constructor that creates a triangle with the specified side1, side2, and side3.

The accessor methods for all three data fields.

A method named getArea() that returns the area of this triangle.

A method named getPerimeter() that returns the perimeter of this triangle.

A method named toString() that returns a string description for the triangle.

For the formula to compute the area of a triangle, see Programming Exercise 2.19. The toString() method is implemented as follows:

return "Triangle: side1 = " + side1 + " side2 = " + side2 +
  " side3 = " + side3;
 * 
 */
public class Exercise11_01 {
static java.util.Scanner in = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the sides of the Triangle.");
		Triangle a = new Triangle(in.nextDouble(),in.nextDouble(),in.nextDouble(), in.next(), in.nextBoolean());
		System.out.println(a.toString());
		System.out.println("Triangle a's area: " +a.getArea() + " and perimeter: " + a.getPerimeter());
		
		
	}

}
class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
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
	public java.util.Date getDate() {
		return dateCreated;
	}

	public String toString() {
		return "created on: " + dateCreated + " \n color: " + color + " \n filled: " + filled;
		
	}
}
class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		
		side1=side2=side3= 1;
	}
	public Triangle(double s1, double s2, double s3) {
		
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	//Triangle(12,14,10, "red", true);
	public Triangle(double s1, double s2, double s3, String color, boolean filled)  {

		side1 = s1;
		side2 = s2;
		side3 = s3;
		setColor(color);
		setFilled(filled);

	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1: " + side1 + " side2: " + side2 + " side3: " + side3 + " " + super.toString();
	}
}