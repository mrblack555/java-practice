package chapter7;

public class Ex7_4 {

	public static void main(String[] args) {
		//create an array for employees
		
		//initialize the array
		int [][] employee = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}
		};
		//create an array to store the work hours for everyone
		int[][] time = new int[8][2];
		//execute the time function 
		time(employee,time);
		//display the result
		display(time);
	}

	private static void display(int[][] time) {
		for(int i = 0;i < time.length;i++){			
			System.out.print("Employee "+time[i][1]+" works "+time[i][0]+" hours.");
			System.out.println();
			
		}
		
		
	}

	private static void time(int[][] employee,int[][] time) {
		//calculate the total work time for every employee and put the value into time array
		for(int row = 0;row < employee.length;row++){
			for(int column = 0;column < employee[row].length;column++){
				time[row][0] += employee[row][column];
			}
			time[row][1] = row;
		}
		//compare the value and put the longest value at the first
		for(int i = 0; i < time.length;i++){
			for(int j = i+1;j < time.length;j++){
				if(time[i][0] < time[j][0]){
					int temp = time[i][0];
					time[i][0] = time[j][0];
					time[j][0] = temp;
					int temp2 = time[i][1];
					time[i][1] = time[j][1];
					time[j][1] = temp2;
				}
			}
		}
	}

}
