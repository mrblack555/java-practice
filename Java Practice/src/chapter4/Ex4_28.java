package chapter4;

import java.util.Scanner;

public class Ex4_28 {

	public static void main(String[] args) {
		System.out.println("Enter the Year and the day of the date: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int day = input.nextInt();
		for (int month = 1;month <= 12;month++){
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
					month == 10 || month == 12){
				for(int j = 1;j <= 31;j++){
					if( j == 1){
						System.out.println(month+" "+j+","+" "+year+" is "+day);
						continue;
					}
				day++;
				if(day > 6){
					day = 0;
					}
				
				}
			}
			else if(month == 2){
				if(year%400 ==0 && year%100 != 0 || year % 4 == 0 ){
					for(int j = 1; j <= 29;j++){
						day++;
						if(day > 6){
							day = 0;
							}
						if( j == 1){
							System.out.println(month+" "+j+","+" "+year+" is "+day);
						}
					}
					
				}
				else{
					for(int j = 1; j <= 28;j++){
						day++;
						if(day > 6){
							day = 0;
							}
						if( j == 1){
							System.out.println(month+" "+j+","+" "+year+" is "+day);
						}
					}
					
				}
			}
			else{
				for(int j = 1;j <= 30;j++){
					day++;
					if(day > 6){
						day = 0;
						}
					if( j == 1){
						System.out.println(month+" "+j+","+" "+year+" is "+day);
					}
					}
			}
	
		}
			
	}
	

}
