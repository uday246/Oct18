package gui;

import java.util.Scanner;

public class RegularExp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please enter a sentence that consist of letters only and ends with a period,an exclamation mark or a question mark");
		String str = sc.nextLine();
		sc.close();
		// checking with the pattern for matches
		if (str.matches("[a-zA-Z ]+[?!.]")) {
			System.out.println("The entered input  " + str);
			// replacing all vowelswith #
			str = str.replaceAll("[aeiou]", "#");
			System.out.println("With all vowels replaced is : " + str);

		} else {
			System.out.println("The entered input  " + str + " is not valid");

		}

	}
}
