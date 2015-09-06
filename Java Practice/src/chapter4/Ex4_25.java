package chapter4;

import java.util.Scanner;

public class Ex4_25 {

	public static void main(String[] args) {
		System.out.println("Enter the value of i: ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		double pi = 0;
		for(double j = 1; j<i;j++){
			if(j%2 == 1){
				 pi = 1/(2*j - 1) - 1/(2*j + 1)+ pi;
			}
			
		}
		
		pi = 4 * pi;
		System.out.print(pi);
	}

}
