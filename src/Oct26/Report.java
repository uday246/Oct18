package Oct26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Report {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("rawData.txt"));
		PrintWriter pw = new PrintWriter((new FileWriter("Report.txt")));
		pw.println("Student Name\t\tNumber of credits\t\t Student Average");
		pw.println("************\t\t*****************\t\t ***************");

		String line = br.readLine();
		while (line != null) {
			String temp[] = line.split(" ");
			String name = temp[0] + " " + temp[1];
			double sum = 0, avg;
			int count = 0;
			for (int i = 2; i < temp.length; i++) {
				sum = sum + Integer.parseInt(temp[i]);
				count++;
			}
			avg = sum / count;
			while(name.length()<15)
				name+=" ";
			pw.println(name + "\t\t\t\t" + (count * 3) + "\t\t\t\t" + avg);
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}
}
