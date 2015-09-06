package chapter6;

import java.util.Scanner;

public class Ex6_18 {

	public static void main(String[] args) {
		//create an array
		double[] a = new double[10];
		//input ten double numbers
		System.out.println("Enter ten double numbers: ");
		for(int i = 0;i < a.length;i++){
			Scanner input = new Scanner(System.in);
			double b = input.nextDouble();
			a[i] = b;			
		}
		bubblesort(a);
		display(a);
	}
	public static double[] bubblesort(double[] a){
		double temp = 0;
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a.length - 1;j++){
				if(a[j] > a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	public static void display(double[] a){
		for(int i = 0; i < a.length;i++){
			System.out.print(a[i] + " ");
		}
	}

}
