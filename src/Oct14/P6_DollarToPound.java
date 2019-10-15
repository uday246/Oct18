package Oct14;

import java.util.Scanner;

public class P6_DollarToPound {
	public static void main(String[] args) {
		System.out.println("Enter today's US Dollar to British Pound Sterling exchange rate");
		Scanner sc = new Scanner(System.in);
		double rate = sc.nextDouble();
		double amount;
		do {
			System.out.println("Enter US Dollar amount to convert to British pound (type 0 to quit): ");
			amount = sc.nextDouble();
			if (amount == 0)
				break;

			System.out.println("Based on an exchange rate of 1 US Dollor  to " + rate + "," + amount
					+ " US Dollars will return " + (rate * amount) + " British pound.");
		} while (amount > 0);
		System.out.println("Good bye");
		sc.close();

	}
}
