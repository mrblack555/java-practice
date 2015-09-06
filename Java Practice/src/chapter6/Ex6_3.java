package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_3 {

	
	public static void main(String[] args){
		//create array
		int[] a = new int[100];
		
		System.out.println("Enter the integers between 1 and 100:");
		
		for(int i = 0;i < a.length;i++){
			Scanner input = new Scanner(System.in);
			int b = input.nextInt();
			
				if(b == 0)
				break;			
				else 
				a[i] = b;
				
				
			}
			Arrays.sort(a);
			occurence(a);
			display(occurence(a));
		
		
		
	}
	//count the occurrences of the number
	public static int[] occurence(int[] a){
		//declare and create an array of 100 
		int[] counts = new int[100];
		
		//for each number in the array count it
		for(int i = 0;i < a.length;i++){
			counts[a[i]]++;
		}
		return counts;
	}
	
	//display the occurrences of the number
	public static void display(int[] counts){
		for(int i = 0;i < counts.length;i++){
			if(counts[i] != 0 && counts[i] > 1 && i > 0){
				System.out.println(i + " occurs " + counts[i] + " times");
			}
			else if(counts[i] !=0 && counts[i] == 1 && i > 0){
				System.out.println(i + " occurs " + counts[i] + " time");
			}
		}
	}
}
