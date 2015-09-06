package chapter10;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//default constructor to create account
	public Account() {
		
	}
	//constructor to create account with id and initial balance

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate(double annualInterestRate){
		double MonthlyInterestRate = annualInterestRate / 12;
		return MonthlyInterestRate;
	}
	public double withDraw(double withDraw){
		return balance = balance - withDraw;
	}
	public double deposit(double deposit){
		return balance = balance + deposit;
	}
	
	
	

}
