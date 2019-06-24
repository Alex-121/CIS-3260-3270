package edu.gsu.cis3270.chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise11_13 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < 10; i++)
			a.add(in.nextInt());
		
		removeDuplicate(a);
		in.close();
		}
	
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		//new array to store list
		ArrayList<Integer> newList = new ArrayList<>();
		
		//search though the list
		for(Integer a: list)
			// if the new list doesn't contain the element, add it
			if(!newList.contains(a))
				newList.add(a);
		
		//print the new list
		System.out.println(newList);
	}

}
