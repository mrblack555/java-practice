package chapter6;

import java.util.Random;

public class Ex6_24 {

	public static void main(String[] args) {
		//create an array of color
		int[] color = new int[4];
		//create an array of number
		int[] number = new int[4]; 
		int picks = 0;
		picks = pick(color,picks,number);
		display(color,number);
		System.out.println("Number of Picks: "+picks);
		
		
	}
	
	public static void display(int[] color,int[] number){
		for(int i = 0;i < color.length;i++){
			if(number[i] != 1 && number[i] <= 10){
				if(color[i] == 1)
					System.out.println(number[i] + " Spades");
				else if(color[i] == 2){
					System.out.println(number[i] + " Clubs");
				}
				else if(color[i] == 3){
					System.out.println(number[i] + " Hearts");
				}
				else if(color[i] == 4){
					System.out.println(number[i] + " Diamonds");
				}				
			}
			else if(number[i] == 1){
				if(color[i] == 1)
					System.out.println("Ace" + " Spades");
				else if(color[i] == 2){
					System.out.println("Ace" + " Clubs");
				}
				else if(color[i] == 3){
					System.out.println("Ace" + " Hearts");
				}
				else if(color[i] == 4){
					System.out.println("Ace" + " Diamonds");
				}
			}
			else if(number[i] == 11){
				if(color[i] == 1)
					System.out.println("Jack" + " Spades");
				else if(color[i] == 2){
					System.out.println("Jack" + " Clubs");
				}
				else if(color[i] == 3){
					System.out.println("Jack" + " Hearts");
				}
				else if(color[i] == 4){
					System.out.println("Jack" + " Diamonds");
				}
			}
			else if(number[i] == 12){
				if(color[i] == 1)
					System.out.println("Queen" + " Spades");
				else if(color[i] == 2){
					System.out.println("Queen" + " Clubs");
				}
				else if(color[i] == 3){
					System.out.println("Queen" + " Hearts");
				}
				else if(color[i] == 4){
					System.out.println("Queen" + " Diamonds");
				}
			}
			else if(number[i] == 13){
				if(color[i] == 1)
					System.out.println("King" + " Spades");
				else if(color[i] == 2){
					System.out.println("King" + " Clubs");
				}
				else if(color[i] == 3){
					System.out.println("King" + " Hearts");
				}
				else if(color[i] == 4){
					System.out.println("King" + " Diamonds");
				}
			}
			
		}
	}
	
	public static boolean duplicate(int j, int[] color){
		boolean a = false;
		for( int i = 0;i < color.length;i++){
			if(color[i] == j)
				a = true;
		}
		return a;
	}
	public static int pick(int[] color,int picks,int[] number){
		
		int j = new Random().nextInt(4) + 1;
		for(int i = 0;i < color.length;i++){
			while(duplicate(j,color) == true){
				j = new Random().nextInt(4) + 1;
				picks++;
			}
			if(i == 0)
				picks++;
			color[i] = j;
			number[i] = new Random().nextInt(13) + 1;
		}
		return picks;
	}

}
