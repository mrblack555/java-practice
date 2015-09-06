package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Ex4_34 {

	public static void main(String[] args) {
		int count = 0;
		do{
		int number = new Random().nextInt(3);
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();
		String srp = "";
		String srp2 = "" ;
		if(user == 0){
			srp = "scissor";
		}
		else if(user == 1){
			srp = "rock";
		}
		else if(user == 2){
			srp = "paper";
		}
		if(number == 0){
			srp2 = "scissor";
		}
		else if(number == 1){
			srp2 = "rock";
		}
		else if(number == 2){
			srp2 = "rock";
		}
		if(srp == srp2){
			System.out.println("The computer is "+srp2+". You are "+srp+". It is a draw");
		}
		else if((user == 0 && number == 2) || (user == 1 && number == 0) || (user == 2 && number == 1)){
			System.out.println("The computer is "+srp2+". You are "+srp+". 	You won");
			count++;
		}
		else{
			System.out.println("The computer is "+srp2+". You are "+srp+". 	You lose");
		}
		}while(count < 2);
		
	}

}
