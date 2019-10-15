package Oct5th;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawingPanel extends JPanel{
	
	
}
public class DrawPanel
 {
 public static void main(String[]args)
 {
	 JFrame jf = new JFrame();
	 
 JPanel panel=new JPanel();
 panel.setBackground(Color.YELLOW);
 jf.add(panel);
 Graphics g = panel.getGraphics();
 g.setColor(Color.BLUE);
 g.fillOval(50,25,40,40);
 g.fillOval(50+80,25,40,40);
 g.setColor(Color.RED);
 g.fillRect(50+20,25+20,80,80);
 g.setColor(Color.BLACK);
 g.drawLine(70,25+20+40,70+80,25+20+40);
 }//End of main method
 }//end of class DrawPanel1E
