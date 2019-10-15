package gui;

import javax.swing.*;
import java.awt.event.*;

public class SimpleCalc {
	JFrame f;
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, beq, bclr;

	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	public void run() {
		f = new JFrame("Calculator");
		t = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bdiv = new JButton("/");
		bmul = new JButton("*");
		bsub = new JButton("-");
		badd = new JButton("+");
		beq = new JButton("=");
		bclr = new JButton("C");

		t.setBounds(30, 40, 280, 30);
		b7.setBounds(40, 100, 50, 40);
		b8.setBounds(110, 100, 50, 40);
		b9.setBounds(180, 100, 50, 40);
		bdiv.setBounds(250, 100, 50, 40);

		b4.setBounds(40, 170, 50, 40);
		b5.setBounds(110, 170, 50, 40);
		b6.setBounds(180, 170, 50, 40);
		bmul.setBounds(250, 170, 50, 40);

		b1.setBounds(40, 240, 50, 40);
		b2.setBounds(110, 240, 50, 40);
		b3.setBounds(180, 240, 50, 40);
		bsub.setBounds(250, 240, 50, 40);

		b0.setBounds(110, 310, 50, 40);
		beq.setBounds(180, 310, 50, 40);
		badd.setBounds(250, 310, 50, 40);
		bclr.setBounds(40, 310, 50, 40);

		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bsub);
		f.add(b0);
		f.add(beq);
		f.add(badd);
		f.add(bclr);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		b1.addActionListener(new MyActionListener(this));
		b2.addActionListener(new MyActionListener(this));
		b3.addActionListener(new MyActionListener(this));
		b4.addActionListener(new MyActionListener(this));
		b5.addActionListener(new MyActionListener(this));
		b6.addActionListener(new MyActionListener(this));
		b7.addActionListener(new MyActionListener(this));
		b8.addActionListener(new MyActionListener(this));
		b9.addActionListener(new MyActionListener(this));
		b0.addActionListener(new MyActionListener(this));
		badd.addActionListener(new MyActionListener(this));
		bdiv.addActionListener(new MyActionListener(this));
		bmul.addActionListener(new MyActionListener(this));
		bsub.addActionListener(new MyActionListener(this));
		beq.addActionListener(new MyActionListener(this));
		bclr.addActionListener(new MyActionListener(this));
	}

	public static void main(String... s) {
		SimpleCalc sc = new SimpleCalc();

		sc.run();
	}
}

class MyActionListener implements ActionListener {
	SimpleCalc s;

	public MyActionListener(SimpleCalc s1) {
		s = s1;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == s.b1)
			s.t.setText(s.t.getText().concat("1"));

		if (e.getSource() == s.b2)
			s.t.setText(s.t.getText().concat("2"));

		if (e.getSource() == s.b3)
			s.t.setText(s.t.getText().concat("3"));

		if (e.getSource() == s.b4)
			s.t.setText(s.t.getText().concat("4"));

		if (e.getSource() == s.b5)
			s.t.setText(s.t.getText().concat("5"));

		if (e.getSource() == s.b6)
			s.t.setText(s.t.getText().concat("6"));

		if (e.getSource() == s.b7)
			s.t.setText(s.t.getText().concat("7"));

		if (e.getSource() == s.b8)
			s.t.setText(s.t.getText().concat("8"));

		if (e.getSource() == s.b9)
			s.t.setText(s.t.getText().concat("9"));

		if (e.getSource() == s.b0)
			s.t.setText(s.t.getText().concat("0"));

		if (e.getSource() == s.badd) {
			SimpleCalc.a = Double.parseDouble(s.t.getText());
			SimpleCalc.operator = 1;
			s.t.setText("");
		}

		if (e.getSource() == s.bsub) {
			SimpleCalc.a = Double.parseDouble(s.t.getText());
			SimpleCalc.operator = 2;
			s.t.setText("");
		}

		if (e.getSource() == s.bmul) {
			SimpleCalc.a = Double.parseDouble(s.t.getText());
			SimpleCalc.operator = 3;
			s.t.setText("");
		}

		if (e.getSource() == s.bdiv) {
			SimpleCalc.a = Double.parseDouble(s.t.getText());
			SimpleCalc.operator = 4;
			s.t.setText("");
		}

		if (e.getSource() == s.beq) {
			SimpleCalc.b = Double.parseDouble(s.t.getText());

			switch (SimpleCalc.operator) {
			case 1:
				SimpleCalc.result = SimpleCalc.a + SimpleCalc.b;
				break;

			case 2:
				SimpleCalc.result = SimpleCalc.a - SimpleCalc.b;
				break;

			case 3:
				SimpleCalc.result = SimpleCalc.a * SimpleCalc.b;
				break;

			case 4:
				SimpleCalc.result = SimpleCalc.a / SimpleCalc.b;
				break;

			default:
				SimpleCalc.result = 0;
			}

			s.t.setText("" + SimpleCalc.result);
		}

		if (e.getSource() == s.bclr)
			s.t.setText("");

	}
}