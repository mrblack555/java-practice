package chapter3;
import java.util.Random;
public class Ex3_24 {
	String a;
	String b;
	public static void main(String[] args){
		
		Ex3_24 a = new Ex3_24();
		a.card();
		
		
		
	}
	public void card(){
		//Generate the card number
				Random random = new Random();
				int r1 = random.nextInt(4);
				int r2 = random.nextInt(3);
				//Determine the value of the card
				if( r1 == 0){
					String c = "King";
					a = c;
				}
				else if( r1 == 1){
					String c = "Queen";
					a = c;
				}
				else if( r1 == 2){
					String c = "Ace";
					a = c;
				}
				else if( r1 == 3){
					String c = "Jack";
					a = c;
				}
				else if( r1 == 4){
					int e = random.nextInt(10)%(10-0+1)+2;
					String c = String.valueOf(e);
					a = c;
				}
				//Determine the type of the card
				if( r2 == 0 && r1 != 3  ){
					String d = "Clubs";
					b = d;
				}
				else if( r2 == 1 && r1 != 3){
					String d = "Hearts";
					b = d;
				}
				else if( r2 == 2 && r1 != 3){
					String d = "Spades";
					b = d;
				}
				else if( r2 == 3 && r1 != 3){
					String d = "Diamond";
					b = d;
				}
				//Display the card
				System.out.println("The card you picked is "+a+" of "+b);
		
	}

}
