package Oct23;

import java.util.ArrayList;

class Employee {
	private String name;
	private String department;
	private String id;
	private Address address;
	private Contact contact;
	

	// Default constructor. Set protected variables to the empty string or 0
	public Employee() {
		name = "";
		department = "";
		id = "";
	}

	// Constructor with parameters to set the private variables
	public Employee(String name, String department, String id,Address a, Contact c) {
		this.name = name;
		this.department = department;
		this.id = id;
		address=a;
		contact=c;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getId() {
		return id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getWeeklyPay() {
		return 0.0;
	}

	public String toString() {
		return "Name: " + name + ", Department: " + department + ", ID: " + id;
	}
}
class Address{
	private String streetAddress;
	private String city;
	private String state;
	private String pinCode;
	public Address(){}
	public Address(String aStreetAddress, String aCity, String aState, String aPinCode) {
		super();
		streetAddress = aStreetAddress;
		city = aCity;
		state = aState;
		pinCode = aPinCode;
	}
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + "]";
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String aStreetAddress) {
		streetAddress = aStreetAddress;
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String aPinCode) {
		pinCode = aPinCode;
	}
	
}
class Contact{
	private String email;
	private String phone;
	Contact(){
		
	}
	public Contact(String aEmail, String aPhone) {
		super();
		email = aEmail;
		phone = aPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String aEmail) {
		email = aEmail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String aPhone) {
		phone = aPhone;
	}
	@Override
	public String toString() {
		return "Contact [email=" + email + ", phone=" + phone + "]";
	}
	
	
}
class HourlyEmployee extends Employee {

	private double hourlyRate;

	/* FIXME(2) Complete the default constructor to set hourlyRate to 0.0 */

	public HourlyEmployee() {

		super();
		hourlyRate = 0.0;

	}

	/*
	 * FIXME(3) Complete the argumented constructor to set each field properly
	 * 
	 * Note that you can call the superclass constructor to initialize the
	 * fields defined in the superclass
	 * 
	 * The second video in Canvas shows an example on this.
	 */

	public HourlyEmployee(String name, String department,

			String id, double rate,Address a , Contact c) {

		super(name, department, id,a,c);

		setHourlyRate(rate);

	}


	public double getHourlyRate() {

		return hourlyRate;

	}

	public void setHourlyRate(double rate) {

		hourlyRate = (rate < 0.0) ? 0.0 : rate;

	}


	@Override

	public String toString() {

		return "hourly employee: "

				+ super.toString()

				+ String.format(" hourly wage: $%.2f\n",

						getHourlyRate());

	}

}

class SalariedEmployee extends Employee {
	private double annualSalary;

	public SalariedEmployee() {
		annualSalary=0;
	}

	public SalariedEmployee(String name, String department, String id, double salary,Address a,Contact c) {
		super(name, department, id,a,c);	
		annualSalary=salary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double salary) {
		this.annualSalary = salary;
	}

	@Override
	public double getWeeklyPay() {
		return annualSalary / 52;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + " Department : " + getDepartment() + " ID : " + getId() + ", Annual Salary : $"
				+ getAnnualSalary();
	}

}

public class HumanResource {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		HourlyEmployee e1 = new HourlyEmployee("John Smith", "Sales", "jsmith1", 18.2,new Address(),new Contact());
		employees.add(e1);
		SalariedEmployee e2 = new SalariedEmployee("Amy Brown", "Marketing", "abrown3", 45000,new Address(),new Contact());
		employees.add(e2);
		SalariedEmployee e3 = new SalariedEmployee("Henry Chuck", "Accounting", "cchuck2", 50000.0,new Address(),new Contact());
		employees.add(e3);
		SalariedEmployee e4 = new SalariedEmployee("Mary Miller", "IT", "mmiller5", 75000,new Address(),new Contact());
		employees.add(e4);

		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).getName() + " $" + employees.get(i).getWeeklyPay());
		}
	}
}