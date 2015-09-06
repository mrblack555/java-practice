package chapter3;

import java.util.Scanner;

public class Ex3_21 {

	public static void main(String[] args){
		//record the user's input
		System.out.print("Enter year: ");
		Scanner input1 = new Scanner(System.in);
		int year = input1.nextInt(); 
		System.out.print("Enter month: 1-12:");
		Scanner input2 = new Scanner(System.in);
		int month = input2.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		Scanner input3 = new Scanner(System.in);
		int day = input1.nextInt();
		//calculate the date
		
		int j = year/100;
		int k = year%100;
		int h;
		h = (day + 26*(month + 1)/10 + k + k/4 + j/4 + 5*j)%7;
		if (h == 0){
			System.out.print("Day of the week is Saturday");
		}
		else if (h == 1){
			System.out.print("Day of the week is Sunday");
		}
		else if (h == 2){
			System.out.print("Day of the week is Monday");
		}
		else if (h == 3){
			System.out.print("Day of the week is Tuesday");
		}
		else if (h == 4){
			System.out.print("Day of the week is Wednesday");
		}
		else if (h == 5){
			System.out.print("Day of the week is Thursday");
		}
		else if (h == 6){
			System.out.print("Day of the week is Friday");
		}
		
		
	}

}
