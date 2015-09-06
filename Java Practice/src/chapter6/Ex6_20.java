package chapter6;

import java.util.Random;

public class Ex6_20 {

	public static void main(String[] args) {
		//crate eight arrays
		int[] one = new int[8];
		int[] two = new int[8];
		int[] three = new int[8];
		int[] four = new int[8];
		int[] five = new int[8];
		int[] six = new int[8];
		int[] seven = new int[8];
		int[] eight = new int[8];
		//assign the queen into each array
		queen(one,two,three,four,five,six,seven,eight);
	}
	public static void queen(int[] one,int[] two,int[] three,int[] four,int[] five,int[] six,int[] seven,int[] eight){
		int i = 0;
		one[i = new Random().nextInt(8)] = 1;
		//verify the rule is true or not when assigning the queen from the second array
	}
	public static void rule(int[] one,int[] two,int[] three,int[] four,int[] five,int[] six,int[] seven,int[] eight){
		
	}
}
