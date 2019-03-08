package edu.gsu.cis3270.chapter06;
/*(Financial: credit card number validation)
 *  Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with
4 for Visa cards
5 for Master cards
37 for American Express cards
6 for Discover cards
	RULES
	1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
	2. Now add all single-digit numbers from Step 1
	3. Add all digits in the odd places from right to left in the card number.
	4. Sum the results from Step 2 and Step 3.
	5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. 
	
Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid.
(You may also implement this program by reading the input as a string and processing the string to validate the credit card.) 
*/
import java.util.Scanner;
public class Exercise06_31 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter credit card number: ");
		long ccNumber = in.nextLong();
		
		if(isValid(ccNumber))
			System.out.println(ccNumber + " is a valid credit card");
		else
			System.out.println(ccNumber + " is not a valid credit card");
		
	in.close();	
	}
	
	/** Return true if the card number is valid*/
	public static boolean isValid(long number) {
		
		boolean valid = (getSize(number) >=13 && getSize(number) <= 16) && (prefixMatched(number, 4)|| 
				prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number,6)) &&
				((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
		
		return valid;
	}
	/** Get the result from Step 2 */
	 public static int sumOfDoubleEvenPlace(long number) {
				int sum = 0;
				String oddSum = number + "";
				
				for(int i = getSize(number) - 2; i >= 0; i-= 2)
					sum += getDigit(Integer.parseInt(oddSum.charAt(i) + "") * 2);
				
				return sum;
			
	 }
	 /** Return this number if it is a single digit, otherwise, return the sum of the two digits */
	public static int getDigit(int number) {
				if(number < 9)
					return number;
				
				else
					return number / 10 + number % 10;
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String oddSum = number + "";
		
		for(int i = getSize(number) - 1; i >= 0; i-= 2)
			sum += Integer.parseInt(oddSum.charAt(i) + "");
		
		return sum;
	}
	/** Return true if the number d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		boolean vaild = getPrefix(number,getSize(d)) == d;
		return vaild;
	}
	/** Return the number of digits in d */
	public static int getSize(long d) {
		String size = d + "";
		return size.length();
	}
	/** Return the first k number of digits from number. If the number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		if(getSize(number) > k) {
			String prefix = number + "";
			return Long.parseLong(prefix.substring(0, k));
		}
		
		return number;
	}
	
}
