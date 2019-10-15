package gui;

import java.util.Scanner;

class Employee {
	private String firstName;
	private String lastName;
	private String id;
	private String street;
	private String city;
	private String state;

	public Employee() {
	}

	public Employee(String aFirstName, String aLastName, String aId, String aStreet, String aCity, String aState) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		id = aId;
		street = aStreet;
		city = aCity;
		state = aState;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String aLastName) {
		lastName = aLastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		id = aId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String aStreet) {
		street = aStreet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String aCity) {
		city = aCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String aState) {
		state = aState;
	}

	@Override
	public String toString() {
		return "FirstName : " + firstName + "\nLastName : " + lastName + "\nId : " + id + "\nStreet : " + street
				+ "\nCity : " + city + "\nState : " + state;
	}

}

class HourlyEmployee extends Employee {
	int hoursWorked;
	double hourRate;

	public HourlyEmployee() {

	}

	public HourlyEmployee(String aFirstName, String aLastName, String aId, String aStreet, String aCity, String aState,
			int aHoursWorked, double aHourRate) {
		super(aFirstName, aLastName, aId, aStreet, aCity, aState);
		hoursWorked = aHoursWorked;
		hourRate = aHourRate;
	}

	// returns earnings for that employee
	public double earnings() {
		return hourRate * hoursWorked;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int aHoursWorked) {
		hoursWorked = aHoursWorked;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double aHourRate) {
		hourRate = aHourRate;
	}

	public String toString() {
		return super.toString() + "\nHours Worked : " + hoursWorked + "\nPay Rate : " + hourRate + "\nEarnings : "
				+ earnings();
	}
}

public class TestEmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp1 first name");
		String fname = sc.nextLine();
		System.out.println("Enter emp1 last name");
		String lname = sc.nextLine();

		System.out.println("Enter emp1 Id");
		String id = sc.nextLine();

		System.out.println("Enter emp1 street");
		String street = sc.nextLine();
		System.out.println("Enter emp1 City");
		String city = sc.nextLine();
		System.out.println("Enter emp1 state");
		String state = sc.nextLine();

		System.out.println("Enter Emp1 hours and hour rate");
		int hours = sc.nextInt();
		double rate = sc.nextDouble();
		HourlyEmployee h1 = new HourlyEmployee(fname, lname, id, street, city, state, hours, rate);
		System.out.println("Enter emp2 first name");
		fname = sc.nextLine();
		System.out.println("Enter emp2 last name");
		lname = sc.nextLine();

		System.out.println("Enter emp2 Id");
		id = sc.nextLine();

		System.out.println("Enter emp2 street");
		street = sc.nextLine();
		System.out.println("Enter emp2 City");
		city = sc.nextLine();
		System.out.println("Enter emp2 state");
		state = sc.nextLine();
		System.out.println("Enter emp2 hours and hour rate");
		hours = sc.nextInt();
		rate = sc.nextDouble();
		sc.close();
		HourlyEmployee h2 = new HourlyEmployee(fname, lname, id, street, city, state, hours, rate);
		System.out.println("Employee 1 earnings : " + h1);
		System.out.println("Employee 2 earnings : " + h2);

	}
}
