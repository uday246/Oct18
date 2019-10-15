import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BabyNames

{

	// In this method, you do not need to ask user the filename through
	// arguments of the main method or console.

	// Place the input files in appropriate locations.

	public static void main(String[] args)

	{

		try (Scanner in = new Scanner(new File("babynames.txt"));

				PrintWriter boyOut = new PrintWriter("boynames.txt");

				PrintWriter girlOut = new PrintWriter("girlnames.txt"))

		{
				while(in.hasNextLine()){
					System.out.println(in.next());
					System.out.println(in.next());
					System.out.println(in.next());
					System.out.println(in.next());
					System.out.println(in.next());
					System.out.println(in.next());
					System.out.println(in.next());
					
				}
				
			// Process the data

		}

		catch (IOException e)

		{

			e.printStackTrace();

		}

	}

}