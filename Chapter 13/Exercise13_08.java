package edu.gsu.cis3270.chapter13;

/*13.8. (Revise the MyStack class) 
 * Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field.
 */
import java.util.ArrayList;
public class Exercise13_08 {

	public static void main(String[] args) {
		MyStack s1 = new MyStack();
		for(int i = 0; i < 10; i +=2) 
			s1.push(i);
			
		MyStack s2 = (MyStack)s1.clone();
			
		for(int i = 0; i < 2; i++) {
			s2.pop();
		}
		
		System.out.println("Stack s1 " + s1);
		System.out.println("Stack s2 " + s2);
	}

}

//listing 11.10
class MyStack implements Cloneable{
	  private ArrayList<Object> list = new ArrayList<>();

	  public boolean isEmpty() {
	    return list.isEmpty();
	  }

	  public int getSize() {
	    return list.size();
	  }

	  public Object peek() {
	    return list.get(getSize() - 1);
	  }

	  public Object pop() {
	    Object o = list.get(getSize() - 1);
	    list.remove(getSize() - 1);
	    return o;
	  }

	  public void push(Object o) {
	    list.add(o);
	  }

	  @Override /** Override the toString in the Object class */
	  public String toString() {
	    return "stack: " + list.toString();
	    
	  }
	  
	  @SuppressWarnings("unchecked")
	public Object clone() {
		  
		  try {
			  MyStack copy = (MyStack)super.clone();
			  copy.list = (ArrayList<Object>)(list.clone());
			  return copy;
		  }
		  catch(CloneNotSupportedException ex) {
			  return null;
		  }
	  }
	  
}