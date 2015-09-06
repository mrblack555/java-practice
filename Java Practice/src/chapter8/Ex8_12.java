package chapter8;

import java.util.Scanner;

public class Ex8_12 {
		 
	public static void main(String[] args){
		System.out.println("Enter the endpoints of the first line segment: ");
		//初始化各个坐标
		double x1,x2,x3,x4,y1,y2,y3,y4;
		
			Scanner input = new Scanner(System.in);
			x1 = input.nextDouble();
			y1 = input.nextDouble();
			x2 = input.nextDouble();
			y2 = input.nextDouble();
			System.out.println("Enter the endpoints of the second line segment: ");
			x3 = input.nextDouble();
			y3 = input.nextDouble();
			x4 = input.nextDouble();
			y4 = input.nextDouble();
			//求出a,b,c,d,e,f
		LinearEquation le = new LinearEquation(y1-y2,x2-x1,y3-y4,x4-x3,x2*y1-x1*y2,x4*y3-x3*y4);
		//带入方程求出x和y
		double x,y;
		x = le.getX();
		y = le.getY();
		System.out.println("The intersecting point is: "+"("+x+", "+y+")");
		
		
		
	}

}
