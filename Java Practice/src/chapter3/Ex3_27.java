package chapter3;

import java.util.Scanner;

public class Ex3_27 {

	public static void main(String[] args){
		System.out.print("Enter a point with two coordinates: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		double x = input1.nextDouble();
		double y = input2.nextDouble();
		if( x > 200 || y > 100 || x > 100 && y > 50 ){
				System.out.print("The point is not in the triangel");
		}
		else{
			System.out.print("The point is in the triangel");
		}
		
		
	}

}
