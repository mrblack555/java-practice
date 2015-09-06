package chapter8;

public class LinearEquation {
	private double a,b,c,d,e,f;
	
	public LinearEquation(double Na,double Nb,double Nc,double Nd,double Ne,double Nf){
		a = Na;
		b = Nb;
		c = Nc;
		d = Nd;
		e = Ne;
		f = Nf;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	public boolean isSolvable(double a,double b,double c,double d){
		boolean v;
		if(a*d - b*c != 0)
			v = true;
		else
			v = false;
		return v;
		
	}
	public double getX(){
		double x = (e*d - b*f)/(a*d - b*c);
		return x;
	}
	public double getY(){
		double y = (a*f - e*c)/(a*d - b*c);
		return y;
	}
	

}
