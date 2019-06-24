package edu.gsu.cis3270.chapter07;
/* (Find the number of uppercase letters in a string) 
 * Write a program that passes a string to the command line and displays the number of uppercase letters in the string.
 */
public class Exercise07_22 {
	
	public static void main(String[] args) {
		
		System.out.print("enter a string: ");
		int count = 0;
		
		

		for(int i = 0; i < args.length; i++) {
			for(int j = 0; j < args[i].length(); j++) 
				if(Character.isUpperCase(args[i].charAt(j)))
				count++;
		}
		System.out.print("The number of upper cases are: " + count);
	}

}
