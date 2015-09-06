package chapter6;

import java.util.Scanner;
public class Ex6_3e2 {

	public static void main(String[] args) {
		Scanner input = new Scanner ( System.in );
		System.out.print ( "Enter the integers between 1 and 100: ");
		
		int integer = input.nextInt();
		int[] count = new int[100];
		
		while (integer != 0){
			count[integer]++;
			integer = input.nextInt();
		}
		
		for(int i = 1; i < 100; i++){
			if( count[i] > 0)
				System.out.println(i + " occurs " + count[i] + ((count[i] == 1) ? " time" : " times"));
		}
		// TODO Auto-generated method stub

	}

}
