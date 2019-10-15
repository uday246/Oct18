package Oct5th;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		double side1 = 0, side2 = 0, side3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 sides of triangle");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		sc.close();
		System.out.println("Entered Sides are : " + side1 + "," + side2 + "," + side3);
		if (side1 < 0 || side2 < 0 || side3 < 0) {
			System.out.println("The values entered do not make a valid triangle");
		}
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			if (side1 == side2 && side2 == side3) {
				System.out.println("Given sides form equilateral triangle");
			} else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
				System.out.println("Given sides form isosceles  triangle");

			} else {
				System.out.println("Given sides form scalene   triangle");
			}
		} else {
			System.out.println("The values entered do not make a valid triangle");
		}
	}
}
