package edu.gsu.cis3270.chapter12;

public class Exercise12_01_Part2 {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
				System.exit(1);
		}
		checkError(args[0]);
		checkError(args[2]);
			    // The result of the operation
	    int result = 0;
	   
	    	if(Character.isDigit(args[0].charAt(0))!= true || Character.isDigit(args[2].charAt(0))!= true)
	    		throw new NumberFormatException("NonNumeric Input");
			    // Determine the operator
		    switch (args[1].charAt(0)) { 
		      case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
		      case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
		      case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
		      case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		    }
		    
		    // Display result
		    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
		      + " = " + result);
	   
	}
	public static void checkError(String err) {
		for(int i =0; i < err.length(); i++)
			if(!Character.isDigit(err.charAt(i))) {
			System.out.println("Wrong Input: " + err);
			System.exit(1);
		}
	}

}
