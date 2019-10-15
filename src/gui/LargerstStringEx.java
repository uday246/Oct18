package gui;

import java.util.Scanner;

public class LargerstStringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		sc.close();
		System.out.println("Largest Word in Given String : " + largestWord(str));
	}

	private static String largestWord(String aStr) {

		// spliting string into words
		String arr[] = aStr.split(" ");
		int len = -1;
		String str = "";
		// looping to find the largest word
		for (String s : arr) {
			if (s.length() > len) {
				len = s.length();
				str = s;
			}
		}
		return str;

	}
}
