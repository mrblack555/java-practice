package chapter16;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationDemo extends JFrame {
	public AnimationDemo(){
		//create a movingmessagepanel for displaying a moving message
		add(new MovingMessagePanel("message moving?"));
		
	}
	public static void main(String[] args){
		AnimationDemo frame = new AnimationDemo();
		frame.setTitle("AnimationDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(280, 100);
		frame.setVisible(true);
	}
	//inner class for moving meesage panel
	private class MovingMessagePanel extends JPanel{
		private String  message = "Welcome to Java";
		private int xCoordinate = 0;
		private int yCoordinate = 20;
		public MovingMessagePanel(String message){
			this.message = message;
			//create a timer
			Timer timer = new Timer(1000, new TimerListener());
			timer.start();
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			if(xCoordinate > getWidth()){
				xCoordinate = -20;
			}
			xCoordinate += 5;
			g.drawString(message, xCoordinate, yCoordinate);
			
		}
		class TimerListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				repaint();
			}
		}
	}
}
