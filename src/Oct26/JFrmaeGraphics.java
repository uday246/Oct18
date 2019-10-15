package Oct26;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class JFrmaeGraphics extends JPanel{
	public void paint(Graphics g){
		
		g.drawOval(60, 60, 200, 200);
		g.fillOval(90, 120, 50, 20);
		g.fillOval(190, 120, 50, 20);
		g.drawLine(165, 125, 165, 175);
		g.drawArc(110, 130, 95, 95, 0, -180);		
	}
	
	public static void main(String[] args){
		JFrame frame= new JFrame("Smile");	
		frame.getContentPane().add(new JFrmaeGraphics());
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);		
	}
}
