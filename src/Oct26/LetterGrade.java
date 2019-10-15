package Oct26;

import java.util.Scanner;

public class LetterGrade {
	public static void main(String[] args) {
		String letter = "";
		Scanner sc = new Scanner(System.in);
		double sum = 0, count = 0;
		while (!letter.equalsIgnoreCase("Q")) {
			System.out.println("Enter letter grade,Q to quit");
			letter = sc.nextLine();
			sum = sum + getScore(letter);
			count++;
		}
		System.out.println("Average GPS is : "+(sum/count));
	}

	private static double getScore(String aLetter) {
		double res = 0;
		aLetter=aLetter.toUpperCase();
		switch (aLetter) {
		case "A+":
			res = 4.33;
			break;
		case "A":
			res = 4;
			break;
		case "A-":
			res = 3.67;
			break;

		case "B+":
			res = 3.33;
			break;
		case "B":
			res = 3;
			break;
		case "B-":
			res = 2.67;
			break;

		case "C+":
			res = 2.33;
			break;
		case "C":
			res = 2;
			break;
		case "C-":
			res = 1.67;
			break;
		case "D":
			res = 1;
			break;
		}
		return res;
	}
}
