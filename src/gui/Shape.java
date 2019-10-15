package gui;

public abstract class Shape {
	Point startPoint;
	Point controlPoint;
	Color color;

	public Shape() {

	}

	public Shape(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color aColor) {
		color = aColor;
	}

	public void setControlPoint(Point aControlPoint) {
		controlPoint = aControlPoint;
	}

	public void draw(Graphics g);

	@Override
	public String toString() {
		return "Shape [toString()=" + super.toString() + "]";
	}

}
