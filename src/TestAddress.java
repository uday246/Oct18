
public class TestAddress{
	public static void main(String[] args) {
		//Address a = new Address(25, "BalajiNagar", "Bibinagar", "Telangana", 508122);
		//a.print();
		System.out.println(System.getProperty("file.separator"));
	}
}
class Address {
	private int houseNo;
	private String street;
	private String city;
	private String state;
	private int postalCode;

	public Address () {

	}

	public Address (int aHouseNo, String aStreet, String aCity, String aState, int aPostalCode) {
		super();
		houseNo = aHouseNo;
		street = aStreet;
		city = aCity;
		state = aState;
		postalCode = aPostalCode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int aHouseNo) {
		houseNo = aHouseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String aStreet) {
		street = aStreet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String aCity) {
		city = aCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String aState) {
		state = aState;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int aPostalCode) {
		postalCode = aPostalCode;
	}

	public void print() {
		System.out.println("House No :" + houseNo);
		System.out.println("Street : " + street);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Postal code : " + postalCode);

	}
}

class Rectangle {
	private double width;
	private double height;

	public Rectangle() {

	}

	public Rectangle(double aWidth, double aHeight) {
		super();
		width = aWidth;
		height = aHeight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double aWidth) {
		width = aWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double aHeight) {
		height = aHeight;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	
}

