package edu.gsu.cis3270.chapter09;

public class Rectangle {

	double width;
	double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (height + width);
	}

}
