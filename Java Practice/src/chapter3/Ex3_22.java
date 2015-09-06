package chapter3;

import java.util.Scanner;

public class Ex3_22 {

	public static void main(String[] args){
		System.out.print("Enter a point with two coordinates: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		double x = input1.nextDouble();
		double y = input2.nextDouble();
		double distance = Math.pow((x - 0)*(x - 0) + (y - 0)*( y - 0), 1/2);
		if(distance <= 10){
			System.out.print("Point "+ "("+x+","+y+")"+" is "+" in "+"the "+"circle");
		}
		if(distance > 10){
			System.out.print("Point "+ "("+x+","+y+")"+" is "+ "not" + " in "+"the "+"circle");
		}
		
	}

}
