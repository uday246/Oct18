package Oct5th;

import java.util.*;

public class BirthdayReminder {
	public static void main(String[] args) {
		// Write your code here
		String sentinal = "ZZZ";
		final int size = 10;
		int count = 0;
		String name = "";
		String dateOfBirth = null;
		
		String[] names = new String[size];
		String[] birthdates = new String[size];
		
		Scanner input = new Scanner(System.in);
		
		while (!name.equals(sentinal) && count < 10) {
			System.out.println("Enter a name or enter ZZZ to quit: ");
			name = input.nextLine();
			System.out.println("Enter birtdate: ");
			dateOfBirth = input.nextLine();
			names[count] = name;
			birthdates[count] = dateOfBirth;
			count++;
		}
		System.out.println("Total number of names is: " + count);
		boolean repeat = true;
		boolean found = false;
		while (repeat) {
			System.out.println("Enter name to get birthday(or ZZZ to quit): ");
			name = input.nextLine();
			if (name.equals(sentinal))
				break;
			else {
				for (int i = 0; i < count && !found; i++) {
					if (names[i].equals(name)) {
						found = true;
						dateOfBirth = birthdates[i];

					}
				}
				if (found)
					System.out.println("The birthdate of " + name + " is " + dateOfBirth);
				else
					System.out.println("Sorry, no entry for " + name);
			}
			found = false;
		}
	}
}
