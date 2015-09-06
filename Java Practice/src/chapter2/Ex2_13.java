package chapter2;

import java.util.Scanner;

public class Ex2_13 {

	public static void main(String[] args){
		System.out.println("Enter investment amount: ");
		Scanner input = new Scanner(System.in);
		double investmentAmount = input.nextDouble();
		//input.close();
		System.out.println("Enter monthly interest rate: ");
		Scanner input2 = new Scanner(System.in);
		double annuallyInterestRate = input2.nextDouble()/100;
		
		//input2.close();
		System.out.println("Enter number of years:");
		Scanner input3 = new Scanner(System.in);
		double numberofyears = input2.nextDouble();
		//input3.close();
		double rate = Math.pow(0.0425, 12);
		//calculate the future Investment value
		double futureInvestValue = investmentAmount * (1+rate);
		//display results
		System.out.println("Accumulated value is "+futureInvestValue);
		System.out.println(rate);
		
		
	}

}
