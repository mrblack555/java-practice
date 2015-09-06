package chapter2;

import java.util.Scanner;

public class Ex2_8 {

	
		public static void main(String[] args){
			System.out.println("Enter an ASCII code:");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			char ch = (char)number;
			System.out.println("The character for ASCII code "+number+" is "+ch);
		
	}

}
