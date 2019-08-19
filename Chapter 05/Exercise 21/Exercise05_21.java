package edu.gsu.cis3270.chapter05;
/*(Financial application: compare loans with various interest rates) 
 * Write a program that lets the user enter the loan amount and loan period in number of years 
 * and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8. 
 * For the formula to compute monthly payment, see Listing 2.9 ComputeLoan.java. 
 * double monthlyPayment = loanAmount * monthlyInterestRate / (1- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
 * double monthlyInterestRate = annualInterestRate / 1200;
 */
import java.util.Scanner;
public class Exercise05_21 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the loan amount: ");
		double loanAmount = in.nextDouble();
		System.out.print("Enter the number of years: ");
		int numberOfYears = in.nextInt();
		
		//set initial interest to what the question said
		//have to practice formating output so here it is. the s means string with spaces to the left - and positive to the right
		System.out.printf("%-21s%-20s%-13s","Intrest Rate","Monthy Payments", "Total Payment" + "\n");
		for(double interestRate = 5.00; interestRate < 8; interestRate += .125) {
			
			//use formula's from 2.9
			double monthlyInterestRate = interestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			//more formatting practice
			System.out.printf("%.3f%%%22.2f%21.2f",interestRate,monthlyPayment,totalPayment);
			System.out.println();
			
			
			
		}
			
	in.close();	
	}

}
