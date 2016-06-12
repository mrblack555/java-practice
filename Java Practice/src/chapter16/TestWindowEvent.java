package chapter16;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class TestWindowEvent extends JFrame {
	public static void main(String[] args){
		TestWindowEvent frame = new TestWindowEvent();
		frame.setSize(220, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("TestWindowEvent");
		
	}
	public TestWindowEvent(){
		addWindowListener(new WindowListener() {
			
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Opened");

			}
			
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Iconfied");
			}
			
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Deiconfied");

			}
			
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Deactivated");

			}
			
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Closing");

			}
			
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Closed");

			}
			
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Window Activated");

			}
		});
	}
}
