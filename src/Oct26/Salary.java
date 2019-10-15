package Oct26;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double currentSalary;
		double raise = 0;
		double newSalary;
		String rating;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current salary");
		currentSalary = sc.nextDouble();
		System.out.println("enter the performance rating (Excellent,Good, or Poor)");
		rating = sc.next();
		if (rating.equals("Excellent")) {
			raise = currentSalary * 0.06;
		}
		if (rating.equals("Good")) {
			raise = currentSalary * 0.04;
		}
		if (rating.equals("poor")) {
			raise = currentSalary * 0.015;
		}
		newSalary = currentSalary + raise;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary : " + money.format(currentSalary));
		System.out.println("Amount of raise: " + money.format(raise));
		System.out.println("Your new Salary: " + money.format(newSalary));
		System.out.println();

	}
}
