package Oct30;

import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sqrtSumBucketer(sc);
	}

	private static void sqrtSumBucketer(Scanner input) {
		System.out.println("Enter 2 numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		double sum = Math.sqrt(num1) + Math.sqrt(num2);
		if (sum < 10)
			System.out.println("Less than 10");
		else if (sum >= 10 && sum < 20)
			System.out.println("Between 10 and 20");
		else if (sum >= 20 && sum < 30)
			System.out.println("Between 20 and 30");
		else
			System.out.println("Greater than 30");

	}
}
