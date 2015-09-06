package chapter2;
import javax.swing.JOptionPane;
public class Ex2_11 {

	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("Enter employee's name: ");
		String hours = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
		//covert string into integer
		int a = Integer.parseInt(hours);
		
		String rate = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		//convert string into double
		double b = Double.parseDouble(rate);
		
		String ftax = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
		//convert string into double
		double c = Double.parseDouble(ftax);
		//convert string into double
		String stax = JOptionPane.showInputDialog("Enter state tax withholding rate: ");
		double d = Double.parseDouble(stax);
		
		//Display results
				String output = "Employee Name: "+name
						+"\n"+"Hours Worked: "+a+"\t"+"Pay Rate: "+"$"+b
						+"\n"+"Gross Pay: "+"$"+b*a+"\t"+"Deductions:"
						+"\n"+"  Federal Withholding (20.0%): )"+"$"+a*b*c
						+"\n"+"state tax withholding (9%): "+a*b*d
						+"\n"+"Total Deduction: "+"$"+(a*b*c+a*b*d);
				JOptionPane.showMessageDialog(null, output);
	}

}
