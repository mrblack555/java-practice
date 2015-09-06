package chapter5;

import java.util.Scanner;

public class Ex5_21 {
	
	public static void main(String[] args){
		System.out.println("Enter ten numbers: ");
		double a = 0;
		double sum = 0;
		double deviation = 0;
		double b = 0;
		double sum2 = 0 ;
		for(int i = 1;i <= 10;i++){
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		sum = sum(a,sum);
		b = a * a;//x*x
		sum2 = sum(b,sum2);
		double sub = sum2 - ( Math.pow(sum, 2)/ 10);
		sub = sub/9;
		//calculate the derivation
		deviation = Math.sqrt(sub);
		}
		
		double average = sum/10;
		System.out.println("The average value of ten numbers is: "+average);
		System.out.println("The deviation value of ten numbers is:"+deviation);
	}	
		
	//caculate the sum of the input
	public static double sum(double number1,double number2){
		
		double sum = number1 + number2;
		
		return sum;
	}
	

	

}
