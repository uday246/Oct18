package Oct5th;

class StringManipulation {
	// variable to store the string
	String str;
// constructor to assign the values
	public StringManipulation(String aStr) {
		//asigning value
		str = aStr;
	}
// function remove the _ from the string
	public String getModifiedString() {
		// making first letter as upper case
		String res = Character.toUpperCase(str.charAt(0)) + "";
		// iterating thorugh the string
		for (int i = 1; i < str.length(); i++) {

			// if _ found dont add to the string and make next letter as
			// uppercase
			if (str.charAt(i) == '_') {
				// if _ found convert next letter as uppercase i+1
				res = res + Character.toUpperCase(str.charAt(i + 1));
				i++;// increase i++
			} else {
				// appending char to res
				res = res + str.charAt(i);
			}
		}
		// storing res in str
		str = res;
		// returning res
		return res;
	}
}

public class MyMain_String {
	public static void main(String[] args) {
		// creating obj1 with count
		StringManipulation m1 = new StringManipulation("count");
		// calling getModifiedString to get res
		System.out.println(m1.getModifiedString());
		// creating obj1 with number_of_students

		StringManipulation m2 = new StringManipulation("number_of_students");
		// calling getModifiedString to get res
		System.out.println(m2.getModifiedString());
		// max_grade_in_class

		StringManipulation m3 = new StringManipulation("max_grade_in_class");
		// calling getModifiedString to get res
		System.out.println(m3.getModifiedString());
	}
}
