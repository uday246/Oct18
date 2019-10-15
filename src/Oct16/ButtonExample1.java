package Oct16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JPanel;

// We use Java awt (window toolkit) and Swing

public class ButtonExample1 extends WindowAdapter implements ActionListener {// main
																				// class

	Frame frame, frame1;

	JPanel buttonPanel, buttonPanel1;

	Button blueButton;

	TextField tf, tf1;

	List list;

	Label loginLabel, loginLabel1;

	String password;

	private Button redButton;

	public ButtonExample1(String title) {

		frame = prepareFrame(title); // get a frame

		tf = new TextField("", 20); // get a Text Field

		loginLabel = new Label("User Name", Label.RIGHT);

		loginLabel.setForeground(Color.BLUE);

		buttonPanel = prepareContainer(); // get a panel

		redButton = prepareButton("Submit", "Input Username"); // get a button

		buttonPanel.add(loginLabel); // add label to panel

		buttonPanel.add(tf); // add text field to panel

		buttonPanel.add(redButton);// add button

		frame.add("Center", buttonPanel); // add the panel to the frame

		frame.setVisible(true); // make the frame visible

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.WindowAdapter#windowClosing(java.awt.event.WindowEvent)
	 * 
	 */

	@Override

	public void windowClosing(WindowEvent e) {

		// TODO Auto-generated method stub

		super.windowClosing(e);

		// frame.setVisible(true);

	}

	public Frame prepareFrame(String title) {

		Rectangle r = new Rectangle(10, 10, 500, 500);

		frame = new Frame(title);

		frame.setSize(950, 500);

		frame.setLayout(new BorderLayout());

		frame.setMaximizedBounds(r);

		frame.setExtendedState(Frame.MAXIMIZED_BOTH);

		frame.addWindowListener(this); // add a handler for events on this frame

		return frame;

	}

	public Button prepareButton(String title, String actionCommand) {

		Button redButton = new Button(title);

		redButton.setBackground(Color.RED);

		redButton.setActionCommand(actionCommand);

		redButton.addActionListener(this);

		return redButton;

	}

	public JPanel prepareContainer() {

		JPanel buttonPanel = new JPanel(new FlowLayout());

		// Dimension d = new Dimension(2000,2000);

		buttonPanel.setBounds(10, 10, 200, 200);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int x = Math.max((screenSize.width / 2 - frame.getSize().width / 2), 0);

		int y = Math.max((screenSize.height / 2 - frame.getSize().height / 2), 0);

		buttonPanel.setLocation(x, y);

		return buttonPanel;

	}

	public void createNew(String firstName, String lastName) { // prepare a new
																// screen for
																// password

		String title = "Welcome " + firstName + " " + lastName;

		frame1 = prepareFrame(title);

		tf1 = new TextField("", 20);

		loginLabel1 = new Label("Please Enter your Password", Label.RIGHT);

		loginLabel1.setForeground(Color.BLUE);

		buttonPanel1 = prepareContainer();

		buttonPanel1.add(loginLabel1);

		buttonPanel1.add(tf1);

		blueButton = prepareButton("Submit", "Input Password");

		buttonPanel1.add(blueButton);

		frame1.add("Center", buttonPanel1);

		frame1.setVisible(true);

	}

	// public

	public String databaseHandling() {

		Properties settings = new Properties();

		FileInputStream fis;

		try {

			fis = new FileInputStream("agent.properties"); // open properties
															// file

			settings.load(fis);

			fis.close();

		}

		catch (Exception e1) {

			e1.printStackTrace();

		}

		String databaseURL = settings.getProperty("DatabaseURL"); // get the
																	// DatabaseURL
																	// property

		return databaseURL;

	}

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		String cmd = e.getActionCommand();

		if (cmd.equals("Input Username")) { // if username has been submitted

			String enter = tf.getText(); // get the user name

			try {

				String databaseURL = databaseHandling(); // get the URL of the
															// database

				Class.forName("com.mysql.jdbc.Driver");

				Connection con =

						DriverManager.getConnection(

								databaseURL, "root", "dijkstra"); // connect to
																	// database

				java.sql.Statement stmt = con.createStatement(); // prepare a
																	// query
																	// statement

				ResultSet rs = stmt.executeQuery("SELECT * from user"); // query
																		// the
																		// database

				while (rs.next()) {

					String user_Name = rs.getString("user_name");

					if (user_Name.equals(enter)) // username matches an entry in
													// the database

					{

						String firstName = rs.getString("firstname"); // get
																		// first
																		// name

						String lastName = rs.getString("lastname"); // get last
																	// name

						password = rs.getString("password"); // get password.
																// will be used
																// later

						frame.setVisible(false); // make this screen invisible
													// to start the password
													// screen

						createNew(firstName, lastName); // start the password
														// screen

						return;

					}

				}

				tf.setText(""); // the username is not found in the database

				frame.setTitle("The User Name entered is incorrect. Please enter your user name");

				frame.setVisible(false);

				frame.setVisible(true);

			}

			catch (Exception e4) {

				e4.printStackTrace();

			}

		}

		else if (cmd.equals("Input Password"))

		{ // password submitted

			if (tf1.getText().equals(password)) { // password matches

				// do something here

			}

			else {

				tf1.setText(""); // password does not match

				frame1.setTitle("Wrong Password");

				frame1.setVisible(false);

				frame1.setVisible(true);

			}

		}

	}

	public static void main(String args[]) {

		new ButtonExample1("Log in Screen");

	}

}