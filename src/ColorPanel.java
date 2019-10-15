import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorPanel extends JPanel implements ActionListener {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String RED = "red";
  public static final String BLUE = "blue";
  public static final String GREEN = "green";

  public String currentColor;
  JButton changeColorButton;
  JButton quitButton;

  public ColorPanel() {
    changeColorButton = new JButton("Change Color");
    quitButton = new JButton("Quiz");
    this.add(changeColorButton);
    this.add(quitButton);
    
    changeColorButton.addActionListener(this);
    quitButton.addActionListener(this);

    /*assume that this part is correctly implemented*/

    this.setBackground(Color.red);
    this.currentColor = RED;
    this.setPreferredSize(new Dimension(400, 200));
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == changeColorButton){
      if (currentColor.equals(RED)) {
        setBackground(Color.blue);
        currentColor = BLUE;
      }

      else if (currentColor.equals(BLUE)) {
        setBackground(Color.green);
        currentColor = GREEN;
      }

      else if (currentColor.equals(GREEN)) {
        setBackground(Color.red);
        currentColor = RED;
      }
    }
    // quiting the application
if(e.getSource()==quitButton){
	System.exit(0);
}
// answer code goes here

}

  public static void main(String[] args) {
    JFrame frame = new JFrame("My Color Panel");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ColorPanel newPanel = new ColorPanel();
    frame.setContentPane(newPanel);
    frame.pack();
    frame.setVisible(true);
  }//end main

}//end class