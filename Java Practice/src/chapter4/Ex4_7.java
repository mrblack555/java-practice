package chapter4;


public class Ex4_7 {

	public static void main(String[] args){
		double tuition = 10000;
		double rate = 0.05;
		for (int i = 1;i<11;i++){
			tuition = (1 + rate) * tuition;
			if(i == 4){
				System.out.println("The fourth year's tuition is "+tuition);
			}
			else if( i == 10){
				System.out.println("The tenth year's tuition is "+tuition);
			}
		}
	}

}
