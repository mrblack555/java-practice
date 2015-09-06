package chapter6;

import java.util.Scanner;

public class Ex6_19 {

	public static void main(String[] args) {
		//input the number of students
		System.out.println("The number of students: ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
		//create an array of grade
		int[] grade = new int[i];
		//input the grade of student
		System.out.println("Enter the grade of students:");
		for(int j = 0;j < grade.length;j++){
			grade[j] = input.nextInt();
		}
		//create an array of students' name
		String[] name = new String[i];
		//input the name of students
		System.out.println("Enter the name of students:");
		for(int j = 0;j < name.length;j++){
			name[j] = input.next();
		}
		sort(grade,name);
		display(name);
	}
	//sort the number and swap the name
	public static void sort(int[] grade,String[] name){
		for(int j = 0;j < grade.length;j++){
			for(int m = 0; m < grade.length - 1;m++){
				if(grade[m] < grade[m+1]){
					int temp = grade[m];
					String str = name[m];
					//swap the number
					grade[m] = grade[m+1];
					grade[m+1] = temp;
					//swap the name
					name[m] = name[m+1];
					name[m+1] = str;
				}
			}
			 
		}	
	}
	//display the name
	public static void display(String[] name){
		for(int j = 0;j < name.length;j++){
			System.out.print(name[j] + " ");
		}
	}

}
