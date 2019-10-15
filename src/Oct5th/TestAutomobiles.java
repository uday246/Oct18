package Oct5th;

class Automobiles {
	private int id;
	private String make;
	private String model;
	private String color;
	private int year;
	private int mpg;

	public Automobiles(int aId, String aMake, String aModel, String aColor, int aYear, int aMpg) {
		super();
		if (aId >= 0 && aId <= 9999)
			id = aId;
		else
			id = 0;

		make = aMake;
		model = aModel;
		color = aColor;
		if (aYear >= 2000 && aYear <= 2017)
			year = aYear;
		else
			year = 0;

		if (aMpg >= 0 && aMpg <= 60)
			mpg = aMpg;
		else
			mpg = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		if (aId >= 0 && aId <= 9999)
			id = aId;
		else
			id = 0;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String aMake) {
		make = aMake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String aModel) {
		model = aModel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String aColor) {
		color = aColor;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		if (aYear >= 2000 && aYear <= 2017)
			year = aYear;
		else
			year = 0;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int aMpg) {
		if (mpg >= 0 && mpg <= 60)
			mpg = aMpg;
		else
			mpg = 0;
	}

	@Override
	public String toString() {
		return "Automobiles [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", year=" + year
				+ ", mpg=" + mpg + "]";
	}

}

public class TestAutomobiles {
	public static void main(String[] args) {
		Automobiles a1 = new Automobiles(1, "Honda", "Civic", "Red", 2015, 20);
		System.out.println(a1);
		Automobiles a2 = new Automobiles(-22, "Volkswagon", "Polo", "white", 2018, 80);
		System.out.println(a2);

	}
}
