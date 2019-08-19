package chapter18;

public class Exercise18_07 {

	static int count = 0;
	public static void main(String[] args) {
		System.out.println(fib(12));
		System.out.println(count);
	}
	

	public static int fib(long num) {
		count++;
		if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		else {
			
			return fib(num - 1) + fib(num - 2);
		}
			
	}
}
