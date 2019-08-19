package chapter18;

public class Exercise18_02 {
	
	public static void main(String[] args) {
	System.out.println(fib(35));
		
		
	}
	
	public static long fib(long n) {
		
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		
		if(n == 0)
			return f0;
		else if(n == 1)
			return f1;
		else {
			
			for(int i = 1; i < n; i++) {
			
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;	
			
		}
		return currentFib;
	
		}		
	}
	
}
