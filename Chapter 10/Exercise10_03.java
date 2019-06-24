package edu.gsu.cis3270.chapter10;
/*10.3 (The MyInteger class) Design a class named MyInteger. The class contains:
	•An int data field named value that stores the int value represented by this object.
	•A constructor that creates a MyInteger object for the specified int value.
	•A getter method that returns the int value.
	•The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
	•The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
	•The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
	•The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
	•A static method parseInt(char[]) that converts an array of numeric characters to an int value.
	•A static method parseInt(String) that converts a string into an int value.

 * Draw the UML diagram for the class and then implement the class. 
 * Write a client program that tests all methods in the class.
 */
public class Exercise10_03 {

	public static void main(String[] args) {
		/*test isEven,odd,prime(int a)
		 * an array is easier to cycle through
		 */
		int[] a = {2,3,12,11};
		
		System.out.println("Test isEven(int)");
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i] + " " + MyInteger.isEven(i));
		
		System.out.println("Tests isOdd(int)");
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i] + " " + MyInteger.isOdd(i));
		

		System.out.println("Tests isPrime(int)");
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i] + " " + MyInteger.isPrime(i));
		
		//test isEven, odd, prime()
		System.out.println("Test isEven()");
		for(int i = 0; i < a.length; i++) {
			
			MyInteger a1 = new MyInteger(a[i]);
			System.out.println(a[i] + " " + a1.isEven());
		}
		
		System.out.println("Test isOdd()");
		for(int i = 0; i < a.length; i++) {
			
			MyInteger a1 = new MyInteger(a[i]);
			System.out.println(a[i] + " " + a1.isOdd());
		}
		
		System.out.println("Test isPrime()");
		for(int i = 0; i < a.length; i++) {
			
			MyInteger a1 = new MyInteger(a[i]);
			System.out.println(a[i] + " " + a1.isPrime());
		}
		
		//test isEven, odd, prime(myinteger a)
		System.out.println("Test isEven(MyInteger a)");
		for(int i = 0; i < a.length; i++) {
			
			MyInteger a1 = new MyInteger(a[i]);
			System.out.println(a[i] + " " + MyInteger.isEven(a1));
		}
		
		System.out.println("Test isOdd(MyInteger a)");
		for(int i = 0; i < a.length; i++) {
			
			MyInteger a1 = new MyInteger(a[i]);
			System.out.println(a[i] + " " + MyInteger.isOdd(a1));
		}
		
		System.out.println("Test isPrime(MyInteger a)");
		for(int i = 0; i < a.length; i++) {
			
			MyInteger a1 = new MyInteger(a[i]);
			System.out.println(a[i] + " " + MyInteger.isPrime(a1));
			
		}
		
		//test equals(int) and equals(MyInteger)
		MyInteger test = new MyInteger(12);
		System.out.println("Test if " + test.getValue() + " is equal to a specific value");
		for(int i = 0; i < a.length; i++) 
			System.out.println(a[i] + " " +  test.equals(a[i]));
		
		System.out.println("Test if " + test.getValue() + 
				" is equal to the specified value:");
			for (int i = 0; i < a.length; i++) {
				MyInteger myInteger = new MyInteger(a[i]);	
				System.out.println(a[i] + " " + test.equals(myInteger));
			}
			
		// Test parseInt(char[]) and parseInt(String)
		System.out.println("Test parseInt(char[]) and parseInt(String):");
		// Create a character array
		char[] numericCharacters = {'1', '2', '3'};

		// Create a string
		String numericString = "456";
		System.out.print("\'");
			for (int i = 0; i < numericCharacters.length; i++) {
			 	System.out.print(numericCharacters[i] + "");
			} 
			System.out.println("\' + \"" + numericString + "\" = " + 
				(MyInteger.parseInt(numericCharacters) + 
				MyInteger.parseInt(numericString)));
	}

}
