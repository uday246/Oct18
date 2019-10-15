package Oct14;

import java.util.Random;
import java.util.Scanner;

public class LuckyRand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("Enter lowcutof value");
		int num = sc.nextInt();
		lucky(rn, num);
	}

	private static void lucky(Random rn, int aNum) {
		int count = 0, i = 0;
		while (count != 4) {
			// getting random number between 1-6
			int n = rn.nextInt(6) + 1;
			i++;
			System.out.print(n+" ");
			if (n >= aNum) {
				count++;
			} else {
				count = 0;
			}
		}
		System.out.println("\nfinished After "+i+" rolls ");
	}
}
