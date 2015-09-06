package chapter7;

import java.util.Scanner;

public class Ex7_6 {

	public static void main(String[] args) {
		System.out.println("Enter matrix1: ");
		Scanner input = new Scanner(System.in);
		//create array a and input values
		double[][] a = new double[3][3];
		for(int row = 0;row < a.length;row++){
			for(int column = 0;column < a.length;column++){
				a[row][column] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2: ");
		//create array b and input values
		double[][] b = new double[3][3];
		for(int row = 0;row < b.length;row++){
			for(int column = 0;column < b.length;column++){
				b[row][column] = input.nextDouble();
			}
		}
		multiplyMatrix(a,b);
		display(a,b,multiplyMatrix(a,b));
		
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		//create array c to put the multiply value of matrix a and matrix b
		double[][] c = new double[3][3];
		for(int row = 0;row < c.length;row++){
			for(int column = 0;column < c[row].length;column++){
				c[row][column] = a[row][0] * b[0][column] + a[row][1] * b[1][column] + a[row][2] * b[2][column];
			}
		}
		return c;
		
	}
	public static void display(double[][] a,double[][] b,double[][] c){
		//display the element in a three value every line
		for(int row = 0;row < a.length;row++){
			for(int column = 0;column < a.length;column++){
				System.out.print(a[row][column]+" ");
			}
			System.out.println();
		}
		//display the sign of multiply "*"
		System.out.println("*");
		//display the element in b three value every line
				for(int row = 0;row < b.length;row++){
					for(int column = 0;column < b.length;column++){
						System.out.print(b[row][column]+" ");
					}
					System.out.println();
				}
		//display "="
		System.out.println("=");
		//display the element in b three value every line
				for(int row = 0;row < c.length;row++){
					for(int column = 0;column < c.length;column++){
						System.out.print(c[row][column]+" ");
					}
					System.out.println();
				}
	}

}
