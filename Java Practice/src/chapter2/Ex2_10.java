package chapter2;
import javax.swing.JOptionPane;

public class Ex2_10 {

	public static void main(String[] args){
		
		//create amount
		String amount = JOptionPane.showInputDialog("Enter an amount in double, for example 11.56: ");
		//convert string into double
		double damount = Double.parseDouble(amount);
		int remainingAmount = (int)(damount * 100);
		//find the number of one dollars
		int numberofonedollars = remainingAmount/100;
		remainingAmount = remainingAmount % 100;
		
		//find the number of quarters in the remaining amount
		int  numberofquarters = remainingAmount /25;
		remainingAmount = remainingAmount % 25;
		
		//find the number of dimes
		int numberofdimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//find the number of nickels in the remaining amount
		int numberofnickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//find the number of pennies in the remaining amount
		int numberofpennies = remainingAmount;
		
		//Display results
		String output = "Your amount "+ amount + " consists of \n" +
		"\t" + numberofonedollars + " dollars\n" +
		"\t" + numberofquarters + " quarters\n" +
		"\t" + numberofdimes + " dimes\n" +
		"\t" + numberofnickels + " nickels\n" +
		"\t" + numberofpennies + " pennies";
		JOptionPane.showMessageDialog(null, output);
		
		
		
	}

}
