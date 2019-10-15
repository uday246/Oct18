package Oct26;

import java.util.Scanner;

class StringF {
	String name;

	public String getName() {
		return name;
	}

	public String getFormattedName() {
		String temp[] = name.split(",");
		return temp[1] + ',' + temp[0];
	}
}

public class StringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringF str = new StringF();
		String name = "";
		while (!name.equals("999")) {
			System.out.println("Enter name : ");
			name = sc.nextLine();
			if(name.equals("999"))
				break;
			if (!name.contains(",")) {
				System.out.println(", missing in name");

			} else {
				str.name = name;
				System.out.println("Original : " + str.getName());
				System.out.println("Formatted name : " + str.getFormattedName());

			}
		}
	}

}
