package Oct5th;

import java.util.Scanner;

class Change {
	private int quarters;
	private int dimes;
	private int nickles;
	private int pennies;

	private static final int QUARTER_VALUE = 25;
	private static final int DIME_VALUE = 10;
	private static final int NICKLE_VALUE = 5;
	private static final int PENNIE_VALUE = 1;

	public Change() {
		quarters = 0;
		nickles = 0;
		dimes = 0;
		pennies = 0;
	}

	public int calculateQuarter(int val) {
		quarters = val / QUARTER_VALUE;

		return val % QUARTER_VALUE;
	}

	public int calculateDimes(int val) {
		dimes = val / DIME_VALUE;

		return val % DIME_VALUE;
	}

	public int calculateNickles(int val) {
		nickles = val / NICKLE_VALUE;

		return val % NICKLE_VALUE;
	}

	public int calculatePennie(int val) {
		pennies = val / PENNIE_VALUE;

		return val % PENNIE_VALUE;
	}

	public int getQuarters() {
		return quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickles() {
		return nickles;
	}

	public int getPennies() {
		return pennies;
	}

}

public class ChangeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int change = sc.nextInt();
		sc.close();
		int remainder = 0;
		Change myObj = new Change();
		remainder = myObj.calculateQuarter(change);
		remainder = myObj.calculateDimes(remainder);
		remainder = myObj.calculateNickles(remainder);
		remainder = myObj.calculatePennie(remainder);

		System.out.println("Quarters : " + myObj.getQuarters());
		System.out.println("Dimes: " + myObj.getDimes());
		System.out.println("Nickles : " + myObj.getNickles());
		System.out.println("Pennies : " + myObj.getPennies());

	}
}
