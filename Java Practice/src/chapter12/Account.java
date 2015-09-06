package chapter12;

import java.util.ArrayList;
import java.util.Date;

public class Account extends Transaction {
	String name;
	private int id;
	private double balance  = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	ArrayList transactions = new ArrayList();
	int i = 0;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name,int id,int balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
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
	public double getMonthlyInterestRate(double annualInterestRate){
		double MonthlyInterestRate = annualInterestRate / 12;
		return MonthlyInterestRate;
	}
	public double withDraw(double withdraw){
		Transaction t1 = new Transaction();
		t1.Transaction('W', withdraw, balance, "»°«Æ");
		transactions.add(withdraw);
		return balance;
	}
	public double deposit(double deposit){
		Transaction t2 = new Transaction();
		t2.Transaction('D', deposit, balance, "¥Ê«Æ");
		transactions.add(deposit);
		return balance;
	}
}
