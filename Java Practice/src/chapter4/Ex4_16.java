package chapter4;

import java.util.Scanner;

public class Ex4_16 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		for (int i = 2;i <= a;i++){
			for (int j = 0;j <a;j++){
				if(a%i == 0){
					System.out.println(i);
					a = a/i;
					//System.out.println(a);
					}
			
				}
			}
		}

}
