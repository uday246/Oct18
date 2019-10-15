package Oct30;

public class MaxElemen {
	public static void main(String[] args) {
		System.out.println("Big number : " + findMax(10, 34, 20));
		System.out.println("Big number : " + findMax(34, 20, 10));
		System.out.println("Big number : " + findMax(20, 10, 34));
	}

	private static int findMax(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		if (b >= c && b >= a)
			return b;
		return c;
	}

}
