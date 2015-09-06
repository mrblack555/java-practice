package chapter2;
import java.util.Scanner;

public class Ex2_5 {
	public static void main(String[] args){
		System.out.println("Enter the subtotal and a gratuity rate: ");
		Scanner input = new Scanner(System.in);
		Scanner input2 =  new Scanner(System.in);
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		double gratuity = subtotal * (rate/100.0);
		double total = subtotal + gratuity;
		System.out.println("The gratuity is "+gratuity+" and total is "+total);
	}
	

}
