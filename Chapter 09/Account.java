package edu.gsu.cis3270.chapter09;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		
	}
	
	public Account(int id, int ibalance) {
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
	
}
