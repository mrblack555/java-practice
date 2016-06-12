package chapter16;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.*;

import javax.swing.*;

import chapter16.RisingFlag.ImagePanel.TimerListener;

import java.awt.event.*;

public class Ex16_13 extends JFrame {
	private JPanel Panel = new JPanel();
	private int i = 1;
	String ImgPath = "src/image/L1.gif";
	public Ex16_13(){
		//create a label
		JLabel Label = new JLabel();
		Panel.add(Label);
		//add panel in the frame
		add(Panel);
		ImageIcon Image = new ImageIcon(ImgPath);//define image icon
		Label.setIcon(Image);
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();		
	}
	public static void main(String[] args){
		Ex16_13 frame = new Ex16_13();
		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**paint the slide**/
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		
	}
	class TimerListener implements ActionListener{
		//handle the action event
		public void actionPerformed(ActionEvent e){
			ImgPath	= "src/image/L5.gif";
			i++;
			System.out.println(i);
			repaint();
		}
	}
		
}
