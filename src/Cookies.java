import java.util.Scanner;

public class Cookies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coockies");
		int num = sc.nextInt();
		// finds the number of boxes
		int boxes = num/24;
		// finds number of coockies left
		int coockesLeft = num%24;
		// finds the container
		int containers = boxes/75;
		// finds the number of boxes left
		int boxLeft = boxes%75;
		
		if(containers>0){
			System.out.println(containers+" container with 75 boxes of 24 cookies shipped");
		}
		if(boxLeft>0){
			System.out.println(boxLeft+" boxes of 24 cookies discarded");
		}
		if(coockesLeft>0){
		System.out.println(coockesLeft+" Discarded");	
		}
		sc.close();
	}
}
