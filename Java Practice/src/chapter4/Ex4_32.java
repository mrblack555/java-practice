package chapter4;

import java.util.Scanner;

public class Ex4_32 {

	public static void main(String[] args) {
		int lottery = 0;
		int lotteryDigit1 = 1;
		int lotteryDigit2 = 1;
		
		//Generate a lottery
		do{
		lottery = (int)(Math.random() * 100);
		//Get digits from lottery
		lotteryDigit1 = lottery / 10;
	    lotteryDigit2 = lottery % 10;
		}while(lotteryDigit1 == lotteryDigit2);
	
		
		
		
		// prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
				
		//Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is "+ lottery );
		
		//check the guess
		if(guess == lottery){
			System.out.println("Exact match: you win $10,000");
		}
		else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 ){
			System.out.println("Match one digit: you win $3,000");
		}
		else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2){
			System.out.println("Match one digit: you win $1,000");
		}
		else
			System.out.println("Sorry, no match");
			
	}

}
