package chapter3;

import java.util.Scanner;

public class Ex3_28 {

	public static void main(String[] args){
		System.out.print("Enter r1's center x, y coordinates, width, and height: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		double x1 = input1.nextDouble();
		double y1 = input2.nextDouble();
		double w1 = input3.nextDouble();
		double h1 = input4.nextDouble();
		System.out.print("Enter r2's center x, y coordinates, width, and height: ");
		Scanner input5 = new Scanner(System.in);
		Scanner input6 = new Scanner(System.in);
		Scanner input7 = new Scanner(System.in);
		Scanner input8 = new Scanner(System.in);
		double x2 = input5.nextDouble();
		double y2 = input6.nextDouble();
		double w2 = input7.nextDouble();
		double h2 = input8.nextDouble();
		if((x1 + w1 > x2 + w2) && (y1 + h1 > y2 + h2)){
			System.out.print("r2 is inside r1");
		}
		else if((x1 + w1/2 < x2 - w2/2 || y1 + h1/2 < y2 - h2/2 || x1 - w1/2 > x2 + w2/2 || y1 - h1/2 > y2 + h2/2 )){
			System.out.print("r2 does not overlap r1");
		}
		else{
			System.out.print("r2 overlaps r1");
		}
		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");  
		
		
	}
		
		
}


