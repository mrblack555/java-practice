package chapter4;

import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int a = input.nextInt();
		int c = 0;
		boolean space1 = false;
		boolean space2 = false;
		for(int i = 1; i <= a;i++){
			for(int j = i;  j <= a && j > 0;j--){
				if(space1 == false){
				for(c = j;c < a;c++){
					System.out.print(" ");
					
				}
				space1 = true;
					}
				System.out.print(j);
				
			}
			for(int l = 2;l <= i ;l++){
				
				System.out.print(l);
			}
			System.out.println();
			space1 = false;
			
		}
		
	}

}
