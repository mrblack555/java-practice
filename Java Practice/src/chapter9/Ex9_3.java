package chapter9;

import java.util.Scanner;

public class Ex9_3 {

	public static void main(String[] args) {
		System.out.println("Enter a password: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		if(verify(s))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static boolean verify(String s){
		//check the length of the password
		if(s.length() >= 8){
			char[] chars = s.toCharArray();//转换为字符型数组
			for(int i = 0;i < chars.length;i++){
				//verify if it is letter or digit only
				if(Character.isLetterOrDigit(chars[i]) == false){
				return false;
				
				}
			int count = 0;//count the frequncy of number
			
			for(int j = 0;j < chars.length;j++){
				if(Character.isDigit(chars[j]) == true){
					
					count += 1;
				}
			}
			//if the frequencies is bigger than 2
			if(count < 2 ){
				return false;			
				}
				
			}
			
		}
		
		return true;
	}

}
