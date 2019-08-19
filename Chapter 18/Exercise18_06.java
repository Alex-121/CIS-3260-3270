package chapter18;

public class Exercise18_06 {

	public static void main(String[] args) {
		
		System.out.println(summation(2));
	}
	
	public static double summation(double i) {
		if(i == 0) 
			return 0;
		else
			return i / (i + 1) + summation(i - 1);
	}
}
