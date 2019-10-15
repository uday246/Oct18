package oct12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FitnessClub {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("memberships.txt")));
		PrintWriter pw1 = new PrintWriter(new FileWriter("gym.txt"));
		PrintWriter pw2 = new PrintWriter(new FileWriter("circuit.txt"));
		String line = br.readLine();
		double gCount = 0, gSum = 0, cCount = 0, cSum = 0;
		// readind data
		while (line != null) {
			String arr[] = line.split(" ");
			// if it is gym write into gym
			if (arr[3].equalsIgnoreCase("gym")) {
				gCount++;
				gSum += Double.parseDouble(arr[5]);
				pw1.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[5]);
			} else // write into circuit file
				{
				cCount++;
				cSum += Double.parseDouble(arr[5]);
				pw2.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[5]);

			}
			line=br.readLine();
		}
		pw1.close();
		pw2.close();
		br.close();
		System.out.println("Total memberships in Gym : " + gCount);
		System.out.println("Average gym membership fee : " + (gSum / gCount));

		System.out.println("Total memberships in circuit : " + cCount);
		System.out.println("Average circuit membership fee : " + (cSum / cCount));

	}
}
