package Oct26;

import java.util.Scanner;

public class TaxCalculatorTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading the marriage status

		System.out.println("Enter you marriage status ");

		String status = sc.nextLine();

		// reading the income

		System.out.println("Enter your taxable income");
		int income = sc.nextInt();
		// calling calculateTax to get the tax
		sc.close();
		double taxDue = calculateTax(status, income);
		System.out.println("Marrial status : " + status);
		System.out.println("Total taxable income : " + income);
		System.out.println("Tax due : " + taxDue);
	}

	public static double calculateTax(String status, int income) {
		// if status is single
		double total = 0;
		if (status.equalsIgnoreCase("S")) {

			if (income < 10000) {

				total = income * 0.05;

			}

			if (income >= 10000 && income < 60000) {

				total = 500;

				int temp = income - 10000;

				total += temp * 0.02;

			}

			if (income >= 60000 && income <= 100000) {

				total = 1000;

				int temp = income - 60000;

				total += temp * 0.05;

			} else {
				total = 8500;
				int temp = income - 200000;

				total += temp * 0.1;

			}

		}

		// if status is Married than based on income we are calculating the tax

		if (status.equalsIgnoreCase("M")) {

			if (income <= 20000) {

				total = income * 0.05;

			}

			if (income > 20000 && income < 100000) {

				total = 1000;

				int temp = income - 20000;

				total += temp * 0.05;

			}

			if (income >= 100000 && income < 500000) {

				total = 5000;

				int temp = income - 100000;

				total += temp * 0.05;

			} else {
				total = 14000;
				int temp = income - 500000;

				total += temp * 0.15;

			}

		}
		return total;
	}
}
