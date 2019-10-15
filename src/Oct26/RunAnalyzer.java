package Oct26;

import java.util.Scanner;

public class RunAnalyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number weeks data that you have");
		int n = sc.nextInt();
		double arr[] = new double[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter miles run for week " + (i + 1));
			arr[i] = sc.nextDouble();
			sum = sum + arr[i];
		}
		boolean flag = true;
		for (int i = 0; i < n - 1; i++) {
			if (!(arr[i] < arr[i + 1])) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Tour weekly mileage  is increasing constantly");
		}
		System.out.println("Averate weekly mileage is : " + (sum / n));
	}
}
