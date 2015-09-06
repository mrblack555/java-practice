package chapter4;

public class Ex4_33 {

	public static void main(String[] args){
		int sum = 0;
		int i = 1;
		for( i = 1;i < 10000;i++){
			for(int j = 1;j < i;j++){
				
				if(i % j == 0){
					sum = sum + j;
				}
				else{}
			}
			if(sum == i){
				System.out.println(sum);
				sum = 0;
			}
			else{
				sum = 0;
			}
			}
		}
	

}
