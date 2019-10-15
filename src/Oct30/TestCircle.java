package Oct30;

class Circle {
	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double aRadius) {
		super();
		radius = aRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double aRadius) {
		radius = aRadius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "The circle has radius " + radius;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		System.out.println("The area is : " + c1.getArea());
		System.out.println("The perimeter is : " + c1.getPerimeter());
		c1.setRadius(10);
		System.out.println(c1);
		System.out.println("The area is : " + c1.getArea());
		System.out.println("The perimeter is : " + c1.getPerimeter());
		
	}
}
