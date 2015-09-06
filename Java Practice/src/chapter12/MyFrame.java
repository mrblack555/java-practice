package chapter12;

import javax.swing.*;

public class MyFrame {

	public static void main(String[] args){
		JFrame frame = new JFrame("My Frame with Components");
		//Add a button
		JButton jbtOK = new JButton("OK");
		frame.add(jbtOK);
		frame.setSize(500,500);
		//frame.setLocation(20, 20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);//center a frame´°¿Ú¾ÓÖÐ
		frame.setVisible(true);
	}

}
