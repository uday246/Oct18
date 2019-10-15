package oct255th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) {

		String name = args[0];
		int counter = 0;

		// following code checks whether the are any args at all
		if (name == null || name.equals("")) {
			System.out.println("Please provide the file path in command line.");
			return;
		}
		HashTableRead.readFile(name,5);
	}
}

class HashTableRead {
	HashTableAssignment file = new HashTableAssignment();

	private static String[] table;

	public static String[] readFile(String file, int m) {

		String[] names = new String[m];
		Scanner reader;
		try {
			File namesRead = new File(file);// how do i read in args
			reader = new Scanner(namesRead);
			for (int x = 0; x < m; x++)
				names[x] = reader.next();
		}

		catch (FileNotFoundException s) {
			System.out.println("Invalid File path/name! Please enter the correct name/path.");
			System.exit(0);
		}
		return names;
	}
}
