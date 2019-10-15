package oct12;

import java.util.Random;

public class Pay {
	public static void main(String[] args) {
		Random r = new Random();
		int goal = r.nextInt(900) + 100;
		int i = 1, total = 0, pay = 1;
		//printing the details 
		System.out.println("Day\tPay\tTotal Earnings");
		for (i = 1; i <= 7; i++) {
			total += pay;
			System.out.println(i + "\t" + pay + "\t" + total);
			//double the amount
			pay *= 2;
		}
		total = 0;
		pay=1;
		// calculating the required days
		for (i = 1; i <= 7; i++) {
			total += pay;
			if (total >= goal) {
				break;
			}
			pay *= 2;
		}
		System.out.println("Earning Goal: $" + goal);
		System.out.println("You need to work " + i + " days to reach the earning goal.");
	}
}
