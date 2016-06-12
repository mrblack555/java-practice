package chapter16;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex16_6 extends JFrame{
	public Ex16_6(){
		MessagePanel messagePanel = new MessagePanel();
		setLayout(new BorderLayout());
		add(messagePanel);
		
	}
	public static void main(String[] args){
		Ex16_6 frame = new Ex16_6();
		frame.setTitle("Ex16_6");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
	//Inner class to display the message panel
	static class MessagePanel extends JPanel{
		private String message = "Java is fun";
		private int x = 20;
		private int y = 20;
		private boolean pressed = true;//boolean if the button pressed
		
		//construct a panel to draw string
		public MessagePanel(){
			addMouseListener(new MouseAdapter() {
				//handle when the mouse is pressed
				public void mousePressed(MouseEvent e){
					if(pressed == true){
						message = "Java is fun";
						repaint();
						pressed = false;
					}
					else{
						message = "Java is powerful";
						repaint();
						pressed = true;
					}
					}
			});
		}
		//paint the component
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message, x, y);
		}
		
	}
}
