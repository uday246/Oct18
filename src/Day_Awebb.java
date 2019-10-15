import java.util.Scanner;

public class Day_Awebb {

	String dayString;

	int dayInt;

	private static final int SUNDAY = 0;

	private static final int MONDAY = 1;

	private static final int TUESDAY = 2;

	private static final int WEDNESDAY = 3;

	private static final int THURSDAY = 4;

	private static final int FRIDAY = 5;

	private static final int SATURDAY = 6;

	private int day;

	Scanner input = new Scanner(System.in);

	public static void main(String[] args)

	{
		

		Day_Awebb sunday = new Day_Awebb("Sunday");

		System.out.println("Today is " + sunday);

		System.out.println("Yesterday was " + sunday.getPreviousDay());

		System.out.println("Tomorrow will be " + sunday.getNextDay());

		System.out.println("Four days from now will be " + sunday.addDays(4));

		Day_Awebb tuesday = new Day_Awebb(2);

		System.out.println("Now the day is " + tuesday);

	}

	public Day_Awebb(String day) {

		dayString = day;

		dayInt = dayToInt(day);

	}

	public Day_Awebb(int day) {

		dayInt = day;

		 dayString = dayToString(day);

	}

		public void setDay(String day) {

		dayString = day;

		dayInt = dayToInt(day);

	}

	public void setDay_Awebb(int day) {

		this.day = day;

	}

	public String getDay_Awebb() {

		return dayString;

	}

	public Day_Awebb getNextDay() {

		return new Day_Awebb((dayInt + 1) % 7);

	}

	public Day_Awebb getPreviousDay() {

		int prevDay = (dayInt - 1) % 7;

		if (prevDay < 0)
			prevDay += 7;

		return new Day_Awebb(prevDay);

	}

	public Day_Awebb addDays(int daysToAdd) {

		return new Day_Awebb((dayInt + daysToAdd) % 7);

	}
// convert string to int
	private int dayToInt(String day) {
		day = day.toUpperCase();
		int res = 0;
		switch (day) {
		case "MONDAY":
			res = 1;
			break;
		case "TUESDAY":
			res = 2;
			break;
		case "WEDNESDAY":
			res = 3;
			break;
		case "THURSDAY":
			res = 4;
			break;
		case "FRIDAY":
			res = 5;
			break;
		case "SATURDAY":
			res = 6;
			break;
		case "SUNDAY":
			res = 7;
			break;
		}
		return res;
	}
// convert day into string
	private String dayToString(int day) {
		String res = "";
		switch (day) {
		case 1:
			res = "MONDAY";
			break;
		case 2:
			res = "TUESDAY";
			break;
		case 3:
			res = "WEDNESDAY";
			break;
		case 4:
			res = "THURSDAY";
			break;
		case 5:
			res = "FRIDAY";
			break;
		case 6:
			res = "SATURDAY";
			break;
		case 7:
			res = "SUNDAY";
			break;
		}
		return res;

	}
	public String toString(){
		return dayString;
	}
}
