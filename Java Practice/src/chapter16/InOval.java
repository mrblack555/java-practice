package chapter16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InOval extends JFrame {
	public InOval(){
		add(new Newpanel());
	}
	public static void main(String[] args){
		InOval frame = new InOval();
		frame.setSize(300,300);
		frame.setTitle("In the Oval?");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class Newpanel extends JPanel{
	private int x = 0;//the x coordinate
	private int y = 0;//the y coordinate
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.green);
		g.drawOval(100, 60, 100, 100);
		if(x > 200 || x < 100 || y > 160 || y < 60){
			g.drawString("Mouse is out of the circle", x, y);
		}
	}
	public Newpanel(){
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
