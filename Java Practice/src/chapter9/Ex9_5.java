package chapter9;

import java.util.Scanner;

public class Ex9_5 {

	public static void main(String[] args) {
		System.out.println("Enter one string:");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();//�����ַ���
		int[] a = count(s);//���������������
		//������
		for(int i = 0;i < a.length;i++){
			System.out.println(i+" appears "+a[i]+" times.");
		}
	}
	public static int[] count(String s){
		int[] a = new int[10];
		for(int i = 0;i < s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				int b = Integer.parseInt(String.valueOf(s.charAt(i)));;
				a[b]++;
			}
		}
		return a;
	}

}
