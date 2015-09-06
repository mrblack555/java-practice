package chapter8;

public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	public RegularPolygon() {
		
	}
	public RegularPolygon(int newn, double newside){
		n = newn;
		side = newside;
	}
	public RegularPolygon(int newn, double newside,double newx,double newy){
		n = newn;
		side = newside;
		x = newx;
		y = newy;
	}
	public int getN(){
		return n;
		
	}
	public double getSide(){
		return side;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setN(int newn){
		n =  newn; 
	}
	public void setSide(double newside){
		side = newside;
	}
	public void setX(double newx){
		x = newx;
	}
	public void setY(double newy){
		y = newy;
	}
	public double getPerimeter(){
		return n*side;
	}
	public double getArea(){
		return (n * side * side)/(4 * Math.tan(getPerimeter()/n));
	}
	

}
