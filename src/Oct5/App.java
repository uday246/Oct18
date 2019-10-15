package Oct5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ControlPanel extends JPanel  {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	CenterPanel cp;
	TopPanel tp;
	group g1;

	public ControlPanel() {
		super();
		BorderLayout border = new BorderLayout();
		setLayout(border);
		setBackground(Color.gray);

		student st1 = new student("Joshua", "James", 23);
		student st2 = new student("Victoria", "Snyder", 32);
		student st3 = new student("Conner", "Smith", 25);
		student st4 = new student("Skyler", "Reese", 28);
		student[] students = { st1, st2, st3, st4 };

		g1 = new group("Nittany Lions");
		g1.addStudents(students);

		cp = new CenterPanel(g1);

		cp.jb1.addActionListener(new MyActionListener(this));
		cp.jb2.addActionListener(new MyActionListener(this));
		cp.jb3.addActionListener(new MyActionListener(this));
		cp.jb4.addActionListener(new MyActionListener(this));

		tp = new TopPanel(g1);
		add(tp, "North");
		add(cp, "Center");
	}

	
}
class MyActionListener implements ActionListener{
	ControlPanel panel;
	public MyActionListener(ControlPanel aControlPanel) {
		panel = aControlPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == panel.cp.jb1) {
			panel.cp.jb1.setText("Student gpa: " + panel.g1.getStudentGPA(0));
			panel.tp.jb3.setText("" + panel.g1.getAverageGPA());
		}
		if (obj == panel.cp.jb2) {
			panel.cp.jb2.setText("Student gpa: " + panel.g1.getStudentGPA(0));
			panel.tp.jb3.setText("" + panel.g1.getAverageGPA());
		}
		if (obj == panel.cp.jb3) {
			panel.cp.jb3.setText("Student gpa: " + panel.g1.getStudentGPA(0));
			panel.tp.jb3.setText("" + panel.g1.getAverageGPA());
		}
		if (obj == panel.cp.jb4) {
			panel.cp.jb4.setText("Student gpa: " + panel.g1.getStudentGPA(0));
			panel.tp.jb3.setText("" + panel.g1.getAverageGPA());
		}
	}
}
class CenterPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton jb1, jb2, jb3, jb4;

	public CenterPanel(group g1) {
		super();
		GridLayout grid = new GridLayout(4, 1);
		setLayout(grid);
		setBackground(Color.pink);

		jb1 = new JButton("Name = " + g1.students[0].getName() + " " + g1.students[0].myGPA);
		add(jb1);
		jb2 = new JButton("Name = " + g1.students[1].getName() + " " + g1.students[1].myGPA);
		add(jb2);
		jb3 = new JButton("Name = " + g1.students[2].getName() + " " + g1.students[2].myGPA);
		add(jb3);
		jb4 = new JButton("Name = " + g1.students[3].getName() + " " + g1.students[3].myGPA);
		add(jb4);
	}
}

class TopPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton jb1, jb2, jb3;

	public TopPanel(group g1) {
		super();
		setBackground(Color.blue);

		jb1 = new JButton(g1.groupName);
		jb2 = new JButton("Group Average: ");

		jb2.setBackground(Color.white);

		jb3 = new JButton("" + g1.getAverageGPA());

		add(jb1);
		add(jb2);
		add(jb3);
	}
}

class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ControlPanel mjp;

	public MainFrame() {
		super("Lab 06");
		mjp = new ControlPanel();
		getContentPane().add(mjp, "Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 480);
		setVisible(true);
	}
}

class student {
	String firstName;
	String lastName;
	int age;
	Random r = new Random();
	double myGPA = 0 + (r.nextDouble() * 4.0);

	student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.myGPA = semesterGPA();
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public String getInfo() {
		return "Name: " + this.firstName + " " + this.lastName + " " + "Age: " + this.age + " " + "GPA: " + this.myGPA;
	}

	public double semesterGPA() {
		this.myGPA = Math.round((this.r.nextDouble() * 4.0) * 10.0) / 10.0;
		return myGPA;
	}

}

class group {

	String groupName;
	double avgGPA = 0.0;

	group(String groupName) {
		this.groupName = groupName;
	}

	student[] students = new student[4];

	public void addStudents(student[] students) {
		this.students[0] = students[0];
		this.students[1] = students[1];
		this.students[2] = students[2];
		this.students[3] = students[3];
	}

	public double getAverageGPA() {
		avgGPA = 0;
		for (student s : this.students) {
			this.avgGPA += s.myGPA;
		}
		return (Math.round((this.avgGPA / 4.0) * 10.0) / 10.0);
	}

	public double getStudentGPA(int index) {
		return (this.students[index].semesterGPA());
	}
}

public class App {

	public static void main(String args[]) {
		MainFrame mjf = new MainFrame();
		System.out.println(mjf);
	}
}
