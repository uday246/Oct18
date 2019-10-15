package Oct5th;

import java.util.Scanner;

class PasswordVerifier {
	private final static int MIN_PASSWORD_LENGTH = 6;

	public static boolean isValid(String str) {
		return str.length() >= MIN_PASSWORD_LENGTH && hasUpperCase(str) && hasLowerCase(str) && hasDigit(str);
	}

	private static boolean hasUpperCase(String str) {
		for (int i = 0; i < str.length(); i++)
			if (Character.isUpperCase(str.charAt(i)))
				return true;
		return false;
	}

	private static boolean hasLowerCase(String str) {
		for (int i = 0; i < str.length(); i++)
			if (Character.isLowerCase(str.charAt(i)))
				return true;
		return false;
	}

	private static boolean hasDigit(String str) {
		for (int i = 0; i < str.length(); i++)
			if (Character.isDigit(str.charAt(i)))
				return true;
		return false;
	}
}

public class PasswordDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String pass = sc.nextLine();
		if (PasswordVerifier.isValid(pass)) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}
	}
}
