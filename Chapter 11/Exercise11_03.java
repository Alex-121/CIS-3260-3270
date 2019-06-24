package edu.gsu.cis3270.chapter11;

import java.util.Date;

public class Exercise11_03 {

	public static void main(String[] args) {
		
		
		Checkings a1 = new Checkings(1, 1000);
		a1.withdraw(150);
		System.out.println(a1);
		Savings s1 = new Savings(2,50);
		System.out.print(s1);
		s1.withdraw(51);
		
		}
	}

class Account {
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		
		//new default to account for the child object calling to create an object
		public Account() {
			
			this(1, 0);
		}
		
		public Account(int id, double ibalance) {
			this.id = id;
			this.balance = ibalance;
			this.dateCreated = new Date();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		public Date getDateCreated() {
			return dateCreated;
		}
		
		public double getMonthlyInterestRate() {
			double interest = this.annualInterestRate / 100;
			
			return interest / 12;
		}
		
		public double getMonthlyInterest() {
			
			return balance * getMonthlyInterestRate();
		}
		
		public void withdraw(double a) {
			this.balance -= a;
		}
		
		public void deposit(double a) {
			 this.balance += a;
		}
		//create a toString for account to override the object.toString
		public String toString() {
			return "Account ID:" + id + "\nBalance: " + balance + "\nDate Created: " + dateCreated
					+ "\nIntrest rate: " + annualInterestRate;
		}
	}

class Checkings extends Account {
	//new variable to handle overdrafts set by bank
	private final double OVERDRAFT_LIMIT = -100;
	
	//calls super constructor
	public Checkings() {
		
	}
	// the user create a specific account
	public Checkings(int id, double balance) {
		super(id,balance);
	}
	
	//override the withdraw method to check against the overdraft limit
	public void withdraw(double a) {
		if(getBalance() - a > OVERDRAFT_LIMIT) 
			setBalance(getBalance() - a);
			else
				System.out.println("Error: Hit overdraft limit.");
	}
	
	public String toString() {
		return "\nChecking " + super.toString() + "\noverdraft limit: " + OVERDRAFT_LIMIT;
	}
}
class Savings extends Account {
	
	public Savings() {
		
	}
	public Savings(int id, double balance) {
		super(id,balance);
	}
	
	
	public void withdraw(double a) {
		if(a < getBalance())
			setBalance(getBalance() - a);
		else
			System.out.println("\nError: Attempted overdraft");
	}
	public String toString() {
		return "Saving " + super.toString();
	}
}

