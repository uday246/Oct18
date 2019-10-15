package Oct16;

public class PrintNumbers {
	public static void main(String[] args) {
		writeNumber(5);
	}

	public static void writeNumber(int n) {
		if (n == 0)
			return;
		if (n % 2 == 1)
			System.out.print(n + " ");
		writeNumber(n - 1);
		if (n % 2 == 0)
			System.out.print(n + " ");

	}
}
