

public class Exercise01_11 {

	public static void main(String[] args) {
		/* got to make a formula that predicts population
		initial population = 3120322486.0
		seconds in a year = 365 * 60 * 60
		(312032486+((31536000.0 / 7) + (31536000.0 / 45) - (31536000.0 /13)))
	
	*/ 
		
		
		// year one
		System.out.println("After one year " + (312032486 + ((31536000.0 / 7) + 
		(31536000.0 / 45) - (31536000.0 / 13))));
		
		//year 2
		System.out.println("After two years " + (312032486 + 2 * ((31536000.0 / 7) + 
		(31536000.0 / 45) - (31536000.0 / 13))));
		
		//year 3
		System.out.println("After three years " + (312032486 + 3 * ((31536000.0 / 7) + 
		(31536000.0 / 45) - (31536000.0 / 13))));
		
		//year 4
		System.out.println("After four years " + (312032486 + 4 * ((31536000.0 / 7) + 
		(31536000.0 / 45) - (31536000.0 / 13))));
		
		//year 5
		System.out.println("After five years " + (312032486 + 5 * ((31536000.0 / 7) + 
		(31536000.0 / 45) - (31536000.0 / 13))));
			/* 
			will get number is too big error if i don't put 3120322486 into a variable
			would also get incorrect number if i put .0 at the end
			i know you said not to but variables but I don't know how to make it work
			without them
			*/
	}

}
