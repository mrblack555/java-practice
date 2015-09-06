package chapter4;

import java.util.Scanner;

public class Ex4_21 {

	public static void main(String[] args) {
		System.out.println("Loan Amount: ");
		Scanner input = new Scanner(System.in);
		int loan = input.nextInt();
		System.out.println("Number of Years: ");
		int years = input.nextInt();
		System.out.println("Interest Rate  "+"  Monthly Payment  "+"  Total Payment  ");
		double annualinterest = 5.0;
		for(int i = 1;i <= 25;i++){
		double monthlyInterestRate = annualinterest/1200;
		//Calculate payment
		double monthlyPayment = loan * monthlyInterestRate / (1- 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		double totalpayment = monthlyPayment * years * 12;
		System.out.println(annualinterest+"    "+String.format("%.2f", monthlyPayment)  +"    "+String.format("%.2f", totalpayment));
		annualinterest = annualinterest + 0.125;
		if(annualinterest > 8 ){
			break;
		}
		
		
		
		}
				
	}

}
