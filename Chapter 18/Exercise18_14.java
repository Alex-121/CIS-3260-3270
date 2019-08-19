package chapter18;
/*18.14 (Find the number of uppercase letters in a string)
 * Write a recursive method to return the number of upperase letters in a string. 
 * Write a test program that prompts the user to enter a sting and displays the number of uppercase letters in the string.
 */
public class Exercise18_14 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String userInput = in.nextLine();
		
		System.out.println("The number of uppercase letters is: " + upperCaseLetters(userInput));
		in.close();
	}

	public static int upperCaseLetters(String userInput) {
		int index = 0; //Initial index for charAt(isupperCase) test
		int count = 0;
		return upperCaseLetters(userInput, index, count);
	}

	private static int upperCaseLetters(String userInput, int index, int count) {
		if(index == userInput.length())
			return count;
		else if(Character.isUpperCase(userInput.charAt(index))) 
			return upperCaseLetters(userInput, index + 1, count +1);
		return
				upperCaseLetters(userInput,index +1, count);
		
	}
}
