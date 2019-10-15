package Oct5th;

import java.time.LocalDate;
import java.util.Scanner;

public class DateValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the in this format yyyy-mm-dd");
		String str = sc.nextLine();
		String arr[] = str.split("-");
		int dd = Integer.parseInt(arr[2]);
		int mm = Integer.parseInt(arr[1]);
		sc.close();
		if (mm < 1 || mm > 12 || dd < 1 || dd > 31) {
			System.out.println("Invalid date");
			return;
		}
		LocalDate locale = LocalDate.parse(str);
		LocalDate locale1 = LocalDate.parse("2015-05-25");

		System.out.println();
		if (locale.getDayOfWeek().toString().equals("MONDAY")) {
			System.out.println("Next BusinessDay : Tuesday");
		}
		if (locale.getDayOfWeek().toString().equals("TUESDAY")) {
			System.out.println("Next BusinessDay : Wednedday");
		}
		if (locale.getDayOfWeek().toString().equals("WEDNESDAY")) {
			System.out.println("Next BusinessDay : Thursday");
		}
		if (locale.getDayOfWeek().toString().equals("THURSDAY")) {
			System.out.println("Next BusinessDay : Friday");
		}
		if (locale.getDayOfWeek().toString().equals("FRIDAY") || locale.getDayOfWeek().toString().equals("SATURDAY")
				|| locale.getDayOfWeek().toString().equals("SUNDAY")) {
			System.out.println("Next BusinessDay : Monday");
		}
		if (locale.isAfter(locale1)) {
			System.out.println("Your date comes after May 25, 2015");
		} else {
			System.out.println("Your date comes before May 25, 2015");

		}
	}
}