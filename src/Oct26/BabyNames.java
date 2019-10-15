package Oct26;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BabyNames

{


	public static void main(String[] args)

	{

		try (Scanner in = new Scanner(new File("babynames.txt"));

				PrintWriter boyOut = new PrintWriter("boynames.txt");

				PrintWriter girlOut = new PrintWriter("girlnames.txt"))

		{

			// Process the data
			while (in.hasNextLine()) {
				String str = in.nextLine();
				String arr[] = str.split(" ");
				if (arr[0].equalsIgnoreCase("boy")) {
					boyOut.println(arr[1].trim());
				} else {
					girlOut.println(arr[1].trim());
				}
			}

		}

		catch (IOException e)

		{

			e.printStackTrace();

		}

	}

}