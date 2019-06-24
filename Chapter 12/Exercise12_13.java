package edu.gsu.cis3270.chapter12;
/*12.13 (Count characters, words, and lines in a file) 
 * Write a program that will count the number of characters, words, and lines in a file. 
 * Words are separated by whitespace characters. 
 * The file name should be passed as a command-line argument
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_13{

	public static void main(String[] args) throws Exception{
System.out.println("Enter a String and the file name.");
		
		if(args.length != 1) {
			System.out.println("Input invalid. Enter only file name.");
			System.exit(1);
		}
		//check if file exists, if it doesn't exit program
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("The file " + args[0] + " does not exist");
			System.exit(2);
		}
		/*okay so, need to count all characters,
		 * words (use whitespace to find new word
		 * and lines, as soon as the while goes to next line increment
		 */
		int characters, words, lines;
		characters = words = lines = 0;
		
		try {
			Scanner in = new Scanner(file); 				// read file 
			
			
			while(in.hasNextLine()) {
			
				String a = in.nextLine();
				characters += checkCharacters(a);
				words += checkWords(a);
				lines++;									//after each iteration there should be a new line, therefore increasing the count.
			}														
																	
		in.close();											
		}															
		catch (IOException ex) {							
			System.out.println("Error: " + ex.getMessage());
		}																	
															
		System.out.println(characters + " characters\n" + words + " words\n" +
							lines + " lines");				
															
	}														
															
	public static int checkCharacters(String line) {		
												
		return line.length();										
																
	}															
	public static int checkWords(String line) {					
																				
		line = line.trim();									//this should properly trim leading/tail whitespace
		String [] words = line.split("\\s"); 				// this should split the words into the separate indices by the whitespace; 
		
		return words.length;								//this should have proper word amount
		
	}
	

}
