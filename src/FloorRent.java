import java.util.Scanner;

public class FloorRent {
	public static void main(String[] args) {
		int arr[][] = { { 400, 450, 510 }, { 500, 560, 630 }, { 625, 676, 740 }, { 1000, 1250, 1600 }
		};
		Scanner sc = new Scanner(System.in);
		int floor,beds;
		//reading floor and beds
		System.out.println("Enter a floor number: ");
		floor=sc.nextInt();
		System.out.println("Enter number of bedrooms: ");
		beds=sc.nextInt();
		//printing the price from 2D matrix
		if(floor>3 ){
			System.err.println("we have ground (0), 1st, 2nd, and 3rd floors");
			return;
		}
		if(beds>2){
			System.err.println("Sorry, we have only studio (O), 1, and 2 bedroom units");
			return;
		}
		
		System.out.println("The rent for a "+beds+" bedroom apartment on floor "+floor+" is : $"+arr[floor][beds]);
	}
}
