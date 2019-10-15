package Oct5th;

import java.util.Random;

public class RandomSentence {

	public static void main(String[] args) {

		String noun[] = { "boy", "girl", "dog", "town", "car" };
		String verb[] = { "drove", "jumped", "ran", "walked", "skipped" };
		String article[] = { "the", "a", "one", "some", "any" };
		String preposition[] = { "to", "from", "over", "under", "on" };
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			// generating random number in range 0 to 5
			int index = r.nextInt(5);
			int index2 = r.nextInt(5);
			// appending to sentense
			String temp = article[index] + " " + noun[index] + " " + verb[index] + " " + preposition[index] + " "
					+ article[index2] + " " + noun[index2] + ".";
			// making firt letter as capital
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
			System.out.println(temp);
		}
	}

}
