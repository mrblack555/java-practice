package chapter2;

import java.util.Scanner;

public class Ex2_3 {
	public static void main(String[] args){
		System.out.println("Enter a value of feet: ");
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		double meters = 0.305 * feet;
		System.out.println(feet+" feet is "+meters+" meters");
	}
	
	

}
