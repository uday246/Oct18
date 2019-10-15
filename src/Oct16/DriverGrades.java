package Oct16;

import java.util.Scanner;

public class DriverGrades {
	public static void main(String[] args) {
		String names[] = new String[5];
		String grades[] = new String[5];
		double std1[] = new double[4];
		double std2[] = new double[4];
		double std3[] = new double[4];
		double std4[] = new double[4];
		double std5[] = new double[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student1 name");
		names[0] = sc.nextLine();
		System.out.println("Enter 4 scores");
		readGrades(std1, sc);
		sc.nextLine();
		System.out.println("Enter Student2 name");
		names[1] = sc.nextLine();
		System.out.println("Enter 4 scores");
		readGrades(std2, sc);
		sc.nextLine();
		System.out.println("Enter Student3 name");
		names[2] = sc.nextLine();
		System.out.println("Enter 4 scores");
		readGrades(std3, sc);
		sc.nextLine();
		System.out.println("Enter Student4 name");
		names[3] = sc.nextLine();
		System.out.println("Enter 4 scores");
		readGrades(std4, sc);
		sc.nextLine();
		System.out.println("Enter Student5 name");
		names[4] = sc.nextLine();
		System.out.println("Enter 4 scores");
		readGrades(std5, sc);

		grades[0] = getGrades(std1);
		System.out.println("Names : " + names[0] + " Grade : " + grades[0] + " Average : "
				+ getAvg(std1));
		grades[1] = getGrades(std2);
		System.out.println("Names : " + names[1] + " Grade : " + grades[1] + " Average : "
				+getAvg(std2));

		grades[2] = getGrades(std3);
		System.out.println("Names : " + names[2] + " Grade : " + grades[2] + " Average : "
				+ getAvg(std3));

		grades[3] = getGrades(std4);
		System.out.println("Names : " + names[3] + " Grade : " + grades[3] + " Average : "
				+ getAvg(std4));

		grades[4] = getGrades(std5);
		System.out.println("Names : " + names[4] + " Grade : " + grades[4] + " Average : "
				+ (getAvg(std5)));

	}

	private static String getGrades(double[] aStd1) {
		double avg=getAvg(aStd1);
		if (avg >= 90)
			return "A";
		if (avg >= 80)
			return "B";
		if (avg >= 70)
			return "C";
		if (avg >= 60)
			return "D";
		return "F";

	}

	private static double getAvg(double[] aStd1) {
		double avg = 0;
		double min=100;
		// code to drop to lowest scores
		for (int i = 0; i < 4; i++){
			avg += aStd1[i];
			if(min>aStd1[i])
				min=aStd1[i];
		}
		
		avg=avg-min;
		avg = avg / 3;
		return avg;
	}

	private static void readGrades(double[] aStd1, Scanner aSc) {
		for (int i = 0; i < 4;){
			aStd1[i] = aSc.nextDouble();
			if(aStd1[i]>=0 && aStd1[i]<=100)
				i++;
		}
	}
}
