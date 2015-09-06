package chapter10;

public class Ex10_8 {
	
	public static void main(String[] args){
		Tax tax = new Tax();
		Tax tax0 = new Tax(0,tax.getBrackets(),tax.getRates(),55000);
		System.out.println("Single filler tax: "+tax0.getTax());
		Tax tax1 = new Tax(1,tax.getBrackets(),tax.getRates(),55000);
		System.out.println("Single filler tax: "+tax1.getTax());
		Tax tax2 = new Tax(2,tax.getBrackets(),tax.getRates(),55000);
		System.out.println("Single filler tax: "+tax2.getTax());
		Tax tax3 = new Tax(3,tax.getBrackets(),tax.getRates(),55000);
		System.out.println("Single filler tax: "+tax3.getTax());



	}
		
	

}
