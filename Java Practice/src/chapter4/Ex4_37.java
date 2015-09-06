package chapter4;

import java.util.Scanner;

public class Ex4_37 {

	public static void main(String[] args){
		System.out.println("Enter an integer in decimal: ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int j;
		int count = 0;
		do{
			j = i % 2;
			i = i / 2;
			System.out.print(j);
			if(i / 2 == 0){
				count++;
			}
			
		}while(count != 2);
	}
	

}
