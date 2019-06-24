package edu.gsu.cis3270.chapter10;

public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	boolean isEven() {
		return isEven(value);
	}
	
	boolean isOdd() {
		return isOdd(value);
	}
	
	boolean isPrime() {
		return isPrime(value);
	}
	
	static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	static boolean isPrime(int value) {
		for(int i = 2; i < value / 2; i ++)
			if(value % i == 0)
				return false;
		
		return true;
	}
	
	static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	
	static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	
	static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger a) {
		return a.value == this.value;
	}
	
	public static int parseInt(char[] a) {
		int value = 0;
		for(int i = 0, j = (int) Math.pow(10, a.length - 1); i < a.length; i++, j /= 10)
			value += (a[i]- 48) * j;
		
		return value;
	}
	
	public static int parseInt(String a) {
		int value = 0;
		for(int i = 0, j = (int) Math.pow(10, a.length() - 1); i < a.length(); i++, j /= 10)
			value += (a.charAt(i)- 48) * j;
		
		return value;
	}
}
