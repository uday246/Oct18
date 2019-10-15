package Oct30;

import java.io.File;
import java.util.Scanner;

public class BlankLine {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("lines.txt"));
		reportBlankLines(sc);
	}

	private static void reportBlankLines(Scanner sc) {
		int count = 0, l = 0;
		String s = "";
		while (sc.hasNextLine()) {
			s = sc.nextLine();
			l++;
			if (s.trim().length() == 0) {
				System.out.println("Line " + l + " is blank");
				count++;
			}
		}
		System.out.println("Total blank lines : " + count);
	}
}
