package chapter16;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlCircle2 extends JFrame {
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	
	public ControlCircle2(){
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
		
		jbtEnlarge.addActionListener(new EnlargeListenner());
		jbtShrink.addActionListener(new ShrinkListenner());
	}
	//** Main method*/
	public static void main(String[] args){
		JFrame frame = new ControlCircle2();
		frame.setTitle("ControlCircle2");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
class EnlargeListenner implements ActionListener { //ÄÚ²¿Àà
	public void actionPerformed(ActionEvent e){
		canvas.enlarge();
		}
	}
class ShrinkListenner implements ActionListener {
	public void actionPerformed(ActionEvent e){
		canvas.shrink();
	}
}
class CirclePanel extends JPanel {
	private int radius = 5;
	
	/** Enlarge the circle */
	public void enlarge(){
		radius++;
		repaint();
		}
	public void shrink(){
		radius--;
		repaint();
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(getWidth()/2, getHeight()/2, 2*radius, 2*radius);
	}
	}
}
