package chapter4;

import java.util.Scanner;

public class Ex4_26 {

	public static void main(String[] args) {
		System.out.println("Enter the value of i: ");
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		double e = 1;
		double sum = 1 ;
		double b = 0;
		//¿ªÊ¼½×³ËÔËËã
		for(double j = 1;j <= i;j++){
			sum = 1;
			for(double a = j;a > 0;a--){
				b = a;
				//System.out.println("a = "+b);
				
				sum = a * sum;
				//System.out.println(sum);
				
				
			}
			sum = 1/sum;
			
			
			
			e = e + sum;
		}
		System.out.println(e);
	}

}
