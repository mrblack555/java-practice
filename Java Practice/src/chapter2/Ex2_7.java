package chapter2;

import java.util.Scanner;

public class Ex2_7 {
   public static void main(String[] args){
	   System.out.println("Enter the number of minutes: ");
	   Scanner input = new Scanner(System.in);
	   int minutes = input.nextInt();
	   int years    = minutes/60/24/365;
	   int day      = minutes/60/24%365;
	   System.out.println(minutes +" minutes is approximately "+years+" years and "+day+" days.");
	   
   }
	
	}


