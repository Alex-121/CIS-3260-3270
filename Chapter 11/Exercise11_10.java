package edu.gsu.cis3270.chapter11;
import java.util.ArrayList;
/*(Implement MyStack using inheritance) In Listing 11.10 MyStack is implemented using composition. 
 * Define a new stack class that extends ArrayList.Draw the UML diagram for the classes and then implement MyStack. Write a test program that prompts the user to enter five strings and displays them in reverse order.
 * 
 */

public class Exercise11_10 {
static java.util.Scanner in = new java.util.Scanner(System.in);
	public static void main(String[] args) {
	
		MyStack a = new MyStack();

		System.out.println("Enter five Strings");
		for(int i = 0; i < 5; i++)
			a.push(in.next());
		
		System.out.println(a);
	}

}

//new MyStack class
class MyStack extends ArrayList{
	  private ArrayList<Object> list;
	  
	  //create the ArrayList
	  public MyStack() {
		  list = new ArrayList<>();
	  }

	//normal operation
	  public Object peek() {
	    return list.get(0);
	  }
	  //normal operation
	  public Object pop() {
	    Object o = list.size();
	    list.remove(0);
	    return o;
	  }
	  /*To reverse the order, 
	   * you need to keep adding items to the first position, 0
	   * ie cat dog mouse
	   * if you add dog to position zero after cat, cat gets pushed to position 1 same with mouse
	   *    0     1    2	
	   * [mouse, dog, cat]
	   */
	  public void push(Object o) {
	    list.add(0, o);
	  }

	  @Override 
	  public String toString() {
	    return "stack: " + list.toString();
	  }
	}