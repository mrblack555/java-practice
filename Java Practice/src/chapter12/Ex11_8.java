package chapter12;

public class Ex11_8 {

	public static void main(String[] args) {
		 Account acc = new Account("George",1122,1000);
		 acc.setAnnualInterestRate(0.015);
		 acc.deposit(30);
		 acc.deposit(40);
		 acc.deposit(50);
		 acc.withDraw(5);
		 acc.withDraw(4);
		 acc.withDraw(2);
		 System.out.println(acc.getDateCreated());
		 System.out.println(acc.name);
		 System.out.println(acc.getAnnualInterestRate());
		 System.out.println(acc.getBalance());
		 System.out.println(acc.transactions);
		 
		 
	}

}
