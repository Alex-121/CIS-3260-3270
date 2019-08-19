package chapter18;
/*18.4 (Sum series) Write a recursive method to compute the following series:
 * m(i)=1+1/2+1/3+…+1/i
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class Exercise18_04 {

	public static void main(String[] args) {
		System.out.printf("%1.6f",summation(2));
	}
	
	public static double summation(double a) {
		if(a == 1)
			return 1;
		
		return 1/ a + summation(a-1);
	}
	
}
