package Oct16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ModelUseNamPass {

	// Values that will display on the screen.

	private int UserName, PassWord;

	// Method for inputing user name.

	public void EnterName(int Name) {

		UserName = Name;

	}

	// Gets the User Name value.

	public int getUserName() {

		return UserName;

	}

	// Method for inputing password

	public void PassWord(int data) {

		PassWord = data;

	}

	// Gets the Password value.

	public int getPassWord() {

		return PassWord;

	}

}

// Components to make the interface.

class ViewUseNamPass extends JFrame {

	// Label that says "User Name" in the dialogue box.

	private JLabel UserNameLabel = new JLabel("User Name");

	// Allows user to enter his/her name.

	private JTextField Name = new JTextField(20);

	// Displays button for user to click after inputting his/her name.

	private JButton UserNameButton = new JButton("Submit");

	// Label that says "Password" in the dialogue box.

	private JLabel PassWordLabel = new JLabel("Password");

	// Allows user to enter his/her password.

	private JTextField PassWord = new JTextField(20);

	// Displays button for user to click after inputting his/her password.

	private JButton PassWordButton = new JButton("Submit");

	// Displays Label that welcomes the user after he/she finishes entering both
	// username and password.

	private JLabel SubmitResults = new JLabel();

	// Interface that will display on the screen.

	ViewUseNamPass() {

		// Sets up the interface that will display on the screen.

		JPanel UseNamPassPanel = new JPanel();

		// When user clicks the "x" on the top right of the dialogue box, the
		// application will close.

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Sets the size of the dialogue box 600 wide and 200 pixels tall.

		this.setSize(600, 200);

		// Components added to the panel for the User Name.

		UseNamPassPanel.add(UserNameLabel); // Displays the label for user name.

		UseNamPassPanel.add(Name); // Displays the box for user to input his/her
									// name.
		PassWord.setEditable(true);
		UseNamPassPanel.add(UserNameButton); // Displays button for user to
												// click after he/she finishes
												// inputting name.

		// Components added to the panel for the Password.

		UseNamPassPanel.add(PassWordLabel); // Displays the label for password.

		UseNamPassPanel.add(PassWord); // Displays the box for user to input
										// his/her password.

		UseNamPassPanel.add(PassWordButton); // Displays button for user to
												// click after he/she finishes
												// inputting password.

		// Components to show results after user is finished inputting both
		// his/her username and password.

		UseNamPassPanel.add(SubmitResults);

		// Represents the JFrame that is extended by ViewUseNamePass as shown on
		// the top.

		this.add(UseNamPassPanel);

		// End of setting up the components.

	}

	// Gets access to the user name. THIS IS WHERE THE ERROR IS LOCATED AT.

	public int getUserName() {

		// Returns a string

		return Integer.parseInt(Name.getText());

	}

	// Gets access to the password.

	public int getPassWord() {

		// Returns a string

		return Integer.parseInt(PassWord.getText());

	}

	// Gets the submission results

	public int getSubmitResults() {

		return Integer.parseInt(SubmitResults.getText());

	}

	// Sets the submission results

	public void setSubmission(int Submission) {

		SubmitResults.setText(Integer.toString(Submission));

	}

	// If the button is clicked, then execute a method in the Controller named
	// actionPerformed.

	// When button for both the User Name and Password are clicked, the
	// Controller will be alerted by it.

	void addListener(ActionListener ListenForButton) {

		UserNameButton.addActionListener(ListenForButton);

		PassWordButton.addActionListener(ListenForButton);

	}

	// This will open a pop up that contains the error message passed.

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}

}

// Handles interactions between everything.

class ControllerUseNamPass {

	// Allows interaction with ViewUseNamPass

	private ViewUseNamPass View;

	// Allows interaction with ModelUseNamPass

	private ModelUseNamPass Model;

	// Represents the constructor

	public ControllerUseNamPass(ViewUseNamPass View, ModelUseNamPass Model) {

		// Access the View.

		this.setView(View);

		// Access the Model.

		this.setModel(Model);

		// Tells View when the "submit" button is click, then it executes the
		// ActionPerformed method.

		this.getView().addListener(new Listener());

	}

	// Listener as an inner class letting us listen what is going on with our
	// View with our Controller.

	public ViewUseNamPass getView() {
		return View;
	}

	public void setView(ViewUseNamPass aView) {
		View = aView;
	}

	public ModelUseNamPass getModel() {
		return Model;
	}

	public void setModel(ModelUseNamPass aModel) {
		Model = aModel;
	}

	class Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			int Name = 0;

			// Prevents any errors from being triggered.

			try {

				Name = getView().getUserName();

				getModel().EnterName(Name);

				getView().setSubmission(getModel().getUserName());

			}

			// Catches error that is triggered.

			catch (NumberFormatException ex) {

				getView().displayErrorMessage("INVALID INPUT!");

			}

		}

	}

}

public class MVCUseNamPass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// View exists.

		ViewUseNamPass View = new ViewUseNamPass();

		// Model exists.

		ModelUseNamPass Model = new ModelUseNamPass();

		// Controller unifies both View and Model so they can both interact with
		// each other.

		ControllerUseNamPass Controller = new ControllerUseNamPass(View, Model);

		// Makes View visible on the screen.

		View.setVisible(true);

	}

}
