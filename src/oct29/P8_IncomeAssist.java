package oct29;

import java.util.Scanner;

public class P8_IncomeAssist {
	public static void main(String[] args) {
		int income = 0;
		int children = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter household income or -1 to exit: ");
			income = sc.nextInt();
			if (income == -1)
				break;
			System.out.println("Number of children :");
			children = sc.nextInt();
			int temp = getIncome(income, children);
			System.out.println("Based upon a household income of $ "+income+" and "+children+" children,the income assistance amount is $"+temp);
		}
		sc.close();
		System.out.println("Exiting the Program");
	}

	private static int getIncome(int aIncome, int aChildren) {
		if (aIncome > 30000 && aIncome <= 40000 && aChildren >= 3)
			return aChildren * 1000;
		if (aIncome >= 20000 && aIncome <= 30000 && aChildren >= 2)
			return aChildren * 1500;
		if (aIncome < 20000)
			return aChildren * 2000;
		return 0;
	}
}
