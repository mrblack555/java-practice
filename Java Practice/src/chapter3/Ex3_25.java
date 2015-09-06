package chapter3;

import java.util.Scanner;

public class Ex3_25 {

	public static void main(String[] args){
		System.out.print("Enter the value of three lines for triangel: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		double a = input1.nextDouble();
		double b = input2.nextDouble();
		double c = input3.nextDouble();
		if( a + b > c){
			System.out.print("The perimeter of the triangel is "+(a + b + c));
		}
		else{
			System.out.print("Your input is not valid.");
		}
	}

}
