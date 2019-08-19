package edu.gsu.cis3270.chapter05;
/*(Display four patterns using loops) 
 * Use nested loops that display the following patterns in four separate programs (but to 6)
 * 1
 * 1 2
 * 1 2 3
 * 
 * 1 2 3
 * 1 2
 * 1
 *    1
 *  2 1
 *3 2 1
 *
 * 1 2 3
 *   2 3
 *     3  
 */
public class Exercise05_18B {

	public static void main(String[] args) {
		// this is the second pattern

		for(int rows = 6; rows >= 1; rows--) {
			
			for(int j = 1; j <= rows; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}

}
