package chapter2;
import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree of celsius: ");
		double celsius = input.nextDouble();
		
		
		//convert fahrenheit to celsius
		double fahrenheit = (9.0/5) * celsius + 32;
		System.out.println("Celisius "+ celsius + " is " + fahrenheit + " in farhrenheit");
	}

}
