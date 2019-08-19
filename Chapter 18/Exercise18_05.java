package chapter18;

public class Exercise18_05 {
	
	public static void main(String[] args) {
		System.out.println(summation(2));
	}
	
	public static double summation(double a) {
		if(a == 0) 
			return 0;
			
		return a / (2 * a + 1) + summation(a - 1);
		
	}
}
