package chapter6;

import java.util.Scanner;
public class Ex6_5e2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter ten numbers: ");
		int[] count = new int[11];
		int number = input.nextInt();
		System.out.print (" The distinct numbers are: ");
		
		for ( int i = 1; i < 11; i++){
			number = input.nextInt();
			count[number]++;
			if(count[number] < 2 ){
				System.out.print( number + " ");
			}
		
		}
		// TODO Auto-generated method stub

	}

}
