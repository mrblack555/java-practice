package chapter12;
import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class Ex12_7 extends JFrame {
	private ImageIcon Oicon = new ImageIcon("src/image/o.gif");
	private ImageIcon Xicon = new ImageIcon("src/image/x.gif");
	private ImageIcon Nicon = new ImageIcon();
	
	public Ex12_7() {
		setLayout(new GridLayout(3,3,5,5));
		int count = 0;
		//display the number according to the result of random() 
		
		while(count < 10){
			if(random() == 0){
				add(new JLabel(Xicon));
			}
			else if(random() == 1){
				add(new JLabel(Oicon));
			}
			else if(random() == 2){
				add(new JLabel(Nicon));
			}
			count++;
		}
		
		
	
		
	}
	//get random number
	public int random(){
		return  new Random().nextInt(3);	 
	}
	//main function to create the form 
	public static void main(String[] args){
		Ex12_7 frame = new Ex12_7();
		
		frame.setTitle("TestImageIcon");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
