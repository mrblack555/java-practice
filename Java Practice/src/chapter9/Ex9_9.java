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
		StringBuilder result = new StringBuilder();//��Ž��
		//��������ַ���ÿ�ĸ����ַ�һ�� Ȼ������ӽ�stringbuilder �ٰ�builder��ֵת��Ϊint����
		
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
			//����value�����е�ֵת��Ϊ16����
			int hexValue = value[0] * 8 + value[1] * 4 + value[2] * 2 + value[3]* 1 ; 
			//������Ľ����ӵ�StringBuilder��			
			result.append(String.valueOf(hexValue));
			
		
		return result.toString();
	}

}
