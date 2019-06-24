package edu.gsu.cis3270.chapter09;

public class Exercise09_07 {

	public static void main(String[] args) {
		Account a1 = new Account(1122,20_000);
		
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		
		System.out.println("Account " + a1.getId() + " balance: " + a1.getBalance());
		System.out.println("Account " + a1.getId() + " monthly interest: " + a1.getMonthlyInterest());
		System.out.println("Account " + a1.getId() + " date created: " + a1.getDateCreated());
		System.out.println(a1);
	}

}
