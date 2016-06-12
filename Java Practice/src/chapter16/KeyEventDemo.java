package chapter16;

import javax.management.openmbean.KeyAlreadyExistsException;
import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventDemo extends JFrame {
	private KeyboardPanel keyboardPanel = new KeyboardPanel();
	public KeyEventDemo(){
		//add panel to accept user input
		add(keyboardPanel);
		
		//set focus
		keyboardPanel.setFocusable(true);
	}
	public static void main(String[] args){
		KeyEventDemo frame = new KeyEventDemo();
		frame.setTitle("KeyEventDemo");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	//Inner class: keyboard panel to receive user input
	static class KeyboardPanel extends JPanel{
		private int x = 100;
		private int y =100;
		private char keyChar = 'A';//DEFAULT KEY
		
		public KeyboardPanel(){
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e){
					switch (e.getKeyCode()){
					case KeyEvent.VK_DOWN: y += 10;
					break;
					case KeyEvent.VK_UP: y -= 10;
					break;
					case KeyEvent.VK_LEFT: x -= 10;
					break;
					case KeyEvent.VK_RIGHT: x += 10;
					break;
					default: keyChar = e.getKeyChar();
					}
					repaint();
				}
			});
			
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setFont(new Font("TimesRoman", Font.PLAIN,24));
			g.drawString(String.valueOf(keyChar), x, y);
		}
	}
	
}
