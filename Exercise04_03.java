package edu.gsu.cis3270.chapter04;

/*(Geography: estimate areas) 
Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, 
North Carolina in the figure in Section 4.1 to compute the estimated area enclosed by these four cities. 
(Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. 
Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 
to compute the area of a triangle.) 
*/

public class Exercise04_03 {
	
	public static void main(String[] args) {
		
		/*These are the Gps Locations
		 * Charlotte (35.2270869,-80.8431267)
		 * Savannah(32.0835407,-81.0998342)
		 * Orlando (28.5383355,-81.3792365)
		 * Atlanta (33.7489954,-84.3879824)
		 */
		
		double atlantaX = Math.toRadians(33.7489954), atlantaY = Math.toRadians(-84.3879824);
		double savannahX = Math.toRadians(32.0835407), savannahY = Math.toRadians(-81.0998342);
		double orlandoX = Math.toRadians(28.5383355), orlandoY = Math.toRadians(-81.3792365);
		double charlotteX = Math.toRadians(35.2270869), charlotteY = Math.toRadians(-80.8431267);
		
		/*Formula's from the other problems
		 * (4.1) distance between cities-> d = radius × arccos(sin(x1) × sin(x2) + cos(x1) × cos(x2) × cos(y1 - y2))
		 * (2.19) Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3))
		 * 
		 * So I need the distance from orlando to charlotte for the long side of both triangles
		 * then do the Atlanta/Charlotte and Atlanta/orlando for triangle one
		 * 
		 * Savannah/Charlotte Savannah/Orlando for the second triangle
		 * 
		 * do the area for those then add.

		 */
		//distance between the points
		
		double radius = 6371.01;
		
		
		double distanceATLCHAR = radius * Math.acos(Math.sin(atlantaX) * Math.sin(charlotteX) 
				+ Math.cos(atlantaX) * Math.cos(charlotteX) * Math.cos(atlantaY - charlotteY));
		double distanceATLORL = radius * Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX) 
				+ Math.cos(atlantaX) * Math.cos(orlandoX) * Math.cos(atlantaY - orlandoY));
		double distanceSAVCHAR = radius * Math.acos(Math.sin(savannahX) * Math.sin(charlotteX)
				+ Math.cos(savannahX) * Math.cos(charlotteX) * Math.cos(savannahY - charlotteY));
		double distanceSAVORL = radius * Math.acos(Math.sin(savannahX) * Math.sin(orlandoX)
				+ Math.cos(savannahX) * Math.cos(orlandoX) * Math.cos(savannahY - orlandoY));
		double distanceORLCHAR = radius * Math.acos(Math.sin(orlandoX) * Math.sin(charlotteX)
				+ Math.cos(orlandoX) * Math.cos(charlotteX) * Math.cos(orlandoY - charlotteY));
		
		//area Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3))
		
		double triangleSidesACO = (distanceATLCHAR + distanceATLORL + distanceORLCHAR) / 2;
		double triangleSidesSCO = (distanceSAVCHAR + distanceSAVORL + distanceORLCHAR) / 2;
		
		double areaTriangleACO = Math.sqrt(triangleSidesACO * (triangleSidesACO - distanceATLCHAR)
				* (triangleSidesACO - distanceATLORL) * (triangleSidesACO - distanceORLCHAR));
		
		double areaTriangleSCO = Math.sqrt(triangleSidesSCO * (triangleSidesSCO - distanceSAVCHAR)
				* (triangleSidesSCO - distanceSAVORL) * (triangleSidesSCO - distanceORLCHAR));
		
		double area = areaTriangleACO + areaTriangleSCO;
		
		System.out.println("The area between the cities is " + area + ".");
	}

}
