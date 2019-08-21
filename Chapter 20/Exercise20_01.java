package chapter20;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*20.01 (Display words in ascending alphabetical order)
 * Write a program that reads words from a file and displays all the words (duplicates allowed) in ascending alphabetical order.
 * the words must start with a letter. the text file is passed as a command line argument.
 */
public class Exercise20_01 {
	
	public static void main(String[] args) throws Exception {
		
		
		File input = new File(args[0]);
		Scanner in = new Scanner(input);
		System.out.println("The words in the file are: ");
		ArrayList<String> test = new ArrayList<>();
		
		while(in.hasNext()) {
			
			test.add(in.next().replaceAll("[.,!]", ""));	
		}
		test.forEach(e -> System.out.print(e.toString() + " "));
		Collections.sort(test);
		System.out.println("\nThe ordered words are: \n" + test);
		
	in.close();	
	}
}
