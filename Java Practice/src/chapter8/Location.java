package chapter8;

import java.util.Scanner;

public class Location {
	public int row,column;
	public double maxValue;
	
	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		l.maxValue = a[0][0];
		l.row = 0;
		l.column = 0;
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				if(l.maxValue < a[i][j]){
					l.maxValue = a[i][j];
					l.row = i;
					l.column = j;
				}
			}
		}
		return l;
		
	}
	public static void main(String[] args){
		System.out.println("Enter the number of rows and columns of the array: ");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int c = input.nextInt();
		System.out.println("Enter the array: ");
		double[][] a = new double[r][c];
		for(int i = 0;i < r;i++){
			for(int j = 0;j < c;j++){
				a[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("The location of the largest element is "+locateLargest(a).maxValue+" at "+"("+locateLargest(a).row+", "
		+locateLargest(a).column+")");
	}

}
