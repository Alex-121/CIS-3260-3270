package edu.gsu.cis3270.chapter03;
import java.util.Scanner;

public class Exercise03_17 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		//prompt user
		System.out.print("Play Rock Papers Scissors! Enter 0 for Scissors,"
		+" 1 for Rock or 2 for Paper: ");
		//save the value
		int player = input.nextInt();
		
		//generate a random number
		int randomNumber = (int) (Math.random() * 3);
		
		/*
		Conditions:
		(scissor can cut paper, 0 wins against 2
		rock can knock scissor, 1 wins against 0
		paper can wrap rock,    2 wins against 1) 
		*/
		
		
		if (randomNumber == player)
			
			System.out.println("It's a draw!");
		else {
		
			boolean win = (player == 0 && randomNumber == 2) ||
						  (player == 1 && randomNumber == 0) ||
						  (player == 2 && randomNumber == 1);	
			if (win)
				System.out.println("You Win!");
			else 
				System.out.println("You Lose.");
		}
		
		input.close();
	}

}