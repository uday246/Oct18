import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int rand = r.nextInt(10);
		int temp = 0;
		System.out.println("Guess what is my favorite digit (0-9) ?");
		temp = sc.nextInt();
		while (true) {
			if (temp < 0 || temp > 9) {
				System.out.println("The number you enterd is not in range , Please enter a number (0-9)?");
			}
			if (temp == rand) {
				System.out.println("Good guess");
				break;
			} else {
				System.out.println("Incorrect ,Please try to guess again (0-9)");
			}
			temp = sc.nextInt();
		}
	}
}
