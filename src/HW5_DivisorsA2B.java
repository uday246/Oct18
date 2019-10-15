
import java.util.Scanner;

/**
 *
 * @author Fazeel Ayaz This program allows the usert ot enter a integer and
 *         output the divisors of the integer.
 */
public class HW5_DivisorsA2B {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("This program will print the divisors of each number in the [A,B].");

		System.out.println("Enter A: ");
		int A = kb.nextInt();

		System.out.print("Enetr B: ");
		int B = kb.nextInt();

		System.out.print("Enetr the length of horizontal lines: ");
		int Length = kb.nextInt();

		for (int i = A; i <= B; i++) {

			System.out.print(i + " : ");
			for (int j = 1; j <= i; j++)
				if (i % j == 0) {
					System.out.printf("%d ", j);
				}
			System.out.println();
			for (int j = 0; j < Length; j++) {
				System.out.print("-");

			}
			System.out.println();
		}

	}

}