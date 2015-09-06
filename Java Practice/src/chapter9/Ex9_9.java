package chapter9;

import java.util.Scanner;

public class Ex9_9 {

	public static void main(String[] args) {
		//prompt user to enter a binary code
		System.out.println("Enter a binary number: ");
		Scanner input = new Scanner(System.in);
		String binaryValue = input.nextLine();
		binaryToHex(binaryValue);
		
	}
	public static String binaryToHex(String binaryValue){
		StringBuilder hex = new StringBuilder();
		int[] value = new int[binaryValue.length()];
		StringBuilder result = new StringBuilder();//存放结果
		//把输入的字符串每四个数字分一组 然后再添加进stringbuilder 再把builder的值转化为int数组
		
			for(int j = 0;j < binaryValue.length();j++){
				int count = 0;
				hex.append(binaryValue.charAt(j));
				value[j] = Integer.parseInt(hex.toString());
				j++;
				hex.append(binaryValue.charAt(j));
				value[j] = Integer.parseInt(hex.toString());
				j++;
				hex.append(binaryValue.charAt(j));
				value[j] = Integer.parseInt(hex.toString());
				j++;
				hex.append(binaryValue.charAt(j));
				value[j] = Integer.parseInt(hex.toString());
				if(count >= binaryValue.length() / 4)
					break;
				
				
			}
			//计算value数组中的值转化为16进制
			int hexValue = value[0] * 8 + value[1] * 4 + value[2] * 2 + value[3]* 1 ; 
			//将计算的结果添加到StringBuilder中			
			result.append(String.valueOf(hexValue));
			
		
		return result.toString();
	}

}
