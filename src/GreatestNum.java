import java.util.Scanner;

public class GreatestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers values to find the highest one");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int big = 0;
		if (n1 > n2 && n1 > n3)
			big = n1;
		else if (n2 > n3)
			big = n2;
		else
			big = n3;
		System.out.println("The highest number among " + n1 + "," + n2 + " and " + n3 + " is equal to " + big);
	}
}
