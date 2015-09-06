package chapter5;

import java.util.Scanner;

public class Ex5_22 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		System.out.print(sqrt(num));
		
	}
	public static double sqrt(double number){
		
		double lastGuess = 1;
		boolean con = true;
		double result = 0;
		while(con == true){
			
			double nextGuess = (lastGuess + (number / lastGuess)) / 2;
			if(nextGuess - lastGuess > 0.000001){
			lastGuess = nextGuess;
			}
			else{
				con = false;
				result = nextGuess;
			}
				
		}
		return result;
	}

}
