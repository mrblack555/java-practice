package chapter4;

import java.util.Random;

public class Ex4_44 {

	public static void main(String[] args) {
		int count = 0;//count the  occurrence of odd number area 
		//1000000loops  as mentioned in the problem
		for(int i = 0;i < 1000000;i++){
			
			Random generator = new Random();
			//generate value of x and y from -100 to 100
			double x = generator.nextDouble() + generator.nextInt(201) - 100;
			double y = generator.nextDouble() + generator.nextInt(201) - 100;
			if(x < 0){
				count++;
			}
			else if(x > 0 && y > 0 ){
				if(x + y <= 100){
					count++;
				}
			}
		}
		double probability = count / 1000000.0;
		System.out.println(count);
		System.out.println(probability);
	}

}
