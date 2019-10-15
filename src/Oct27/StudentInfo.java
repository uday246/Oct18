package Oct27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Student {

	private int id;
	private String firstName;
	private String LastName;

	public Student() {

	}

	public Student(int aId, String aFirstName, String aLastName) {
		super();
		id = aId;
		firstName = aFirstName;
		LastName = aLastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		id = aId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String aLastName) {
		LastName = aLastName;
	}

}

public class StudentInfo {
	public static void main(String[] args) {
		Class std = Student.class;
		Method[] methods = std.getMethods();
		System.out.println("*******Methods******");
		for (Method m : methods) {
			System.out.println(m.getReturnType().getName() + " " + m.getName());
			System.out.println();
			Parameter param[] = m.getParameters();
			for (Parameter p : param) {
				System.out.println(p.getType() + " " + p.getName());
			}
			System.out.println();
		}
		System.out.println("*****Constructor******");
		Constructor con[] = std.getConstructors();
		for (Constructor c : con) {
			System.out.println(c.getName() + c.getModifiers());
			System.out.println();
			Parameter param[] = c.getParameters();
			for (Parameter p : param) {
				System.out.println(p.getType() + " " + p.getName());
			}
			System.out.println();
		}
		System.out.println("******Fields******");
		Field field[] = std.getDeclaredFields();
		for (Field f : field) {
			System.out.println(f.getType() + " " + f.getName());
		}
	}
}
