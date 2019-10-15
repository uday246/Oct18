package Oct5th;

class Triangle{
private double height;
private double base;
	public void setHeight(double aI) {

			height = aI;
	}

	public void setBase(double aD) {
		 base = aD;
	}

	public void displayArea() {
		System.out.println((base*height)/2);
	}

	@Override
	public String toString() {
		return "This is Triangle";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(base);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		return true;
	}
	
}
class Circle{

	public static double radius;

	public Circle(int aI) {
		radius = aI;
	}

	public static double displayArea(int aI) {
		return Math.PI *  aI * aI;
	}

	public double displayArea() {
		// TODO Auto-generated method stub
		return Math.PI *  radius * radius;
	}
	public boolean equals(Circle c){
		return radius == Circle.radius;
	}
}
public class Tester {

    public static void main(String[] args) {

     Triangle myTriangle = new Triangle();

     Triangle yourTriangle = new Triangle();

     Circle myCircle = new Circle(6);

     Circle yourCircle = new Circle(6);

     myTriangle.setHeight(8);

     myTriangle.setBase(4.7);

     myTriangle.displayArea();

     System.out.println(myTriangle == yourTriangle);

     System.out.println(myCircle == yourCircle);

     System.out.println(myTriangle.equals(yourTriangle));

     System.out.println(myCircle.equals(yourCircle));

     System.out.println(myTriangle.toString());

     System.out.println(Circle.radius);

     System.out.println(Circle.displayArea(5));

     System.out.println(yourCircle.displayArea());

     }

}
