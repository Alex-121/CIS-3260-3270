package edu.gsu.cis3270.chapter13;
/* (Enable GeometricObject comparable) 
 * Modify the GeometricObject class to implement the Comparable interface, 
 * and define a static max method in the GeometricObject class for 
 * finding the larger of two GeometricObject objects. 
 * Draw the UML diagram and implement the new GeometricObject class.
 *  Write a test program that uses the max method to find the larger of two 
 *  circles and the larger of two rectangles.
 */
public class Exercise13_05 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3,7, "purple", false);
		Rectangle r2 = new Rectangle(12,15,"green", true);
		
		Circle c1 = new Circle(5,"red",true);
		Circle c2 = new Circle(7,"blue", false);
		
		
		System.out.println("Max rectangle is the rectangle " + Rectangle.max(r1, r2));
		System.out.println("Max rectangle is the circle " + Circle.max(c1, c2));

	}
	
}
	//geometricobjects because geometricobject is already a thing in other program
	abstract class GeometricObjects implements Comparable<GeometricObjects>{
		private String color;
		private boolean filled;
		private java.util.Date dateCreated;

		protected GeometricObjects() {
			dateCreated = new java.util.Date();
		}
		
		protected GeometricObjects(String color, boolean filled) {
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
		
		public int compareTo(GeometricObjects o) {
			if(getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else
				return 0;
			
		}
		
		public static GeometricObjects max(GeometricObjects o1,GeometricObjects o2) {
				return o1.compareTo(o2) == 1 ? o1 : o2;
		}

		

	}
	
	class Circle extends GeometricObjects {
		  private double radius;

		  public Circle() {
		  }

		  public Circle(double radius) {
		    this.radius = radius;
		  }
		  
		  public Circle(double radius, String color, boolean filled) {
			    this.radius = radius;
			    setColor(color);
			    setFilled(filled);
			  }

		  /** Return radius */
		  public double getRadius() {
		    return radius;
		  }

		  /** Set a new radius */
		  public void setRadius(double radius) {
		    this.radius = radius;
		  }
	
		  @Override /** Return area */
		  public double getArea() {
		    return radius * radius * Math.PI;
		  }

		  /** Return diameter */
		  public double getDiameter() {
		    return 2 * radius;
		  }

		  @Override /** Return perimeter */
		  public double getPerimeter() {
		    return 2 * radius * Math.PI;
		  }

		  /* Print the circle info */
		  public void printCircle() {
		    System.out.println("The circle is created " + getDateCreated() +
		      " and the radius is " + radius);
		  
		}
	}
	 
	class Rectangle extends GeometricObjects {
		  private double width;
		  private double height;

		  public Rectangle() {
		  }

		  public Rectangle(double width, double height) {
		    this.width = width;
		    this.height = height;
		  }
		  
		  public Rectangle(double width, double height, String color, boolean filled) {
			    this.width = width;
			    this.height = height;
			    setColor(color);
			    setFilled(filled);
			  }

		  /** Return width */
		  public double getWidth() {
		    return width;
		  }

		  /** Set a new width */
		  public void setWidth(double width) {
		    this.width = width;
		  }

		  /** Return height */
		  public double getHeight() {
		    return height;
		  }

		  /** Set a new height */
		  public void setHeight(double height) {
		    this.height = height;
		  }

		  @Override /** Return area */
		  public double getArea() {
		    return width * height;
		  }

		  @Override /** Return perimeter */
		  public double getPerimeter() {
		    return 2 * (width + height);
		  }
	}
	
	