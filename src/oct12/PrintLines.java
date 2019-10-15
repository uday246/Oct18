package oct12;

public class PrintLines {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i == 4)
				System.out.print("*");
			else
				System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < 9; i++) {
			if (i > 2 && i < 6)
				System.out.print("*");
			else
				System.out.print("-");
		}
		System.out.println();

		for (int i = 0; i < 9; i++) {
			if (i > 1 && i < 7)
				System.out.print("*");
			else
				System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < 9; i++) {
			if (i > 0 && i < 8)
				System.out.print("*");
			else
				System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < 9; i++) {
			System.out.print("*");
		}
		System.out.println();

	}
}
