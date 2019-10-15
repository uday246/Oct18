package Oct23;

import java.util.Scanner;

public class OrderStrings {

	public static void main(String[] args) {
		System.out.println("enter 3 Strings");
		Scanner sc = new Scanner(System.in);
		String firstStr = sc.next();
		String secondStr = sc.next();
		String thirdStr = sc.next();
		System.out.println("you entered " + firstStr + " " + secondStr + " " + thirdStr);
		// comparing str1 with 2 and 3
		if (firstStr.compareTo(secondStr) < 0 && firstStr.compareTo(thirdStr) < 0) {
			if (secondStr.compareTo(thirdStr) < 0) {
				System.out.println(firstStr +  ","+secondStr +  ","+thirdStr);
			} else {
				System.out.println(firstStr + ","+thirdStr+ ","+ secondStr);

			}

		}
		// comparing str2 with 1 and 3
		else if (secondStr.compareTo(firstStr) < 0 && secondStr.compareTo(thirdStr) < 0) {
			if (firstStr.compareTo(thirdStr) < 0) {
				System.out.println(secondStr +  ","+firstStr + ","+ thirdStr);
			} else {
				System.out.println(secondStr +  ","+thirdStr +  ","+firstStr);
			}
			// comparing str2 with 1 and 2
		} else if (thirdStr.compareTo(firstStr) < 0 && thirdStr.compareTo(secondStr) < 0) {
			if (firstStr.compareTo(secondStr) < 0) {
				System.out.println(thirdStr +  ","+firstStr +  ","+secondStr);
			} else {
				System.out.println(thirdStr +  ","+secondStr +  ","+firstStr);
			}

		}

	}

}
