package chapter4;

public class Ex4_27 {

	public static void main(String[] args) {
		int count = 0;
		for(int year = 2001;year <= 2100;year++){
			if(year%400 ==0 && year%100 != 0 || year % 4 == 0 ){
				
				count++;
				if(count == 10){
					System.out.println(year);
					count = 0;
				}
				else{
				System.out.print(year+"  ");
				
				}
				
				
			}
		}
	}

}
