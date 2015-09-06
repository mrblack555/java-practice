package chapter3;

import java.util.Scanner;

public class Ex3_1 {
	public static void main(String[] args){
		System.out.println("Enter a, b, c: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		//convert input into a,b,c
		double a = input1.nextDouble();	
		double b = input2.nextDouble();
		double c = input3.nextDouble();
		input1.close();
		input2.close();
		input3.close();
		if(b*b - 4*a*c > 0){
			double r1 = (-b + Math.pow(b*b - 4*a*c, 0.5))/2*a;
			double r2 = (-b - Math.pow(b*b - 4*a*c, 0.5))/2*a;
			System.out.println("The roots are "+r1+" and "+r2);		
		}
		else if(b*b - 4*a*c == 0){
			double r = -b/2*a;
			System.out.println("The root is "+r);
			
		}
		else{
			System.out.println("The equation has no real roots");
		}
		
		

	
	}
	

}
