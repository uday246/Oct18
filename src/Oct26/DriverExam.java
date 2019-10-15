package Oct26;

import java.util.Scanner;

public class DriverExam {
	static int correct = 0, incorrect = 0, missed = 0;

	String arr[] = { "B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D",
	"A" };
	DriverExam(){
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DriverExam de = new DriverExam();
		for (int i = 0; i < 20;) {
			System.out.println("Enter Answer : " + (i + 1) + " (A,B,C,D)");
			String ans = sc.nextLine();
			if ("ABCD".toUpperCase().contains(ans.toUpperCase())) {
				if (ans.trim().length() == 0)
					missed++;
				else if (ans.equalsIgnoreCase(de.arr[i]))
					correct++;
				else
					incorrect++;
				i++;
			}
		}
		System.out.println("Passed : "+passed());
	}

	public static int getCorrectAns() {
		return correct;
	}

	public static int getInCorrectAns() {
		return incorrect;
	}

	public static int getmissed() {
		return missed;
	}

	public static boolean passed() {
		return correct >= 15;
	}
}