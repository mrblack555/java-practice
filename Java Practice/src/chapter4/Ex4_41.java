package chapter4;

import java.util.Scanner;

public class Ex4_41 {

	public static void main(String[] args) {
		int max = 0;
		int count = 0;
		do{
		Scanner input = new Scanner(System.in);
		int i =input.nextInt();
		if(i == max){
			count++;
			
		}
		else if	(i > max){
			max  = i;
			count = 0;
		}
			}while(count < 2);
		System.out.println("The largest number is "+max);
		System.out.println(count+1);
		
	}

}
