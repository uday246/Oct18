import java.util.Scanner;

public class Delivery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double weight = 0.0;
		double rate = 0.0;
		boolean valid=true;
		while(valid){
			System.out.println("Enter E for express and S for standard Q for quit");
			String ch = sc.next();
			if (ch.equalsIgnoreCase("Q"))
				break;
		System.out.println("Enter weight (lbs) : ");
		weight = sc.nextDouble();
		
		// finding charges for Standard delivery
		if (ch.equalsIgnoreCase("S")) {
			if (weight <= 4)
				rate = 1.05;
			if (weight > 4 && weight <= 8)
				rate = 0.95;
			if (weight > 8 && weight <= 15)
				rate = 0.85;
			if (weight > 15)
				rate = 0.80;
		}
		// finding charges for Express delivery
		else if (ch.equalsIgnoreCase("E")) {
			if (weight <= 2)
				rate = 3.25;
			if (weight > 2 && weight <= 5)
				rate = 2.95;
			if (weight > 5 && weight <= 10)
				rate = 2.75;
			if (weight > 10)
				rate = 2.55;
		}
		else{
			valid=false;
			break;
		}
		System.out.println("Shipping Charges : " + (rate * weight));
		
		
		}
		sc.close();
	}
}
