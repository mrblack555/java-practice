package chapter16;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class RisingFlag extends JFrame {
	public RisingFlag(){
		add(new ImagePanel());
	}
	public static void main(String[] args){
		JFrame frame = new RisingFlag();
		frame.setTitle("RisingFlag");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	class ImagePanel extends JPanel{
		private ImageIcon imageIcon = new ImageIcon("src/image/flagIcon6.gif");
		private Image image = imageIcon.getImage();
		private int height = 430;
		public ImagePanel(){
			Timer timer = new Timer(1000, new TimerListener());
			timer.start();
		}
		
		//draw the flag
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			if(image != null){
				g.drawImage(image, 0, height, 20, 20, this);
			}
			
			
		}
		class TimerListener implements ActionListener{
			//handle the action event
			public void actionPerformed(ActionEvent e){
				height -= 10; 
				repaint();
			}
		}
		
	}

}
