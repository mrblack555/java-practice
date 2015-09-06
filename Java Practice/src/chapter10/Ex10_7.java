package chapter10;

import java.util.Scanner;

public class Ex10_7 {

	public static void main(String[] args) {
		int[] ids = {0,1,2,3,4,5,6,7,8,9};
		boolean a = false;
		int id = 0;
		while(true){
			while(a == false){
				System.out.println("Enter an id: ");
				Scanner input = new Scanner(System.in);
				id = input.nextInt();
				for(int i = 0;i < ids.length;i++){
					if(id == ids[i]){
						a = true;
						break;
					}
					else{
						
					}
				}
			}
			Account account = new Account(id,100);
			boolean b = true;
			while(b == true){
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				Scanner input = new Scanner(System.in);
				//do the operation based on the user's choice
				int j = input.nextInt();
				if(j == 1){
					System.out.println("The balance is "+account.getBalance());
				}
				else if(j == 2){
					System.out.println("Enter an amount to withdraw: ");
					double withDraw = input.nextDouble();
					account.withDraw(withDraw);
				}
				else if(j == 3){
					System.out.println("Enter an amount to deposit: ");
					double deposit = input.nextDouble();
					account.deposit(deposit);
				}
				else if(j == 4){
					b = false;
					a = false;
				}
				else{
				
				}
			}
		}
		
	}

}
