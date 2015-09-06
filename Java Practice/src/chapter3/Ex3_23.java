package chapter3;

import java.util.Scanner;

public class Ex3_23 {
	public static void main(String[] args){
		System.out.print("Enter a point with two coordinates: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		double x = input1.nextDouble();
		double y = input2.nextDouble();
		double xdistance = x ;
		double ydistance = y;
		if(xdistance <= 5 && ydistance <= 2.5 ){
			System.out.print("Point "+ "("+x+","+y+")"+" is "+" in "+"the "+"rectangle");
		}
		if(ydistance > 2.5 && xdistance > 5 ){
			System.out.print("Point "+ "("+x+","+y+")"+" is "+ "not" + " in "+"the "+"rectangle");
		}
	}

}
