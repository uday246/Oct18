package oct255th;

class Person {
	private String firstName;
	private String lastname;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String aLastname) {
		lastname = aLastname;
	}

	public Person(String aFirstName, String aLastname) {
		super();
		firstName = aFirstName;
		lastname = aLastname;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastname=" + lastname + "]";
	}

	public Person() {

	}

}

class Student extends Person {
	private double gpa;
	private School school;

	public Student() {

	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double aGpa) {
		gpa = aGpa;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School aSchool) {
		school = aSchool;
	}

	public Student(String aFirstName, String aLastname, double aGpa, School aSchool) {
		super(aFirstName, aLastname);
		gpa = aGpa;
		school = aSchool;
	}

	@Override
	public String toString() {
		return super.toString()+" Student [gpa=" + gpa + ", school=" + school + "]";
	}

}

class School {
	private String name;
	private String city;
	private String state;
	private String zipcode;

	public School(String aName, String aCity, String aState, String aZipcode) {
		super();
		name = aName;
		city = aCity;
		state = aState;
		zipcode = aZipcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String aZipcode) {
		zipcode = aZipcode;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}

public class TestPerson {
	public static void main(String[] args) {
		School sc = new School("Kinds", "Hyd", "TG", "500119");
		Student s = new Student("Smith", "Johan", 8, sc);
		System.out.println(s);
	}
}
