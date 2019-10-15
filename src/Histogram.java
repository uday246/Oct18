import java.util.Scanner;

public class Histogram {

	/*
	 * Class Required Variable Declarations should go here.
	 *
	 */

	public static final int MAX_NUMBERS = 20;

	/*
	 * We have already completed getHeaderAsString() for you. You will also
	 * notice that this method is called from the main function.
	 *
	 * Should you alter this method in any way for debugging purposes, make sure
	 * to remove added code before submitting the program.
	 * 
	 * You cannot change the signature of this method.
	 */
	public static String getHeaderAsString() {

		// Create an instance of the StringBuilder class
		// which allows us to create an object of
		// a series of strings that can then be converted
		// into one large string via the toString method.
		//
		StringBuilder sb = new StringBuilder();

		sb.append("Welcome to the Histogram Program!");
		sb.append(System.getProperty("line.separator"));
		sb.append("This program will print out a histogram of the numbers");
		sb.append(System.getProperty("line.separator"));
		sb.append("input by the user; enter exactly " + MAX_NUMBERS + " doubles");
		sb.append(System.getProperty("line.separator"));

		return sb.toString();
	}

	/*
	 * TODO: You must complete the method getHistogramAsString This method must
	 * return back a String that represents the histogram. The String that is
	 * returned back from this method must EXACTLY match to what is provided in
	 * the handout. We have provided you with few examples in the handout.
	 * 
	 * You cannot use any System.out.println(..) inside this method. You may use
	 * them temporarily for debugging purposes, but make sure to remove these
	 * before submitting the code to us.
	 * 
	 * You cannot change the function signature of this function.
	 */
	public static String getHistogramAsString(int[] histogram) {

		return null; // temporary return statement for compilation purposes
	}

	/*
	 * TODO: Complete this method so that you can check whether a number is in
	 * the specified range of LOWER_BOUND and UPPER_BOUND
	 * 
	 * You cannot use any System.out.println(..) inside this method. You may use
	 * them temporarily for debugging purposes, but make sure to remove these
	 * before submitting the code to us.
	 * 
	 * You cannot change the function signature of this function.
	 */
	public static boolean validInput(double n) {

		return false; // temporary return statement for compilaton purposes only
	}

	/*
	 * TODO: Complete this method so that it returns back an array of integers
	 * which represents the histogram of integers stored in the array passed to
	 * this method..
	 * 
	 * Assuming BIN_SIZE is 10 and NUM_BINS is 10, You can now think of the
	 * histogram as follows: index 0 contains the value of numbers that are
	 * between 0 (including) and 10 (including) index 1 contains the value of
	 * numbers that are between 10 (not including) and 20 (including) index 2
	 * contains the value of numbers that are between 20 (not including) and 30
	 * (including) index 3 contains the value of numbers that are between 30
	 * (not including) and 40 (including) index 4 contains the value of numbers
	 * that are between 40 (not including) and 50 (including) index 5 contains
	 * the value of numbers that are between 50 (not including) and 60
	 * (including) index 6 contains the value of numbers that are between 60
	 * (not including) and 70 (including) index 7 contains the value of numbers
	 * that are between 70 (not including) and 80 (including) index 8 contains
	 * the value of numbers that are between 80 (not including) and 90
	 * (including) index 9 contains the value of numbers that are between 90
	 * (not including) and 100 (including)
	 * 
	 * You cannot use any System.out.println(..) inside this method. You may use
	 * them temporarily for debugging purposes, but make sure to remove these
	 * before submitting the code to us.
	 * 
	 * You cannot change the function signature of this function.
	 */

	private static int[] calculateHistogram(double[] numbers) {

		return null; // temporary return statement for compilaiton purposes
	}

	/*
	 * As stated in the specification you will not be graded on the content of
	 * your main method.
	 * 
	 * We strongly encourage you to follow the guidelines stated in the
	 * specification to ensure that you properly test all methods of your
	 * program. Howver this method is for you to write as you prefer.
	 *
	 */
	public static void main(String[] args) {
		/*
		 * 
		 */

		// Begin with a welcome message
		System.out.println(getHeaderAsString());
		StringBuffer sb[] = new StringBuffer[10];
		// setting the header labels
		sb[0] = new StringBuffer("[0..10]:  ");
		sb[1] = new StringBuffer("[10..20]:  ");
		sb[2] = new StringBuffer("[20..30]:  ");
		sb[3] = new StringBuffer("[30..40]:  ");
		sb[4] = new StringBuffer("[40..50]:  ");
		sb[5] = new StringBuffer("[50..60]:  ");
		sb[6] = new StringBuffer("[60..70]:  ");
		sb[7] = new StringBuffer("[70..80]:  ");
		sb[8] = new StringBuffer("[80..90]:  ");
		sb[9] = new StringBuffer("[90..100]:  ");

		Scanner sc = new Scanner(System.in);
		double temp = 0;

		for (int i = 0; i < 20; i++) {
			// reading from the user
			temp = sc.nextDouble();
			// finding index of the bucket
			int index = (int) (temp / 10);
			// appending * for the bucket
			sb[index].append("*");
		}
		// printing the histogram
		for (int i = 0; i < sb.length; i++)
			System.out.println(sb[i]);
		// Complete your program

	}
}