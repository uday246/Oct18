package Oct16;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ThreeColor {

	private JFrame frame;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					ThreeColor window = new ThreeColor();

					window.getFrame().setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the application.
	 * 
	 */

	public ThreeColor() {

		initialize();

	}

	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */

	private void initialize() {

		setFrame(new JFrame());

		getFrame().setBounds(100, 100, 450, 300);

		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		menuBar.setToolTipText("Color");

		getFrame().setJMenuBar(menuBar);

		JMenu mnColor = new JMenu("Color");

		menuBar.add(mnColor);

		JMenuItem mntmGreen = new JMenuItem("Green");

		mntmGreen.setBackground(Color.GREEN);

		mnColor.add(mntmGreen);

		mntmGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(Color.green);

			}
		});

		JMenuItem mntmBlue = new JMenuItem("Blue");
		mntmBlue.setBackground(Color.BLUE);
		mnColor.add(mntmBlue);
		mntmBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(Color.blue);
			}

		});

		JMenuItem mntmRed = new JMenuItem("Red");
		mntmRed.setBackground(Color.RED);
		mnColor.add(mntmRed);
		mntmRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(Color.red);

			}
		});

		mnColor.add(mntmRed);

		mnColor.add(mntmGreen);

		mnColor.add(mntmBlue);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame aFrame) {
		frame = aFrame;
	}

}
