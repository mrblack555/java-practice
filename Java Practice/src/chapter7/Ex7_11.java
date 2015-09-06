package chapter7;

import java.util.Scanner;

public class Ex7_11 {

	public static void main(String[] args) {
		System.out.println("Enter a number between 0 and 511: ");
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();		
		int[][] a = new int[3][3];
		int m = 0, n = 0,count = 1;
		//transform integer into ¶þ½øÖÆ
		while(l / 2 != 0){
			
			a[m][n] = l%2;
			l = l/2;
			n++;
			count++;
			if(count > 3){//when count equals to 3 which means the array should change to the next column
				m++;
				n = 0;
			}
		}
		if(n <= 2)
			a[m][n] = l;
		else{
			n = 0;
			m++;
			a[m][n] = l;
		}
		
		
		//display array a
		for(int i = 0; i < a.length;i++){
			for(int j = 0; j < a.length;j++){
				if(a[i][j] == 1)
					System.out.print("T" + " ");
				else
					System.out.print("H" + " ");
			}
			System.out.println();
			
		}
		
	}

}
