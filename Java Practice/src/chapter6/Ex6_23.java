package chapter6;

public class Ex6_23 {

	public static void main(String[] args) {
		//create a boolean array of close or open
		boolean[] box = new boolean[100];
		for(int i = 0;i < box.length;i++){
			//in the beginning, all the boxes are closed
			box[i] = false;
		}
		//students open or close the boxes
		student(box);
		//display the state of the boxes
		display(box);
	}
	public static void student(boolean[] box){
		for(int i = 0;i < box.length;i++){
			for(int j = i;j < box.length;j++){
				box[j] = !box[j];				
			}
			if(i == 0){
				System.out.println("The fist box is "+box[i]);
			}
		}
	}
	public static void display(boolean[] box){
		int count = 1;
		for(int i = 0;i < box.length;i++){
			if(count / 10 != 1){
				System.out.print(box[i]);
				count++;
			}
			else {
				System.out.println();
				System.out.print(box[i]);
				count = 1;
				
			}
		}
	}

}
