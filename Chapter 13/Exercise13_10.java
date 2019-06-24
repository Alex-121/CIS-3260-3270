package edu.gsu.cis3270.chapter13;
/*(Enable Rectangle comparable) 
 * Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject and 
 * implement the Comparable interface. Override the equals method in the Object class. 
 * Two Rectangle objects are equal if their areas are the same. Draw the UML diagram that involves Rectangle, 
 * GeometricObject, and Comparable.
 */
public class Exercise13_10 {

	public static void main(String[] args) {
		Rectangles r1 = new Rectangles(3,12, "red", true);
		Rectangles r2 = new Rectangles(13,2, "grey",false);
		
		System.out.println("Area of rectangle one: " + r1.getArea());
		System.out.println("Area of rectangle two: " + r2.getArea());
		System.out.println("Rectangle one is " + (r1.equals(r2) ? "" : "not ") +
				"equal to Rectangle two");
	}

}
 
class Rectangles extends GeometricObject_s implements Comparable<Rectangles> {
	
	private double width;
	private double height;

	  public Rectangles() {
	  }

	  public Rectangles(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }
	  
	  public Rectangles(double width, double height, String color, boolean filled) {
		    this.width = width;
		    this.height = height;
		    setColor(color);
		    setFilled(filled);
		  }
	  
	  public double getWidth() {
	    return width;
	  }

	  
	  public void setWidth(double width) {
	    this.width = width;
	  }

	  
	  public double getHeight() {
	    return height;
	  }

	  
	  public void setHeight(double height) {
	    this.height = height;
	  }

	 
	  public double getArea() {
	    return width * height;
	  }

	  
	  public double getPerimeter() {
	    return 2 * (width + height);
	    
	  }
	  
	 public boolean equals(Object o) {
		 return this.compareTo((Rectangles)o) == 0;
		 
	 }

	

	@Override
	public int compareTo(Rectangles o) {
		if(getArea() > o.getArea())
			return 1;
		
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
}

abstract class GeometricObject_s {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject_s() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject_s(String color, boolean filled) {
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