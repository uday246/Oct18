package Oct30;

class Perimeter {
	private double a;
	private double b;

	Perimeter() {
		this(5);
		System.out.println("Default constructor");
	}

	Perimeter(double d) {
		this(d, d * d);
		a = d;
		b = a * a;
		System.out.println("1 arg constructor");
	}

	Perimeter(double d1, double d2) {
		a = d1;
		b = d2;
		System.out.println("2 arg constructor");
	}

}

public class TestPerimeter {
	public static void main(String[] args) {
		Perimeter m = new Perimeter();
	}
}
