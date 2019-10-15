package oct12;

import java.util.Scanner;

public class HW_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading the all the coins
		System.out.println("Enter your total coins");
		System.out.println("Half-dollars: ");
		int half = sc.nextInt();
		System.out.println("Quarters: ");
		int quarters = sc.nextInt();
		System.out.println("Dimes: ");
		int dimes = sc.nextInt();
		System.out.println("Nickels: ");
		int nickels = sc.nextInt();
		System.out.println("Pennies: ");
		int pennies = sc.nextInt();
		// calling the method to get the dollor amount by passing all the coins
		// details
		double total = theDollorAmount(half, quarters, dimes, nickels, pennies);
		// displaying the total value
		System.out.println("Total amount of money you have: $" + total);
	}

	/**
	 * @param aHalf
	 * @param aQuarters
	 * @param aDimes
	 * @param aNickels
	 * @param aPennies
	 * @return the total amount in the dollor
	 */
	private static double theDollorAmount(int aHalf, int aQuarters, int aDimes, int aNickels, int aPennies) {
		// converting all the value into pennies and dividing it with 100
		return (aHalf * 50 + aQuarters * 25 + aDimes * 10 + aNickels * 5 + aPennies) / 100.0;
	}
}
