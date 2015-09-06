package chapter2;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args){
		System.out.println("Enter a number between 0 and 1000:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int gewei = number%10;
		int shiwei = number/10%10;
		int baiwei =  number/100;
		int sum = gewei + shiwei + baiwei;
		System.out.println("The sum of the digits is "+sum);
	}

}
