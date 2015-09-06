package chapter4;

import java.util.Scanner;

public class Ex4_38 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int j;
		int count = 0;
		do{
			j = i % 16;
			i = i / 16;
			if(j == 10){
				System.out.print("A");
			}
			else if(j == 11){
				System.out.print("B");
			}
			else if(j == 12){
				System.out.print("C");
			}
			else if(j == 13){
				System.out.print("D");
			}
			else if(j == 14){
				System.out.print("E");
			}
			else if(j == 15){
				System.out.print("F");
			}
			else{
			System.out.print(j);
			}
			
			if(i / 16 == 0){
				count++;
			}
			
		}while(count != 2);
	}

}
