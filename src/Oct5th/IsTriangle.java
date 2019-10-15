package Oct5th;

// point class to store the x and y
class Point {
	// store point value x
	int x;
	// store point value y
	int y;
	// returns x value
	public int getX() {
		return x;
	}
	// sets x value
	public void setX(int aX) {
		x = aX;
	}
	// returns y value
	public int getY() {
		return y;
	}
	// sets y value
	public void setY(int aY) {
		y = aY;
	}
// param constructor to assign the values to x and y
	public Point(int aX, int aY) {
		// assigning values to x and y
		x = aX;
		y = aY;
	}
	// default constructor to assign values to 0
	public Point() {
		x = 0;
		y = 0;
	}

}
// Line class is used to store the points of the line
class Line {
	// point1 location details
	Point p1;
	// point2 location details
	Point p2;
// default constructor to intialize to null
	public Line() {
		p1 = null;
		p2 = null;

	}
	// param constructor to intialize values point1 and point2
	public Line(Point aP1, Point aP2) {
// assigning values
		p1 = aP1;
		p2 = aP2;
	}
	// returns point1;
	public Point getP1() {
		return p1;
	}
	// sets point1;
	public void setP1(Point aP1) {
		p1 = aP1;
	}
	// returns point2;
	public Point getP2() {
		return p2;
	}
	// sets point2;
	public void setP2(Point aP2) {
		p2 = aP2;
	}

}

public class IsTriangle {
	public static void main(String[] args) {
		// creating point with 0,0
		Point p1 = new Point(0, 0);
		// creating point with 0,10
		Point p2 = new Point(0, 10);
		// creating line with p1,p2
		Line l1 = new Line(p1, p2);
		// creating point with 0,0
		Point p3 = new Point(0, 0);
		// creating point with 0,10;
		Point p4 = new Point(0, 10);
		// creating line with p3,p4
		Line l2 = new Line(p3, p4);
		// creating point with 0,10
		Point p5 = new Point(0, 10);
		// creating point with 10,0
		Point p6 = new Point(10, 0);
		// creating point with p5,p6
		Line l3 = new Line(p5, p6);
		// finding distance of line1
		double a = getDistance(l1);
		// finding distance of line2
		double b = getDistance(l2);
		// finding distance of line3
		double c = getDistance(l3);
		// checking if these three lines can form a triangle
		System.out.println("Given points can form triangle : " + canformTriangle(a, b, c));

	}
	// checks given points can form a triangle as sum of 2 sides is < other side than it is triangle
	private static boolean canformTriangle(double a, double b, double c) {
		// checking sides for sum of 2sides < other side
		if (a + b <= c || a + c <= b || b + c <= a)
			return false;
		else
			return true;
	}

	// returns the length of 2 points based on formula sqaure root of (x2-x1)^2 + (y2-y1)^2
	private static double getDistance(Line l) {
		// getting x1
		int x1 = l.getP1().x;
		// getting x2
		int x2 = l.getP2().x;
		// getting y1
		int y1 = l.getP1().y;
		// getting y2
		int y2 = l.getP2().y;
		//returns the length of 2 points based on formula sqaure root of (x2-x1)^2 + (y2-y1)^2
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
}
