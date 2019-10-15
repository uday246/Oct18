package oct12;

import java.util.Scanner;

public class PrintDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// storing month names in array to print based on given number
		System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
		String months[] = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		// storing day names in array to print based on given number
		String days[] = { "", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int dayNumber = sc.nextInt();
		int monthNumber = sc.nextInt();
		int date = sc.nextInt();
		int year = sc.nextInt();
		System.out.println(dayNumber + " " + monthNumber + " " + date + " " + year + " is " + days[dayNumber] + " "
				+ months[monthNumber] + " " + date + "," + year);

	}
}
