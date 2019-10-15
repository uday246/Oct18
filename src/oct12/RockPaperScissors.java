package oct12;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public final static String ONE = "rock";
	public final static String TWO = "paper";
	public final static String THREE = "scissors";
	static int comCount=0;
	static int userCount=0;
	
	public static void main(String[] args) {
		int ch = 1;
		Scanner sc = new Scanner(System.in);
		while (ch!=-1) {
			int cch = getSystemChoice();
			int uch = getPlayerChoice();
			System.out.print("Computer Choice : ");
			if(cch==1)
				System.out.println(ONE);
			if(cch==2)
				System.out.println(TWO);
			if(cch==3)
				System.out.println(THREE);
			
			displayWinner(cch, uch);
			System.out.println("Do you want to continue press 1");
			ch = sc.nextInt();
		}
		System.out.println("Computer Wons : "+comCount);
		System.out.println("User Wons : "+userCount);
		
		sc.close();
	}

	
	private static int getSystemChoice() {
		// generating the random from 1 to 3 for computer choice
		int n = new Random().nextInt(3) + 1;
		return n;

	}
	private static int getPlayerChoice() {
		// asking the for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user chouce 1 rock 2 papaer 3 scissors");
		return sc.nextInt();
	}

	private static void displayWinner(int c, int user) {
		// checking winner based on user and computer choice
		if (c == 1 && user == 3){
			System.out.println("Computer wons");
			comCount++;
		}
		else if (c == 3 && user == 1){
			System.out.println("User wons");
			userCount++;
		}
		else if (c == 2 && user == 1){
			System.out.println("Computer wons");
			comCount++;
		}
		else if (c == 1 && user == 2){
			System.out.println("User wons");
			userCount++;
		}
		else
			System.out.println("game is tie");
	}
}
