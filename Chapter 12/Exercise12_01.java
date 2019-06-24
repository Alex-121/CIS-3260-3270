package edu.gsu.cis3270.chapter12;
/*(NumberFormatException) Listing 7.9 Calculator.java, is a simple command-line calculator. 
 * Note that the program terminates if any operand is nonnumeric. 
 * Write a program with an exception handler that deals with nonnumeric operands; 
 * then write another program without using an exception handler to achieve the same objective. 
 * Your program should display a message that informs the user of the wrong operand type before exiting
 */
public class Exercise12_01 {

	public static void main(String[] args) {
		//code below is from 7.9

		// Check number of strings passed
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
				System.exit(1);
		}

			    // The result of the operation
	    int result = 0;
	    	
	    try {
	    	if(Character.isDigit(args[0].charAt(0))!= true || Character.isDigit(args[2].charAt(0))!= true)
	    		throw new NumberFormatException("NonNumeric Input");
			    // Determine the operator
		    switch (args[1].charAt(0)) { 
		      case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
		      case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
		      case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
		      case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		    }
		    
	    }
	    catch(NumberFormatException ex) {
	    	System.out.println("Wrong Input: " + ex.getMessage());
	    	System.exit(1);
	    }
			    // Display result
			    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			      + " = " + result);
			  
			

	}

}
