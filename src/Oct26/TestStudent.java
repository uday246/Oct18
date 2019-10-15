package Oct26;

class Student {
	private String Name;
	private String school;
	private String city;
	private String phone;

	public Student(String aName, String aSchool, String aCity, String aPhone) {
		super();
		Name = aName;
		school = aSchool;
		city = aCity;
		phone = aPhone;
	}

	public Student(String aName) {
		super();
		Name = aName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String aName) {
		Name = aName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String aSchool) {
		school = aSchool;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String aCity) {
		city = aCity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String aPhone) {
		phone = aPhone;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", school=" + school + ", city=" + city + ", phone=" + phone + "]";
	}

}

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Koti", "Jakson", "Chicago", "1231321");
		Student s2 = new Student("Koti");
		s2.setSchool("Jakson");
		s2.setCity("Chicago");
		s2.setPhone("1231321");
		System.out.println(s1);
		System.out.println(s2);
	}
}
