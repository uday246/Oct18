package Oct26;

import java.util.Scanner;

public class MovieQuoteInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Quote");
		String quote = sc.nextLine();
		System.out.println("Enter the movie name");
		String movie = sc.nextLine();
		System.out.println("Enter the which year movie released");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Person who said that quote");
		String saidBy = sc.nextLine();
		System.out.println("Quote 	: " + quote);
		System.out.println("Movie 	: " + movie);
		System.out.println("year 	: " + year);
		System.out.println("Said by : " + year);

	}
}
