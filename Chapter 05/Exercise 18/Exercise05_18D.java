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
public class Exercise05_18D {

	public static void main(String[] args) {
		// last one
		
		for(int row = 1; row <= 6; row++) {
			
			for(int s = 1; s < row; s++) {
				System.out.print("  ");
			}
			
			for(int k = 0; k <= 6 - row; k++) {
				System.out.print((k + row ) + " ");
			}
			
			System.out.println();
		}
		
	}
			

}


