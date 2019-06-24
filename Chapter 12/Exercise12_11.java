package edu.gsu.cis3270.chapter12;
import java.util.ArrayList;
import java.util.List;
/*2.11 (Remove text) 
 * Write a program that removes all the occurrences of a specified string from a text file. 
 * For example, invoking java Exercise12_11 John filename removes the string John from the specified file. 
 * Your program should get the arguments from the command line.
 */
import java.util.Scanner;
import java.io.*;
public class Exercise12_11 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter a String and the file name.");
		
		if(args.length != 2) {
			System.out.println("Input invalid. Example: John filename");
			System.exit(1);
		}
		//check if file exists, if it doesn't exit program
		File file = new File(args[1]);
		if(!file.exists()) {
			System.out.println("The file " + args[1] + " does not exist");
			System.exit(2);
		}
		/*okay so, I need to remove all instances of the string from the file. 
		 * replacing with "" would technically remove the string
		 */
		List<String> lines = new ArrayList<> ();						//to save the new lines in array
		
		try  {
			//read in the file
			Scanner in = new Scanner(file);
			
			while(in.hasNext()) {
				
				String newLine = in.nextLine();
				
				lines.add(newLine.replaceAll(args[0], ""));
				
				}
			
			in.close();
			
			PrintWriter output = new PrintWriter(file);
			
			for(int i = 0; i <lines.size(); i++)
				
				output.println(lines.get(i));
			
		output.close();
		
		}
		
		catch(IOException ex) {
			
			System.out.println("Error: " + ex.getMessage());
		}
		
	}
	
}
