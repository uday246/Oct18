package gui;

import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";

		while (!str.equalsIgnoreCase("Q")) {
			System.out.println("Please enter expression or (Q -exit)");
			str = sc.nextLine();
			if(str.equalsIgnoreCase("Q")) break;
			String arr[] = str.split("[+-/*]");
			double num1 = 0;
			double num2 = 0;
			try {
				num1 = Double.parseDouble(arr[0].trim());
				num2 = Double.parseDouble(arr[1].trim());
			} catch (Exception e) {
				System.out.println("Invalid number format try gain");
				continue;
			}
			if (str.contains("+")) {
				System.out.println("Result : " + (num1 + num2));
			}
			if (str.contains("-")) {
				System.out.println("Result : " + (num1 - num2));
			}
			if (str.contains("*")) {
				System.out.println("Result : " + (num1 * num2));
			}
			if (str.contains("/")) {
				System.out.println("Result : " + (num1 / num2));
			}
		}
		sc.close();
	}
}
