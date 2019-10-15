package oct3rd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileProcessing {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		String line = br.readLine(); // reads first line
		// loop to read until end of file
		while (line != null) {
			// we will get each line here, so each line separeated in , so splitting with ,
			fileOperations(line,pw);
			//reading next line from the file
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}

	private static void fileOperations(String line,PrintWriter pw ) {
		String arr[] = line.split(",");
		// now in arr we have values like Product_ID, Salesman_Name, Gender, Price of each Unit, Number of Units sold.
		// convert string to integer, trim() if there any spaces around
		int price = Integer.parseInt(arr[3].trim());
		int units = Integer.parseInt(arr[4].trim());
		// find the total
		int total = price * units;
		// add all the details to string and total also
		String temp = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + total;
		// writing into the output.txt
		pw.println(temp);
	}

}
