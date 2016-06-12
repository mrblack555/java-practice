package chapter16;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InRectangle extends JFrame {
	public InRectangle(){
		add(new Newpanel2());
	}
	public static void main(String[] args){
		InRectangle frame = new InRectangle();
		frame.setSize(300,300);
		frame.setTitle("In the Oval?");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class Newpanel2 extends JPanel{
	private int x = 0;//the x coordinate
	private int y = 0;//the y coordinate
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawRect(100, 60, 100, 40);
		
		if(x > 200 || x < 100  || y > 100 || y < 60){
			g.drawString("Mouse is out of the rectangle.", x, y);
		}		
	}
	
	public Newpanel2(){
	addMouseMotionListener(new MouseMotionAdapter(){
		
		public void mouseMoved(MouseEvent e){
			//get the new location and repaint
			x = e.getX();
			y = e.getY();
			repaint();
		}
		});
	}
}