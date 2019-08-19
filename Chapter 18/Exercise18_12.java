package chapter18;
/* 18.12 (Print the characters in a string reversely) 
 * Rewrite Programming Exercise 18.9 using a helper method to pass the substring 
 * high index to the method. The helper method header is
 * public static void reverseDisplay(String value, int high) 
 */
public class Exercise18_12 {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
	
				reverseDisplay(in.nextLine());
				in.close();
	}
//	helper method
	public static void reverseDisplay(String value, int high) {
		if(high >= 0) {
			System.out.print(value.charAt(high));
			reverseDisplay(value, high-1);
		}
	}
		
	public static void reverseDisplay(String value) {
		reverseDisplay(value, value.length()-1);
	}

}
