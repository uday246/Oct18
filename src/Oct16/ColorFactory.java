package Oct16;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ColorFactory extends JFrame{

   private final int WINDOW_WIDTH = 500;   //window width

   private final int WINDOW_HEIGHT= 300;   //window height

   private JButton redButton;               //change background color to red

   private JButton orangeButton;           // change background color to orange

   private JButton yellowButton;           //change background color to yellow

   private JRadioButton greenButton;       //change text color to green

   private JRadioButton blueButton;       //change text color to blue

   private JRadioButton cyanButton;       //change text color to cyan

   private ButtonGroup radioButtonGroup;   //to group radio buttons

   private JPanel topPanel;               // top panel that holds 3 buttons

   private JPanel bottomPanel;               // bottom panel that holds radio buttons

   private JLabel messageLabel;           //A message to user

      

   //constructor

   public ColorFactory () {

       //set title

       setTitle("Color Factory");

       //set size

       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

       //specify an action for the close button

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //set Layout
       topPanel = new JPanel();
       setLayout(new BorderLayout());

       //build the top panel and add it to the frame

       buildTopPanel();

       add(topPanel, BorderLayout.NORTH);

       //build the bottom panel and ad it to the frame
       bottomPanel = new JPanel();
       
       buildBottomPanel();

       add(bottomPanel, BorderLayout.SOUTH);

       //create a label that contains the message

       setMessageLabel(new JLabel ("Top buttons change the panel color and bottom raido buttons change the text color"));

       add(getMessageLabel(), BorderLayout.CENTER);

       //display the window

       setVisible(true);

   }

   private void buildTopPanel() {

       //set Flow Layout

       setLayout (new FlowLayout());

       //set background

       setBackground(Color.WHITE);

       //create the label for buttons and set button's background

       redButton = new JButton ("Red");

       redButton.setBackground(Color.RED);

       orangeButton = new JButton ("Orange");

       orangeButton.setBackground(Color.ORANGE);

       yellowButton = new JButton ("Yellow");

       yellowButton.setBackground(Color.YELLOW);

       //set action command

       redButton.setActionCommand("R");

       orangeButton.setActionCommand("O");

       yellowButton.setActionCommand("Y");

       // add listener

       redButton.addActionListener(new RedButtonListener());

       orangeButton.addActionListener (new OrangeButtonListener());

       yellowButton.addActionListener (new YellowButtonListener());

       topPanel.add(redButton);

       topPanel.add(orangeButton);

       topPanel.add(yellowButton);

          

   }

  

   private void buildBottomPanel() {

       //set Flow Layout

       setLayout (new FlowLayout());

       //set background

       setBackground(Color.WHITE);

       //create label for radio buttons and set buttons' foreground

       setGreenButton(new JRadioButton ("Green"));

       getGreenButton().setForeground(Color.GREEN);

       setBlueButton(new JRadioButton ("Blue"));

       getBlueButton().setForeground(Color.BLUE);

       setCyanButton(new JRadioButton ("Cyan"));

       getCyanButton().setForeground(Color.CYAN);

       // grouping radio button

       radioButtonGroup = new ButtonGroup();

       radioButtonGroup.add(getGreenButton());

       radioButtonGroup.add(getBlueButton());

       radioButtonGroup.add(getCyanButton());      

       //add action listeners to the radio buttons

       getGreenButton().addActionListener(new RadioButtonListener());

       getBlueButton().addActionListener(new RadioButtonListener());

       getCyanButton().addActionListener(new RadioButtonListener());

   }

   /**

   * private inner classes that handle the event when the user click Red, Orange, Yellow buttons

   */

   private class RedButtonListener implements ActionListener{

       public RedButtonListener() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed (ActionEvent e) {

           getMessageLabel().setBackground(Color.RED);
           getMessageLabel().setOpaque(true);
       }

}

   private class OrangeButtonListener implements ActionListener{

       public OrangeButtonListener() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed (ActionEvent e) {

           getMessageLabel().setBackground(Color.ORANGE);
           getMessageLabel().setOpaque(true);

       }

   }

   private class YellowButtonListener implements ActionListener{

       public YellowButtonListener() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed (ActionEvent e) {

           getMessageLabel().setBackground(Color.YELLOW);
           getMessageLabel().setOpaque(true);

       }

   }

   /**

   * private inner class that handle the event when the user choose one of the radio buttons

   */

   private class RadioButtonListener implements ActionListener {

       public RadioButtonListener() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed (ActionEvent e) {

           if (e.getSource() == getGreenButton()) {

               getMessageLabel().setForeground(Color.GREEN);

           }

           else if (e.getSource() == getBlueButton()) {

               getMessageLabel().setForeground(Color.BLUE);

           }

           else if (e.getSource() == getCyanButton()) {

               getMessageLabel().setForeground(Color.CYAN);

           }

       }

   }

   /**

   * the main method creates an instance of the ColorFactory class, displaying its window

   * @param args

   */

   public static void main (String[]args) {

       new ColorFactory();

   }

public JLabel getMessageLabel() {
	return messageLabel;
}

public void setMessageLabel(JLabel aMessageLabel) {
	messageLabel = aMessageLabel;
}

public JRadioButton getGreenButton() {
	return greenButton;
}

public void setGreenButton(JRadioButton aGreenButton) {
	greenButton = aGreenButton;
}

public JRadioButton getBlueButton() {
	return blueButton;
}

public void setBlueButton(JRadioButton aBlueButton) {
	blueButton = aBlueButton;
}

public JRadioButton getCyanButton() {
	return cyanButton;
}

public void setCyanButton(JRadioButton aCyanButton) {
	cyanButton = aCyanButton;
}

}
