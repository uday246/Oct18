package oct29;

import javax.swing.JOptionPane;

public class Dates {
	public static void main(String[] args) {
		int month, day, year;
		int daysInMonth;
		boolean monthValid, yearValid, dayValid;
		boolean isLeapYear;
		String d = JOptionPane.showInputDialog("Enter the date in the format mm/dd/yyyy");
		String arr[] = d.split("/");
		month = Integer.parseInt(arr[0]);
		day = Integer.parseInt(arr[1]);
		year = Integer.parseInt(arr[2]);
		isLeapYear = isLeap(year);
		daysInMonth = getDats(month, year);
		dayValid = day <= daysInMonth;
		monthValid = month >= 1 && month <= 12;
		yearValid = year >= 1000 && year <= 1999;

		if (dayValid && monthValid && yearValid) {
			JOptionPane.showMessageDialog(null, "Date is valid :");

		} else {
			JOptionPane.showMessageDialog(null, "Date is invalid");
		}

	}

	private static int getDats(int mm, int aYy) {
		int res = -1;
		switch (mm) {
		case 1:
			res = 31;
			break;
		case 2:
			if (isLeap(aYy))
				res = 28;
			else
				res = 29;
			break;
		case 3:
			res = 31;
			break;
		case 4:
			res = 30;
			break;
		case 5:
			res = 31;
			break;
		case 6:
			res = 30;
			break;
		case 7:
			res = 31;
			break;
		case 8:
			res = 31;
			break;
		case 9:
			res = 30;
			break;
		case 10:
			res = 31;
			break;
		case 11:
			res = 30;
			break;
		case 12:
			res = 31;
			break;

		}
		return res;
	}

	private static boolean isLeap(int year) {
		boolean leap = false;
		// if any year is divisable by 4 than there are many chances for leap
		// year except few
		if (year % 4 == 0) {
			// if it is divisable by 100 than it shoud also divisable by 400
			// like 2000 etc
			if (year % 100 == 0) {
				// year is divisible by 400, so the year is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		return leap;
	}
}
