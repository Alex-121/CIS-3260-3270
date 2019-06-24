package edu.gsu.cis3270.chapter06;
import java.util.Scanner;

public class Exercise06_02 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an interger: ");
		long userNumber = in.nextLong();
		
		System.out.println("The sum of the digits is "
				+ sumDigits(userNumber));
		
		in.close();
	}

	public static int sumDigits(long n) {
		
		int sum = 0;
		for(; n > 0; n /= 10) {
			sum += n % 10;
		}
		return sum;
		
	}
	
}
