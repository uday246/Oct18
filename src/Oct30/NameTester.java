package Oct30;

import java.util.Scanner;

public class NameTester {
	public static void main(String[] args) {
		// creating the scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		// reading first name from scanner
		String first = sc.nextLine();

		// reading last name from scanner
		System.out.println("Enter last name");
		String last = sc.nextLine();
		String blank = "";
		// appending first and last names
		String fullName = first + blank + last;
		// printing the fullname each char using substr. substr(i,i+1) means it
		// will print 1 char from I
		for (int i = 0; i < fullName.length(); i++) {
			System.out.println(fullName.substring(i, i + 1));
		}
	}
}
