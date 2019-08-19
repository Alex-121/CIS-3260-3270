package chapter18;

public class Exercise18_08 {

	public static void main(String[] args) {
		
//		Testing
//		int num = 102;
//		String temp = "";
//		for(int i = 0; i < 3; i++) {
//			temp += num % 10;
//			num /= 10;
//		}
//		System.out.println(temp);
		
		reverseDisplay(102);
	}
	
	public static void reverseDisplay(int value) {
		
		if(value < 10)
			System.out.println(value);
		
		else {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}
}
