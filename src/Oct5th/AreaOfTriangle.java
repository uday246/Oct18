package Oct5th;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 points for circle");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();

		// get the sides of the triangle
		double side1 = getDistance(x1, y1, x2, y2);
		double side2 = getDistance(x2, y2, x3, y3);
		double side3 = getDistance(x1, y1, x3, y3);

		double s = (side1 + side2 + side3) / 2;
		System.out.println(s);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("Area of triangle : " + area);
	}

	private static double getDistance(double x1, double y1, double x2, double y2) {
		// returns the length of 2 points based on formula sqaure root of
		// (x2-x1)^2 + (y2-y1)^2
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
}
