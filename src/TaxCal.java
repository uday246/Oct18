import java.util.Scanner;

public class TaxCal {
	public static void main(String[] args) {
		System.out.println("Which year do you want look at it 2017 or 2018");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		System.out.println("Enter you taxable income for the year " + year);
		int amount = sc.nextInt();
		double tax = 0;
		if (year == 2017) {
			if (amount >= 50 && amount < 9325) {
				tax = 0.1;

			}
			if (amount >= 9325 && amount <= 37950) {
				tax = 932;
				tax = tax + (amount - 9325) * 0.15;

			}
			if (amount >= 37950 && amount <= 91900) {
				tax = 5226.5;
				tax = tax + (amount - 37950) * 0.25;

			}
			if (amount >= 91900 && amount <= 191650) {
				tax = 18713.75;
				tax = tax + (amount - 91900) * 0.28;

			}
			if (amount >= 191650 && amount <= 416700) {
				tax = 46643.75;
				tax = tax + (amount - 191650) * 0.33;

			}
			if (amount >= 416700 && amount <= 418400) {
				tax = 120910.25;
				tax = tax + (amount - 416700) * 0.35;

			}
			if (amount >= 418400) {
				tax = 121505.25;
				tax = tax + (amount - 418400) * 0.396;

			}
		} else if (year == 2018) {
			if (amount <= 9525)
				tax = 0.1;
			if (amount > 9525 && amount <= 38700) {
				tax = 952.5;
				tax = tax + (amount - 9525) * 0.12;
			}
			if (amount > 38700 && amount <= 82500) {
				tax = 4453.5;
				tax = tax + (amount - 38700) * 0.22;
			}
			if (amount > 82500 && amount <= 157500) {
				tax = 14089.5;
				tax = tax + (amount - 82500) * 0.24;
			}
			if (amount > 157500 && amount <= 200000) {
				tax = 32089.5;
				tax = tax + (amount - 157500) * 0.32;
			}
			if (amount > 200000 && amount <= 500000) {
				tax = 45689.5;
				tax = tax + (amount - 200000) * 0.35;
			}
			if (amount > 500000) {
				tax = 150689.5;
				tax = tax + (amount - 500000) * 0.37;

			}

		}
		System.out.println("The tax on $" + amount + " for " + year + " is " + (tax));
	}
}
