package Oct23;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person object1 = new Person();
		String answer;
		boolean value;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("A or B");
			answer = scnr.next();
			value = object1.aOrB(answer);
		} while (object1.aOrB(answer));
	}
}

class Person {
	boolean value;

	public boolean aOrB(String input) {
		if (input.equalsIgnoreCase("B")) {
			value = false;
		}
		if (input.equalsIgnoreCase("A")) {
			value = true;
		}
		return value;
	}
}
