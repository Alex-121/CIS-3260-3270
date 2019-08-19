package chapter18;
/*8.10 (Occurrences of a specified character in a string) 
 * Write a recursive method that finds the number of occurrences of a specified letter in a string using the following method header:
 * public static int count(String str, char a)For example, count("Welcome", 'e') returns 2.
 *  Write a test program that prompts the user to enter a string and a character, and displays the number 
 *  of occurrences for the character in the string.
 */
public class Exercise18_10 {

	public static void main(String[] args) {
		
		java.util.Scanner in =  new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.nextLine();
		System.out.print("Enter the character you want counted: ");
		char a = in.next().charAt(0);
		System.out.println("The number of occurances of " + a + " in string " + str + " is " + count(str, a));
	in.close();
	}
	
	public static int count(String str, char a) {
		
		if(str.length() == 0)
			return 0;
		int count = 0;
		if(str.charAt(0) == a)
			count++;
		return count + count(str.substring(1), a);
	}

}