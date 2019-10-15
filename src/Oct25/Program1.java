package Oct25;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Program1 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;
				if (s1.length() > s2.length())
					return 1;
				return -1 * s1.compareTo(s2);
			}

		});
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.isEmpty())
				break;
			set.add(line);
		}
		for (String s : set) {
			System.out.println(s);
		}
	}
}
