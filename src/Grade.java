import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// loop until user enter negative numbers
		while(true){
		System.out.println("Enter scores for exam1 and exam2 ");
		double  e1= sc.nextDouble();
		double  e2= sc.nextDouble();
		// validating the scores
		if(e1<0 || e2<0){
			System.out.println("PROGRAM ENDS DUE TO NEGATIVE NUMBER ENTERED");
			break;
		}
		// finding avg of 2 scores
		double avg = (e1+e2)/2;
		char g = ' ';
		// checking for pass or fail
		if (avg >= 60)
			g = 'P';
		else
			g = 'F';
		System.out.println("The average of "+e1+" and "+e2+" is "+avg+" the letter grade is " + g);
		}
		sc.close();
	}
}
