package chapter5;

import java.util.Scanner;

public class Ex5_3_edition2 {

	//main函数执行其他方法 用户输入
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = input.nextInt();
		 reverse(a);
		if(isPalindrome(a) == true){
			System.out.println("The number is Palindrome.");
		}
		else
			System.out.println("The number is not Palindrome.");
	}
	
	
	//return the reversal of an integer, i.e. reverse(456) returns 654
	public static int reverse(int number){
		int count = 1;
		int reversed = 0;
		int temp = number;
		int c = 1;
		int temp2 = 0;
		boolean j = false;
		 while(temp >= 10){
			 count++;
			 temp = temp/10;
		 }
		 temp = number;
		 int temp3 = count;
		 //把位数求出来4位就是1000
		 while(temp3 > 1){
			 c *= 10;
			 temp3--;
		 }
		 
		 //design a loop to split the numbers  of the input number. 1 in 1000 is 1
		 while(j == false){
			 if(temp < 10){
				 j = true;
			 }
				 
			 int b = 10;
			 
			 temp2 = temp2 + (temp % b )* c;
			 temp = temp/10;
			 c = c / 10;
			 number = temp2;
			 
		 }
		 
		 
		 
		 
		 return number;
	}
	//return true if number is Palindrome
	public static boolean isPalindrome(int number){
		boolean i = true;
		//if the original number equals to the reversed number it is Palindrome
		if(number == reverse(number)){
			i = true;
		}
		//it is not
		else
			i = false;
		return i;
		
	}

}
