package oct3rd;

public class RunLength {
	public static void main(String[] args) {
		System.out.println(expand("a3b7a2c4"));
	}

	private static String expand(String str) {

		String res = "";
		int count = 0;
		// looping through the String
		for (int i = 0; i < str.length() - 1; i += 2) {
			// picking the count for char from the string
			count = Integer.parseInt(str.charAt(i + 1) + "");
			int j = 0;
			// looping to append the char as per the count
			while (j < count) {
				res = res + str.charAt(i);
				j++;
			}
		}
		return res;
	}
}
