package chapter18;
/*(Sum the digits in an integer using recursion) 
 * Write a recursive method that computes the sum of the digits in an integer. 
 * Use the following method header:
 * public static int sumDigits(long n) For example, sumDigits(234) returns 2 + 3 + 4 = 9. 
 * Write a test program that prompts the user to enter an integer and displays its sum. 
 */
public class Exercise18_11 {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter a numer: ");
		System.out.println("The sum of all the digits is: " + sumDigits(in.nextLong()));
	in.close();
	}
	public static int sumDigits(long n) {
		if(n < 10)
			return (int)n;
		
		int sum = 0;
		sum += n % 10;
		return sum + sumDigits(n/10);
		
	}
}
