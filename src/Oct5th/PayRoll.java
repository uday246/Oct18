package Oct5th;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class PayRoll {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter("Payroll.txt"));
		Random r = new Random();
		double as = 0, ac = 0, f = 0;
		double asSal = 0, acSal = 0, fSal = 0;
		for (int i = 1; i <= 20; i++) {
			// random number to decide the rank
			int t = r.nextInt(3);
			String pos = "";
			int sal = 0;
			if (t == 0) {
				pos = "Assistant";
				// random salary generation
				sal = r.nextInt((70000 - 50000) + 1) + 50000;
				as++;
				asSal += sal;

			}
			if (t == 1) {
				pos = "Associate";
				// random salary generation
				sal = r.nextInt((110000 - 60000) + 1) + 60000;
				ac++;
				acSal += sal;
			}
			if (t == 2) {
				// random salary generation
				pos = "Full";
				sal = r.nextInt((130000 - 75000) + 1) + 75000;
				f++;
				fSal += sal;

			}
			// forming string 
			String temp = "FirstName" + i + " LastName" + i + " " + pos + " " + sal;
			pw.println(temp);
		}
		pw.flush();
		pw.close();
		System.out.println("Total salary for assistant professors " + asSal);
		System.out.println("Average salary for assistant professors " + asSal / as);

		System.out.println("Total salary for associate professors " + acSal);
		System.out.println("Average salary for associate professors " + acSal / ac);

		System.out.println("Total salary for fulltime professors " + fSal);
		System.out.println("Average salary for fulltime professors " + fSal / f);

	}
}
