package chapter18;

import java.math.BigInteger;

public class Exercise18_01 {
	
	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter an integer of any size: ");
		long input = in.nextLong();
		System.out.println("Factorial of " + input + " is " + factorial(input));
		in.close();
	}

	public static BigInteger factorial(long m) {
		BigInteger result = new BigInteger(m + "");
		if(m == 1) 
			return BigInteger.ONE;
		result = result.multiply(factorial(m - 1));
		return result;
	}
}
