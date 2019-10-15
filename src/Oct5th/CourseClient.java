package Oct5th;

class Course{
	private String code;
	private String description;
	private int numberOfCredits;
	
	public Course(){
		
	}
	public Course(String aCode, String aDescription, int aNumberOfCredits) {
		super();
		code = aCode;
		description = aDescription;
		numberOfCredits = aNumberOfCredits;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String aCode) {
		code = aCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String aDescription) {
		description = aDescription;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(int aNumberOfCredits) {
		numberOfCredits = aNumberOfCredits;
	}
	public String toString(){
		return "Course " + getCode() + " is " + getDescription() + " and is worth "
				+ getNumberOfCredits() + " credits.";
	}
	
}
public class CourseClient {

	public static void main(String[] args) {

		Course c1, c2;

		c1 = new Course();

		c1.setCode("COMP150");

		c1.setDescription("Object-Oriented Programming");

		c1.setNumberOfCredits(3);

		c2 = new Course("COMP150", "Object-Oriented Programming", 3);

		System.out.println("c1 is: " + c1);

		System.out.println("c2 is: " + c2);

		System.out.println("Do your getters work?");

		String code, desc;

		int credits;

		code = c1.getCode();

		desc = c1.getDescription();

		credits = c1.getNumberOfCredits();

		if (code.equals("COMP150") && desc.equals("Object-Oriented Programming") && credits == 3) {

			System.out.println(":)");

		} else {

			System.out.println(":(");

		}

		System.out.println("Do your setters work?");

		code = "COMP490";

		desc = "Advanced Software Engineering";

		credits = 4;

		c2.setCode(code);

		c2.setDescription(desc);

		c2.setNumberOfCredits(credits);

		if (code.equals("COMP490") && desc.equals("Advanced Software Engineering") && credits == 4) {

			System.out.println(":)");

		} else {

			System.out.println(":(");

		}

		System.out.println("c1 is: " + c1);

		System.out.println("c2 is: " + c2);

		System.out.println("Are you printing the correct String?");

		if (c1.toString().equals("Course " + c1.getCode() + " is " + c1.getDescription() + " and is worth "
				+ c1.getNumberOfCredits() + " credits.")) {

			System.out.println(":)");

		} else {

			System.out.println(":(");

		}

		System.out.println("Does c1 equal c2?");

		if (c1.equals(c2)) {

			System.out.println(":(");

		} else {

			System.out.println(":)");

		}

		System.out.println("Are you checking for object types?");

		String s1 = "nope";

		if (c1.equals(s1)) {

			System.out.println(":(");

		} else {

			System.out.println(":)");

		}

	}

}
