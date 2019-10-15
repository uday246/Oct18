package Oct5th;

import java.util.Scanner;

public class ExtractWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentense");
		String str = sc.nextLine();
		sc.close();
		// splitting the string with space so we will get list of words
		String temp[] = str.split(" ");
		// looping through the array to print
		for (String s : temp) {
			System.out.println(s);
		}
		System.out.println("There are " + temp.length + " words in your pharse \nBye");
	}
}
