package chapter9;

import java.util.Scanner;

public class Ex9_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = new String();
		s1 = input.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = new String();
		s2 = input.nextLine();
		if(issubString(s1,s2))
			System.out.println("The first String is the substring of the second String.");
		else
			System.out.println("The first String is not the substring of the second String.");
		
	}
	public static boolean issubString(String s1,String s2){
		if(s2.indexOf(s1) != -1)
			return true;
		else
			return false;
			
	}

}
