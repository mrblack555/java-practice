package chapter16;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DetectSourceDemo extends JFrame {
	private JButton jbtNew = new JButton("New");
	private JButton jbtOpen = new JButton("Open");
	private JButton jbtSave = new JButton("Save");
	private JButton jbtPrint = new JButton("Print");
	
	public  DetectSourceDemo(){
		//Create a panel to hold buttons
		JPanel panel =  new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtSave);
		panel.add(jbtPrint);
		add(panel);
		
		//Create a panel
		ButtonListener listener = new ButtonListener();
		
		//Register listener with buttons
		jbtNew.addActionListener(listener);
		jbtOpen.addActionListener(listener);
		jbtSave.addActionListener(listener);
		jbtPrint.addActionListener(listener);
		
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e)	{
			if(e.getSource() == jbtNew){
				System.out.println("Process New");
			}
			if(e.getSource() == jbtOpen){
				System.out.println("Process Open");
			}
			if(e.getSource() == jbtSave){
				System.out.println("Process Save");
			}
			if(e.getSource() == jbtPrint){
				System.out.println("Process Print");
			}
		}
	}
	public static void main(String[] args){
		JFrame frame = new DetectSourceDemo();
		frame.setTitle("DetectSourceDemo");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
}
