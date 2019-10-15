package Oct5th;

import java.util.Scanner;

class Grocery {
	private int itemNumber;
	private double price;
	private int stackInQuantity;

	private void readItemNumber(Scanner sc) {
		int num = 0;
		System.out.println("Enter item number ");
		do {
			num = sc.nextInt();
		} while (num < 1000 || num > 9999);
		itemNumber = num;
	}

	private void readPrice(Scanner sc) {
		double price = 0;
		System.out.println("Enter Price ");
		do {
			price = sc.nextDouble();
		} while (price < 0);
		this.price = price;
	}

	private void readQuanity(Scanner sc) {
		int q = 0;
		System.out.println("Enter Quantity ");
		do {
			q = sc.nextInt();
		} while (price < 0);
		this.stackInQuantity = q;
	}

	public void dataEntry() {
		Scanner sc = new Scanner(System.in);
		readItemNumber(sc);
		readPrice(sc);
		readQuanity(sc);
	}

	public void display() {
		System.out.println("Item Number : " + itemNumber);
		System.out.println("Price : " + price);
		System.out.println("Stock in Quantity : " + stackInQuantity);

	}
	public static void main(String[] args) {
		Grocery g = new Grocery();
		g.dataEntry();
		g.display();
	}
}

public class Grocery2 {
	public static void main(String[] args) {
		Grocery g[] = new Grocery[10];
		for (int i = 0; i < 10; i++) {
			g[i] = new Grocery();
			g[i].dataEntry();
		}
		for (int i = 0; i < 10; i++) {
			g[i].display();
			System.out.println();
		}

	}
}
