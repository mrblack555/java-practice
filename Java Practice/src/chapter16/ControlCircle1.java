package chapter16;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlCircle1 extends JFrame {
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	public ControlCircle1(){
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER);//add canvas to center
		this.add(panel, BorderLayout.SOUTH); //add buttons to the frame
		
		
	}
	/** Main method */
	public static void main(String[] args){
		JFrame frame = new ControlCircle1();
		frame.setTitle("ControlCircle1");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
class CirclePanel extends JPanel {
	private int radius = 5; //Default circle radius
	/** Reapint the circle */
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(getWidth() / 2, getHeight() / 2, 2 * radius, 2 * radius);
		
	}
	 
}