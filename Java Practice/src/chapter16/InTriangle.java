package chapter16;

import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InTriangle extends JFrame {
	public InTriangle(){
		add(new NewPanel2());	
	}
	public static void main(String[] args){
		InTriangle frame = new InTriangle();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("In the Triangle?");
	}
	class NewPanel2 extends JPanel{
		private int x = 0;//record the x coordinate of mouse
		private int y = 0;//record the y coordinate of mouse
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Polygon polygon = new Polygon();
			polygon.addPoint(20, 20);
			polygon.addPoint(100, 100);
			polygon.addPoint(140, 40);
			g.drawPolygon(polygon);
			if(polygon.contains(x, y) == false)
				g.drawString("Mouse is out of the triangle", x, y);				
		}
		
		public NewPanel2(){
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseMoved(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
	}
}
