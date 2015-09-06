package chapter5;

public class Ex5_26 {

	public static void main(String[] args) {
		int i = 2;
		int count = 0;
		boolean a = true;
		while(a){
			
			if(isPalindrome(reverse(i)) == true && primenumber(i) ){
				System.out.print(i+"   ");
				count++;
				if(count % 10 == 0){
					System.out.println();
				}
				
			}
			if(count == 100){
				break;
			}
			i++;
		}
		
	}
	//reverse the number
	public static int reverse(int number){
		int count = 1;
		int reversed = 0;
		int temp = number;
		int c = 1;
		int temp2 = 0;
		 while(temp >= 10){
			 count++;
			 temp = temp/10;
		 }
		 temp = number;
		 int temp3 = count;
		 //把位数求出来4位就是1000
		 while(temp3 > 1){
			 c *= 10;
			 temp3--;
		 }
		 
		 //design a loop to split the numbers  of the input number. 1 in 1000 is 1
		 while(count >= 1){
			 
			 int b = 10;
			 
			 temp2 = temp2 + (temp % b )* c;
			 temp = temp/10;
			 c = c / 10;
			 number = temp2;
			 count--;
		 }
		 
		 
		 
		 
		 return number;
	}
	//return true if number is Palindrome
		public static boolean isPalindrome(int number){
			boolean i = true;
			//if the original number equals to the reversed number it is Palindrome
			if(number == reverse(number)){
				i = true;
			}
			//it is not
			else
				i = false;
			return i;
			
		}
	//verify if the number is prime number
		public static boolean primenumber(int number){
			boolean i = true;
			for(int j = 2;j < number;j++){
				if(number % j == 0){
					i = false;
					break;
				}
			}
			return i;
		}

}
