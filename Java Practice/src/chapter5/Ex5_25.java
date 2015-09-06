package chapter5;

import java.util.Scanner;

public class Ex5_25 {

	public static void main(String[] args) {
		//input a number
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		//execute the convert function
		convertMillis(a);
		}
	public static void convertMillis(long millis){
		long seconds = millis/1000;
		long minutes = 0;
		long hours = 0;
		if(seconds > 60){
			minutes = seconds/60;
			seconds = seconds%60;
			if(minutes > 60){
				hours = minutes/60;
				minutes = minutes%60;
			}
			System.out.println(hours+":"+minutes+":"+seconds);
		}
		else
			System.out.println("0:0:"+seconds);
	}

}
