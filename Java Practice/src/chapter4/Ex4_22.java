package chapter4;

import java.util.Scanner;

public class Ex4_22 {

	public static void main(String[] args) {
		System.out.println("Loan Amount: ");
		Scanner input = new Scanner(System.in);
		int loan = input.nextInt();
		System.out.println("Number of Years: ");
		int years = input.nextInt();
		System.out.println("Annual Interest Rate: ");
		double annualinterestrate = input.nextInt();
		double balance = loan;
		double monthlyInterestRate = annualinterestrate/1200;
		//Calculate payment
		double monthlyPayment = loan * monthlyInterestRate / (1- 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		double totalpayment = monthlyPayment * years * 12;
		
		System.out.println("Monthly Payment: "+monthlyPayment);
		System.out.println("Annual Interest Rate: "+totalpayment);
		for(int i = 1;i <= years * 12;i++){
			
			
			
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}
		
		
		
		
	}

}
