package chapter18;
/*18.9 (Print the characters in a string reversely) 
 * Write a recursive method that displays a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 * For example, reverseDisplay("abcd") displays dcba. 
 * Write a test program that prompts the user to enter a string and displays its reversal.
 */

public class Exercise18_09 {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		java.util.Scanner in = new java.util.Scanner(System.in);
		reverseDisplay(in.nextLine());
		reverseDisplay("TacoCat");
		reverseDisplay("What's up?");
	in.close();	
	}
	 public static void reverseDisplay(String value) {
		 if(value.length() == 1)
			 System.out.print(value);
		 
		 else {
			 System.out.print(value.charAt(value.length() -1));
			 reverseDisplay(value.substring(0, value.length()-1));
		 }
	 }
}
