package edu.gsu.cis3270.chapter05;
/*Financial application: compute future tuition) 
Suppose that the tuition for a university is $10,000 this year and 
increases 5% every year. In one year, the tuition will be $10,500.
Write a program that displays the tuition in ten years and 
the total cost of four years’ worth of tuition after the tenth year. 
*/
public class Exercise05_07 {

	public static void main(String[] args) {
		
		/*ok so initial tuition is 10500
		 * need to *= .05 for ten years. display that then do four more
		 */
		double tuition = 10500;
		double total = tuition;
		for(int i = 0; i < 9; i++) {
			tuition *= .05;
			total += tuition;
			tuition = total;
		}
			
			
		System.out.println("The tuition will be " + tuition + " in ten years");
		// initialize a new int for the four year total
		
		double fourYearTotal = tuition;
		for(int i = 0; i < 3; i++) {
			tuition *= .05;
			total += tuition;
			fourYearTotal += total;
			tuition = total;
		}
		
		System.out.println("The four year total will be " + fourYearTotal);
		
	}

}
