package gui;

class BirdSighting {
	private String species;
	private int number;
	private int dayOfTheYear;
	public BirdSighting(){
		
	}
	// constructor to assign the values
	public BirdSighting(String aSpecies, int aNumber, int aDayOfTheYear) {
		super();
		species = aSpecies;
		number = aNumber;
		dayOfTheYear = aDayOfTheYear;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String aSpecies) {
		species = aSpecies;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int aNumber) {
		number = aNumber;
	}

	public int getDayOfTheYear() {
		return dayOfTheYear;
	}

	public void setDayOfTheYear(int aDayOfTheYear) {
		dayOfTheYear = aDayOfTheYear;
	}
	@Override
	public String toString() {
		return "BirdSighting [species=" + species + ", number=" + number + ", dayOfTheYear=" + dayOfTheYear + "]";
	}

}

public class TestBirdSighting {
	public static void main(String[] args) {
		BirdSighting b = new BirdSighting();
		b.setSpecies("Robin");
		b.setNumber(1);
		b.setDayOfTheYear(1);
		System.out.println(b);
	}
}
