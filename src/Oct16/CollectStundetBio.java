package Oct16;

import java.util.Scanner;

class Student {
	private String name;
	private String address;
	private String education;
	private String hobbies;
	private int age;
	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String aAddress) {
		address = aAddress;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String aEducation) {
		education = aEducation;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String aHobbies) {
		hobbies = aHobbies;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int aAge) {
		age = aAge;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", education=" + education + ", hobbies=" + hobbies
				+ ", age=" + age + "]";
	}


}

public class CollectStundetBio {
	public static void main(String[] args) {
		Student st[] = new Student[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			st[i] = new Student();
			System.out.println("Enter Student Name ");
			st[i].setName(sc.nextLine());
			System.out.println("Enter Student Address");
			st[i].setAddress(sc.nextLine());
			System.out.println("Enter Student education");
			st[i].setEducation(sc.nextLine());
			System.out.println("Enter Student hobbies");
			st[i].setHobbies(sc.nextLine());
			System.out.println("Enter Student age");
			st[i].setAge(sc.nextInt());
			sc.nextLine();
			
		}
		sc.close();
		for (int i = 0; i < 10; i++) {
			System.out.println(st[i]);
		}
	}
}
