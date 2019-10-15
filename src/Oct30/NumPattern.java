package Oct30;

import java.util.Scanner;

public class NumPattern {
	public static void main(String[] args) {
		int x=5;
		int temp=x;
		int num = getLargerInt(5);
		for(int i=0;i<=num-temp;i++){
			System.out.println(numberPattern(i,x));
			x++;
		}

	}

	private static String numberPattern(int n, int x) {
		String res="";
		for(int i=0;i<=n;i++)
			res=res+"\t"+x;
		return res.trim();
	}

	private static int getLargerInt(int n) {
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("Enter an integer greater than " + n + ": ");
			num = sc.nextInt();
			if (num > n)
				break;
			System.out.println(num + " is too small. Try again");
		}
		return num;
	}
}
