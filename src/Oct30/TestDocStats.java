package Oct30;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

class DocStats {
	private int numberOfChars;
	private int numberOfWords;
	private int numberOfLines;
	private String documentName;

	public DocStats(String aDocumentName) {
		super();
		documentName = aDocumentName;
		try {
			processDoc(aDocumentName);
		} catch (Exception e) {
		}
	}

	private void processDoc(String aDocumentName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(aDocumentName));
		String line = br.readLine();
		while (line != null) {
			numberOfLines++;
			numberOfChars += line.length();
			numberOfWords += line.split(" ").length;
			line = br.readLine();
		}
		br.close();

	}

	public int getNumberOfCharacters() {
		return numberOfChars;
	}

	public int getNumberOfWords() {
		return numberOfWords;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

}

public class TestDocStats {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	static PrintWriter out = new PrintWriter("seuss.txt");
	@BeforeClass
	public static void beforeTesting() throws IOException {
		totalScore = 0;
		out = new PrintWriter("seuss.txt");
		out.print("One fish\n");
		out.print("Two fish\n");
		out.print("Red fish\n");
		out.print("Blue fish\n");
		out.close();
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf("The assignment is worth a total of %d where the remainder of %d %s\n", maximumAssignmentScore,
				difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Test
	public void testGoblin() throws IOException {
			DocStats ds = new DocStats("goblin.txt");
			totalScore += 1;

			assertEquals("Number of characters is incorrect.", 1450, ds.getNumberOfCharacters());
			totalScore += 1;

			assertEquals("Number of words is incorrect.", 257, ds.getNumberOfWords());
			totalScore += 1;

			assertEquals("Number of lines is incorrect.", 49, ds.getNumberOfLines());
			totalScore += 1;
		
	}

	@Test
	public void testSeuss() throws IOException {
			DocStats ds = new DocStats("seuss.txt");
			totalScore += 1;

			assertEquals("Number of characters is incorrect.", 37, ds.getNumberOfCharacters());
			totalScore += 1;

			assertEquals("Number of words is incorrect.", 8, ds.getNumberOfWords());
			totalScore += 1;

			assertEquals("Number of lines is incorrect.", 4, ds.getNumberOfLines());
			totalScore += 1;
		
	}

}

