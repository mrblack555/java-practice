package chapter16;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex16_10 extends JFrame {
	public Ex16_10(){
		DisplayKeyboard dkb = new DisplayKeyboard();
		add(dkb);
		dkb.setFocusable(true);
		
	}
	public static void main(String[] args){
		Ex16_10 frame = new Ex16_10();
		frame.setTitle("DisplayKeyboard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(200, 200);
		
	}
	//inner class for displaying the string in keyboard
	static class DisplayKeyboard extends JPanel{
		private int x = 100;
		private int y = 100;
		private String message = "";
		private char KeyChar = 'A';
		
		public DisplayKeyboard(){
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e){
					if(e.getKeyCode() != KeyEvent.VK_ENTER){
						KeyChar = e.getKeyChar();
						message = message + String.valueOf(KeyChar);
					}
					else{
						repaint();
					}
				}
			});
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message, x, y);
		}
	}

}
