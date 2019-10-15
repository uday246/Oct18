
public class Calcs {
	public static void main(String[] args) {
		double x1 = 3 + 4 - 6 / 2 * 3;
		System.out.println("x1 = :" + x1);
		double x2 = 12 % 5;
		System.out.println("x2 = :" + x2);
		double y3 = 4, z3 = 3;
		double x3 = y3++ + ++z3;
		System.out.println("x3 = :" + x3);
		double x4 = 3;
		double y4 = x4++ + 4;
		System.out.println("y4 = :" + y4);
		System.out.println("x4 = :" + x4);
		double y5 = 7;
		double x5 = (y5 <= 4) ? 3 : 8;
		System.out.println("x5 = :" + x5);
		double x6 = 5;
		x6 *= 3;
		System.out.println("x6 = :" + x6);

	}
}
