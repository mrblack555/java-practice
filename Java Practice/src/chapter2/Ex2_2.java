package chapter2;
import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args){
		System.out.println("Enter the radius and length of a cylinder: ");
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		double radius = input.nextDouble();
		double length = input2.nextDouble();
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
		
	}

}
