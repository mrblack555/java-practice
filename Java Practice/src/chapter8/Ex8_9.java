package chapter8;

public class Ex8_9 {

	public static void main(String[] args) {
		//create r1
		RegularPolygon r1 = new RegularPolygon();
		//create r2
		RegularPolygon r2 = new RegularPolygon(6,4);
		//create r3
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("r1's perimeter is " + r1.getPerimeter());
		System.out.println("r2's perimeter is " + r2.getPerimeter());
		System.out.println("r3's perimeter is " + r3.getPerimeter());
		System.out.println("r1's area is " + r1.getArea());
		System.out.println("r2's area is " + r2.getArea());
		System.out.println("r3's area is " + r3.getArea());
		
	}

}
