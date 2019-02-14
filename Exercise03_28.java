package edu.gsu.cis3270.chapter03;
/*(Geometry: two rectangles) 
  Write a program that prompts the user to enter the center x-, y-coordinates,
  width, and height of two rectangles and determines whether the second rectangle 
  is inside the first or overlaps with the first, as shown in Figure 3.9. 
  Test your program to cover all cases.
  */

import java.util.Scanner;

public class Exercise03_28 {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter r1's center x and y, width, and height: ");
		
		//r1 data
		double r1CenterX = in.nextDouble(), r1CenterY = in.nextDouble(),
				r1Width = in.nextDouble(), r1Height = in.nextDouble();
		
		System.out.print("Enter r2's center x and y, width, and height: ");
		//r2 data
		double r2CenterX = in.nextDouble(), r2CenterY = in.nextDouble(), 
				r2Width = in.nextDouble(), r2Height = in.nextDouble();
		
		/*for r2 to be inside r1 the width and height must be less than the w and h of r1
		 * the distance between the x's and y's must be less than one half the width/height
		*/
		
		double xDistance = Math.abs(r1CenterX - r2CenterX),
				yDistance = Math.abs(r1CenterY - r2CenterY);
		if(xDistance <= Math.abs(r1Width - r2Width) /2 && yDistance <= Math.abs(r1Height - r2Height) / 2)
			System.out.println("r2 is inside r1");
		
		/*if the above is not true i need to test if the rectangles are overlapping
		 * they are overlapping if the distance between the x and y is less than half the combined distance(add) 
		 */
		
		else if(xDistance <= (r1CenterX + r2CenterX) / 2 && yDistance <= (r1CenterY + r2CenterY) / 2 )
			System.out.println("r2 overlaps r1");
		
		else
			System.out.println("r2 does not overlap r1");
		
	in.close();	
	}
	
}
