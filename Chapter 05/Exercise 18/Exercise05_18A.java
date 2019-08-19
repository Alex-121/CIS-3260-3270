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
public class Exercise05_18A {

	public static void main(String[] args) {
		//this will be the first pattern
		
		for(int rows = 1; rows <= 6; rows++) {
			
			for(int i = 1; i < rows + 1; i++) {
				
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
		
	}
	
}
