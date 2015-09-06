package chapter3;

import java.util.Scanner;

public class Ex3_4 {

	public static void main(String[] args){
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is "+ number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		input.close();
		int trueth = number1 + number2;
		if(answer == trueth){	
			System.out.println("You are right!");
		}
		else{
			System.out.println("You are false!");
		}
	}

}
