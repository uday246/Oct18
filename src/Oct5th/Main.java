package Oct5th;

class Patient {
	private String firstName;
	private String lastName;
	BloodData bd;

	public Patient() {
		bd = new BloodData("O", "+");
	}


	public Patient(String aFirstName, String aLastName, BloodData aBd) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		bd = aBd;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String aLastName) {
		lastName = aLastName;
	}


	public BloodData getBd() {
		return bd;
	}

	public void setBd(BloodData aBd) {
		bd = aBd;
	}


	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", Blood  : " + bd ;
	}
	
	
}
class BloodData {
	String blood_type;
	String rhFactor;

	public BloodData(String aBlood_type, String aRhFactor) {
		super();
		blood_type = aBlood_type;
		rhFactor = aRhFactor;
	}
	// displays blood data

	@Override
	public String toString() {
		return "blood_type=" + blood_type + ", rhFactor=" + rhFactor;
	}
	
}



public class Main {
	public static void main(String[] args) {
		Patient spike = new Patient("Uday","Kumar", new BloodData("-", "AB"));
		System.out.println(spike);

	}
}
