package oct12;

import java.util.Scanner;

public class CarRental {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose the car");
		System.out.println("1 full-size\n2 for mid-size\n3 for compact\n4 for SUV");
		// reading user option
		int ch = sc.nextInt();
		int amount = 0;
		// checking for type to set the price
		if (ch == 1 || ch == 2)
			amount = 175;
		if (ch == 3)
			amount = 160;
		if (ch == 4)
			amount = 200;
		// if the selection is proper offering sound package
		if (ch > 0 && ch <= 4) {
			System.out.println("Do you want  premium sound package 1 yes ,0-no");
			ch = sc.nextInt();
			if (ch!=0 && ch!=1)
				System.out.println("Invalid option");
			else if(ch==1)
				amount += 30;
		}
		System.out.println("Total price for you car for a week $" + amount);
	}
}
