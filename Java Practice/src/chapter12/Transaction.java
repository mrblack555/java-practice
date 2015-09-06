package chapter12;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
	
	 private Date date;
	 private double amount;
	 private double balance;
	 private String description;
	 private char type;
	public double Transaction(char type,double amount,double balance,String description) {
		if(type == 'W'){
			balance = balance - amount;
		}
		else if(type == 'D'){
			balance = balance + amount;	
		}
		return balance;
	}

}
