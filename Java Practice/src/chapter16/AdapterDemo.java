package chapter16;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class AdapterDemo extends JFrame {
	public static void main(String[] args){
		AdapterDemo frame = new AdapterDemo();
		frame.setSize(220, 80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setTitle("AdapterDemo");
		
	}
	public AdapterDemo(){
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent event){
				System.out.println("Window Activated");
				
			}
		});
		}
}
