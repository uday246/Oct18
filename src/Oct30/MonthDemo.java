package Oct30;

public class MonthDemo

{

	public static void main(String[] args)

	{

		// Use the no-arg constructor.

		Month m = new Month();

		System.out.println("Month " + m.getMonthNumber() +

				" is " + m);

		// Set the month number to the values 2 through 12

		for (int i = 1; i <= 12; i++)

		{

			m.setMonthNumber(i);

			System.out.println("Month " + m.getMonthNumber() +

					" is " + m);

		}

		// Use the 2nd constructor to create two objects.

		Month m1 = new Month(10);

		Month m2 = new Month(5);

		System.out.println("Month " + m1.getMonthNumber() +

				" is " + m1);

		System.out.println("Month " + m2.getMonthNumber() +

				" is " + m2);

		// Test for equality.

		if (m1.equals(m2))

			System.out.println(m1 + " and " + m2 + " are equal.");

		else

			System.out.println(m1 + " and " + m2 + " are NOT equal.");

		// Is m1 greater than m2?

		if (m1.greaterThan(m2))

			System.out.println(m1 + " is greater than " + m2);

		else

			System.out.println(m1 + " is NOT greater than " + m2);

		// Is m1 less than m2?

		if (m1.lessThan(m2))

			System.out.println(m1 + " is less than " + m2);

		else

			System.out.println(m1 + " is NOT less than " + m2);

	}

}

class Month {

	int monthNumber = 0;
	String name;
	private String arr[] = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	Month() {

		monthNumber = 1;
		name = arr[monthNumber];

	}

	public boolean greaterThan(Month aM2) {
		return this.monthNumber > aM2.monthNumber;
	}

	public boolean lessThan(Month aM2) {
		return this.monthNumber < aM2.monthNumber;
	}

	public void setMonthNumber(int aI) {
		monthNumber = aI;
		name = arr[monthNumber];
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	Month(int m) {

		monthNumber = m;

		if (m < 0 || m > 12) {

			monthNumber = 1;

		}
		name = arr[monthNumber];

	}

	Month(String months) { // get input in and output name of month based on
							// what number correspondes to that month

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(months)) {
				monthNumber = i + 1;
			}
		}
	}

	public String getMonthName() {

		return name;

	}

	public String toString() {

		return name;

	}

	public boolean equals(Month m1) {

		return m1.monthNumber == this.monthNumber;

	}

}//