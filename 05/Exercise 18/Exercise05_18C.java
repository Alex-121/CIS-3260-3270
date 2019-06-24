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
public class Exercise05_18C {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			
			//spaces
			for(int s = 1; s <= (6 - i); s++) {
				System.out.print("  ");
			}
			for(int j = i; j >= 1; j--) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}	
	}

}
