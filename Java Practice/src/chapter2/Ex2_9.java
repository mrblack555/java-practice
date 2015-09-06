package chapter2;

import java.util.Scanner;

public class Ex2_9 {
	public static void main(String[] args){
		//create a scanner
		
		Scanner input = new Scanner(System.in);
		
		
		//Receive the amount
		System.out.print("Enter an amount in int, for example 1156: ");
		int amount = input.nextInt();
		input.close();
		
		int dollar = amount/100;
		int pennies = amount%100;
		System.out.print(amount+" means "+dollar+" dollars "+pennies+" pennies." );
		
	}
	

}
