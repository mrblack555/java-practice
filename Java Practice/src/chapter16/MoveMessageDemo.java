package chapter16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MoveMessageDemo extends JFrame {
	
	public MoveMessageDemo(){
		MovableMessagePanel p = new MovableMessagePanel("Welcome to Java");
		
		//Place the message panel in the frame
		setLayout(new BorderLayout());
		add(p);
	}
	
	public static void main(String[] args){
		MoveMessageDemo frame = new MoveMessageDemo();
		frame.setTitle("MoveMessageDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
        frame.setSize(200, 100);
        frame.setVisible(true);
       
        
	}
	
	static class MovableMessagePanel extends JPanel {
		private String message = "Welcome to Java";
		private int x = 20;
		private int y = 20;
		public MovableMessagePanel(String s){
			message = s;
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e){
					//get the new location and repaint the screen
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message, x, y);
		}
	}
	
}
