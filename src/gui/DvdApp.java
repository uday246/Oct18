package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DvdApp {

	private JPanel appPanel;

	private JButton add_customer;
	private JButton add_dvd;
	private JButton return_dvd;
	private JButton rent_dvd;

	private JList movie_list;
	private JList customer_list;
	private JTextArea cost;

	private JTextField fname;
	private JTextField lname;
	private JTextField pnum;

	private JTextField title;
	private JTextField category;
	private JCheckBox isNewRelease;

	private JButton cancel;
	private JButton doneButton;

	private JLabel fname_label;
	private JLabel lname_label;
	private JLabel pnum_label;
	private JLabel title_label;
	private JLabel category_label;
	private JLabel release_label;

	public DvdApp() {
		appPanel = new JPanel();
		add_dvd = new JButton("Add");
		add_dvd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setDvdVisiblity(true);
				setRentVisibilty(false);
				setCustomerVisibilty(false);
			}
		});

		return_dvd = new JButton("Return");
		return_dvd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		rent_dvd = new JButton("Rent");
		rent_dvd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getDoneButton().setVisible(true);
				setDvdVisiblity(false);
				setRentVisibilty(true);
				setCustomerVisibilty(false);
			}
		});

		DefaultListModel<String> movie_category = new DefaultListModel<>();
		DefaultListModel<String> customer_model_list = new DefaultListModel<>();
		movie_category.addElement("horror");
		movie_category.addElement("sci-fi");
		movie_category.addElement("drama");
		movie_category.addElement("romance");
		movie_category.addElement("comedy");
		movie_category.addElement("action");
		movie_category.addElement("action");
		movie_category.addElement("cartoon");
		customer_list = new JList<>();
		customer_list.setModel(customer_model_list);
		movie_list = new JList<>();
		movie_list.setModel(movie_category);
		doneButton = new JButton("Done");
		getDoneButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getDoneButton().setText("Hola");
			}
		});
		cost = new JTextArea();
		cost.setEditable(false);

		setRentVisibilty(false);
		setCustomerVisibilty(false);
		setDvdVisiblity(false);

		getDoneButton().setEnabled(false);
		cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setRentVisibilty(false);
				setCustomerVisibilty(false);
				setDvdVisiblity(false);
				getDoneButton().setEnabled(false);
			}
		});

		add_customer = new JButton("Add");
		add_customer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setDvdVisiblity(false);
				setRentVisibilty(false);
				setCustomerVisibilty(true);
			}
		});

	}

	public void setDvdVisiblity(boolean isVisible) {
		title = new JTextField();
		title.setVisible(isVisible);
		category = new JTextField();
		category.setVisible(isVisible);
		isNewRelease = new JCheckBox();
		isNewRelease.setVisible(isVisible);
		title_label = new JLabel();
		title_label.setVisible(isVisible);
		category_label = new JLabel();
		category_label.setVisible(isVisible);
		release_label = new JLabel();
		release_label.setVisible(isVisible);
	}

	public void setCustomerVisibilty(boolean isVisible) {
		fname = new JTextField();
		fname.setVisible(isVisible);
		pnum = new JTextField();
		pnum.setVisible(isVisible);
		lname = new JTextField();
		lname.setVisible(isVisible);
		fname_label = new JLabel();
		fname_label.setVisible(isVisible);
		lname_label = new JLabel();
		lname_label.setVisible(isVisible);
		pnum_label = new JLabel();
		pnum_label.setVisible(isVisible);
	}

	public void setRentVisibilty(boolean isVisible) {
		cost.setVisible(isVisible);
		movie_list.setVisible(isVisible);
		customer_list.setVisible(isVisible);
	}

	public static void main(String[] args) {
		JFrame client_app = new JFrame("DvdApp"); // creating instance of JFrame
		client_app.setContentPane(new DvdApp().appPanel);
		client_app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client_app.setSize(1000, 500);// 400 width and 500 height
		client_app.setVisible(true);
	}

	public JButton getDoneButton() {
		return doneButton;
	}

	public void setDoneButton(JButton aDoneButton) {
		doneButton = aDoneButton;
	}
}
