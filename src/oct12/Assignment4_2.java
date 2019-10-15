package oct12;

public class Assignment4_2 {
	public static void main(String[] args) {
		int A=5;
		// assigning the incremeneted value to the A
		A = localModification(A);
		System.out.println(A);
	}
	// changing return type to int to return incremeneted value
	private static int localModification(int a) {
		a++;
		return a;
	}

	
}
