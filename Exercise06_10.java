package edu.gsu.cis3270.chapter06;

import edu.gsu.cis3270.chapter06.PrimeNumberMethod;

public class Exercise06_10 {
	
	public static void main(String[] args) {
		int numberOfPrimes = 0;	
		for (int prime = 2; prime < 10000; prime++) {
			if (PrimeNumberMethod.isPrime(prime))
				numberOfPrimes++; 
		}
 		
		System.out.println(
			"The number of prime numbers less than 10000: " + numberOfPrimes);
	}

}