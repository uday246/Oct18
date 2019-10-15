package oct3rd;

class HourlyEmployee {
	float hoursWorked;
	float hourRate;
	String firstName;
	String lastName;
	int age;

	public HourlyEmployee(String aFirstName, String aLastName) {
		firstName = aFirstName;
		lastName = aLastName;
		age = 21;
		hourRate = 0;
		hoursWorked = 0;
	}

	public HourlyEmployee() {
		age = 21;
		hourRate = 0;
		hoursWorked = 0;
	}

	public HourlyEmployee(String aFirstName, String aLastName, int a, float aHoursWorked, float aHourRate) {
		firstName = aFirstName;
		lastName = aLastName;
		hoursWorked = aHoursWorked;
		hourRate = aHourRate;
		age = a;
	}

	// returns earnings for that employee
	public double computePay() {
		return hourRate * hoursWorked;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float aHoursWorked) {
		hoursWorked = aHoursWorked;
	}

	public float getHourRate() {
		return hourRate;
	}

	public void setHourRate(float aHourRate) {
		hourRate = aHourRate;
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

	public int getAge() {
		return age;
	}

	public void setAge(int aAge) {
		age = aAge;
	}

}

public class EmployeeDriver {
	public EmployeeDriver() {
		HourlyEmployee employee1 = new HourlyEmployee("Nikola", "Telsa", 85, 60, 100);
		displayEmployee(employee1);
		HourlyEmployee employee2 = duplicateEmployee(employee1);
		System.out.println();
		displayEmployee(employee2);
		
		System.out.println();
		displayEmployee(resetEmployee(employee1));

	}
	// reset the emp data
	private HourlyEmployee resetEmployee(HourlyEmployee aEmployee2) {

		return new HourlyEmployee("Missing", "Missing");
	}
	// clone the emp object
	private HourlyEmployee duplicateEmployee(HourlyEmployee e) {
		return new HourlyEmployee(e.getFirstName(), e.getLastName(), e.getAge(), e.getHoursWorked(), e.getHourRate());
	}
	// disaply data
	private void displayEmployee(HourlyEmployee aEmployee1) {
		System.out.println("First Name : " + aEmployee1.getFirstName());
		System.out.println("Last Name : " + aEmployee1.getLastName());
		System.out.println("Age : " + aEmployee1.getAge());
		System.out.println("Hours Worked : " + aEmployee1.getHoursWorked());
		System.out.println("Hour rate : " + aEmployee1.getHourRate());
	}

	public static void main(String[] args) {
		new EmployeeDriver();

	}
}
