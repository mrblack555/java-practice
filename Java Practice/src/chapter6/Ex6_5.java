package chapter6;

import java.util.Scanner;

public class Ex6_5 {

	public static void main(String[] args) {
		//create an array with length of ten		
		int[] a = new int[10];
				
		//input ten integers
		System.out.println("Enter ten numbers: ");
		for(int i = 0;i < a.length;i++){
			Scanner input = new Scanner(System.in);
			int b = input.nextInt();
			if(filter(b,a) == false){
				a[i] = b;
			}
			else
				continue;
			input.close();
		}
		display(a);
		
	}
	
	public static boolean filter(int b,int[] a){
		boolean t = false;
		for(int i = 0; i < a.length;i++){
			if(b == a[i])
				t = true;
				
				
		}
		return t;
	}
	public static void display(int[] a){
		for(int i = 0;i < a.length;i++){
			if(a[i] != 0 )
			System.out.print(a[i] + " ");
		}
	}

}
