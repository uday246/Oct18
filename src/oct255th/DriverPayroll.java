package oct255th;

import java.util.Scanner;

class PayRoll {
	private String employeeNames[];
	private double hoursWorked[];
	private double hourlyWage[];
	private double grossWage[];
	private int index = 0;

	public PayRoll(int size) {
		employeeNames = new String[size];
		hoursWorked = new double[size];
		hourlyWage = new double[size];
		grossWage = new double[size];

	}

	public void add(String name, double hours, double wage) {
		employeeNames[index] = name;
		hourlyWage[index] = wage;
		hoursWorked[index] = hours;
		grossWage[index++] = wage * hours;
	}

	public void print(int index) {
		System.out.println(employeeNames[index] + " : " + grossWage[index]);
	}
}

public class DriverPayroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int size = sc.nextInt();
		sc.nextLine();
		PayRoll p = new PayRoll(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter number of hours worked");
			double h = sc.nextDouble();
			double w = 0;
			do {
				System.out.println("Enter hour wage");
				w = sc.nextDouble();
			} while (w < 8);
			p.add(name, h, w);
			sc.nextLine();
		}
		for (int i = 0; i < size; i++) {
			p.print(i);
		}
	}
}
