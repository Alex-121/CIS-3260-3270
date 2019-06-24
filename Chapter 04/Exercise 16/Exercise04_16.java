package edu.gsu.cis3260.chapter04;

public class Exercise04_16 {
	
	public static void main(String[] args) {
		/*
		 upper case letters are from 65 to 91
		 91 - 65 = 26
		 */
		int randomNum = 65 + (int) (Math.random() * 26);
		
		
		
		System.out.println((char) randomNum);
		
	}
}
