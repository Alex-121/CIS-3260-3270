package chapter18;
/*18.3 (Compute greatest common divisor using recursion) 
 * The gcd(m, n) can also be defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n.
 * Otherwise, gcd(m, n) is gcd(n, m % n).
 * Write a recursive method to find the GCD. Write a test program that prompts the user to enter two integers and displays their GCD.
 */
public class Exercise18_03 {

	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = in.nextInt();
		System.out.print("Enter the second number: ");
		int b = in.nextInt();
		
		System.out.println("The gcd of " + a + " and " + b + " is " + gcd(a,b));
		
	in.close();	
	}
	
	public static int gcd(int m, int n) {
		
		if(m % n == 0)
			return n;
		
		return gcd(n, m % n);
	}
}
