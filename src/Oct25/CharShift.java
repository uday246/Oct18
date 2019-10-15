package Oct25;

public class CharShift {
	public static void main(String[] args) {
		System.out.println(shift('B'));
		System.out.println(shift('C'));
		System.out.println(shift('H'));
		System.out.println(shift('Z'));
		
	}

	private static char shift(char c) {
		// checking if it is capital letter
		if (c >= 'A' && c <= 'Z') {
			// adding 1 to shift it right
			c = (char) (c + 1);
			// if it goes after Z than make it A
			if (c > 'Z')
				c = 'A';
		}
		return c;
	}

}