package chapter7;

import java.util.Scanner;

public class Ex7_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly,\n" + "2-married separately, 3-head of household)\n" +
		"Enter the filing status: ");
		int status = input.nextInt();
		//prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		//compute tax
		double tax = 0;
		//tax rate
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		//status to compute tax rate
		int[][] brackets = {
				{8350, 33950, 82250, 171550, 327950},  //Single filer
				{16700, 67900, 137050, 208851, 327950}, //Married jointly
				{8350, 33950, 68525, 104425, 186475}, //Married separately
				{11950, 45500, 117450, 190200, 372950} //Head of household
		};
		
		if(status == 0){
			//compute tax for single filers
			if(income <= 8350)
				tax = income * rates[0];
			else if(income <= 33950)
				tax = brackets[0][0] * rates[0] + (income - brackets[0][0]) * rates[1];
			else if(income <= 82250)
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] + (income - brackets[0][1])* rates[2];
			else if(income <= 171550)
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
				(brackets[0][2] - brackets[0][1])* rates[2] + (income - brackets[0][2])* rates[3] ;
			else if(income <= 372950)
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
						(brackets[0][2] - brackets[0][1])* rates[2] + (brackets[0][3] - brackets[0][2])* rates[3] +
						(income - brackets[0][3])* rates[4];
			else
				tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
						(brackets[0][2] - brackets[0][1])* rates[2] + (brackets[0][3] - brackets[0][2])* rates[3] +
						(brackets[0][4] - brackets[0][3])* rates[4] + (income - brackets[0][4])* rates[5];
		}
		else if(status == 1){
			if(income <= 16700)
				tax = income * rates[0];
			else if(income <= 67900)
				tax = brackets[1][0] * rates[0] + (income - brackets[1][0]) * rates[1];
			else if(income <= 137050)
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] + (income - brackets[1][1])* rates[2];
			else if(income <= 208851)
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] +
				(brackets[1][2] - brackets[1][1])* rates[2] + (income - brackets[1][2])* rates[3] ;
			else if(income <= 372950)
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] +
						(brackets[1][2] - brackets[1][1])* rates[2] + (brackets[1][3] - brackets[1][2])* rates[3] +
						(income - brackets[1][3])* rates[4];
			else
				tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1] +
						(brackets[1][2] - brackets[1][1])* rates[2] + (brackets[1][3] - brackets[1][2])* rates[3] +
						(brackets[1][4] - brackets[1][3])* rates[4] + (income - brackets[1][4])* rates[5];
		}
		else if(status == 2){
			if(income <= 8350)
				tax = income * rates[0];
			else if(income <= 33950)
				tax = brackets[status][0] * rates[0] + (income - brackets[status][0]) * rates[1];
			else if(income <= 68525)
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] + (income - brackets[status][1])* rates[2];
			else if(income <= 104425)
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
				(brackets[status][2] - brackets[status][1])* rates[2] + (income - brackets[status][2])* rates[3] ;
			else if(income <= 186475)
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
						(brackets[status][2] - brackets[status][1])* rates[2] + (brackets[status][3] - brackets[status][2])* rates[3] +
						(income - brackets[status][3])* rates[4];
			else
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
						(brackets[status][2] - brackets[status][1])* rates[2] + (brackets[status][3] - brackets[status][2])* rates[3] +
						(brackets[status][4] - brackets[status][3])* rates[4] + (income - brackets[status][4])* rates[5];
		}
		else if(status == 3){
			if(income <= 11950)
				tax = income * rates[0];
			else if(income <= 45500)
				tax = brackets[status][0] * rates[0] + (income - brackets[status][0]) * rates[1];
			else if(income <= 117450)
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] + (income - brackets[status][1])* rates[2];
			else if(income <= 190200)
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
				(brackets[status][2] - brackets[status][1])* rates[2] + (income - brackets[status][2])* rates[3] ;
			else if(income <= 372950)
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
						(brackets[status][2] - brackets[status][1])* rates[2] + (brackets[status][3] - brackets[status][2])* rates[3] +
						(income - brackets[status][3])* rates[4];
			else
				tax = brackets[status][0] * rates[0] + (brackets[status][1] - brackets[status][0]) * rates[1] +
						(brackets[status][2] - brackets[status][1])* rates[2] + (brackets[status][3] - brackets[status][2])* rates[3] +
						(brackets[status][4] - brackets[status][3])* rates[4] + (income - brackets[status][4])* rates[5];
		}
		//display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		}

}
