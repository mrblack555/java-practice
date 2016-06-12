package chapter16;

import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chapter16.RisingFlag.ImagePanel.TimerListener;

public class MovingCar extends JFrame {
	public MovingCar(){
		add(new Panel());
	}
	public static void main(String[] args){
		MovingCar frame = new MovingCar();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Panel extends JPanel{
	int x = 0;
	int y = 440;
	
	public Panel() {
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		//draw the rectangle for the car
		g.fillRect(x, y, 50, 10);
		//draw the wheels for the car
		g.fillOval(x+10, y+10, 10, 10);
		g.fillOval(x+30, y+10, 10, 10);
		//define the Polygon
		int xCenter = x+25;
		int yCenter = y;
		int radius = 15;
		Polygon polygon = new Polygon();
		polygon.addPoint(xCenter+radius, yCenter);
		polygon.addPoint(xCenter+5, yCenter-10);
		polygon.addPoint(xCenter-5, yCenter-10);
		polygon.addPoint(xCenter-15, yCenter);
		//draw the Polygon
		g.fillPolygon(polygon);
	}
	class TimerListener implements ActionListener{
		//handle the action event
		boolean right = true;
		public void actionPerformed(ActionEvent e){
			//if it is right move right
			if(right == true){
				x = x + 80;
			}
			else
				x = x - 80;
			if(x + 5 >= 450)//if it moves to the right bounder
				right = false;
			else if(x - 5 < 0)
				right = true;			
			repaint();
		}
	}
}


