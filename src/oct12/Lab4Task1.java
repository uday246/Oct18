package oct12;

import java.util.Scanner;

public class Lab4Task1 {
	public static char[] CHOICES = { 'R', 'P', 'S' };

	public static void main(String[] args) {
		
		int [][][]arr={{{1,2},{3,4}},{{5,6},{7,8}}};
		System.out.println(arr[0][0][0]);
		System.out.println(arr[1][1][1]);
		
		Scanner sc = new Scanner(System.in);
		char ch = 0;
		while (ch != 'N') {
			char computerChoice = getComputerChoice();
			char uch = getPlayerChoice();
			System.out.println("Computer Choice : "+computerChoice);

			displayWinner(computerChoice, uch);
			System.out.println("Do you want to continue press Y/N");
			ch = sc.next().charAt(0);
		}
		sc.close();
	}

	private static void displayWinner(char c, char user) {
		// checking winner based on user and computer choice
		if (c == 'R' && user == 'S') {
			System.out.println("Computer wons");
		} else if (c == 'S' && user == 'R') {
			System.out.println("User wons");
		} else if (c == 'P' && user == 'R') {
			System.out.println("Computer wons");
		} else if (c == 'R' && user == 'P') {
			System.out.println("User wons");
		} else
			System.out.println("game is tie");
	}

	private static char getPlayerChoice() {
		// asking the for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user chouce R rock p papaer S scissors");
		return sc.next().toUpperCase().charAt(0);
	}

	private static char getComputerChoice() {
		int randomSelection = (int) Math.floor(Math.random() * CHOICES.length);
		return CHOICES[randomSelection];
	}
}
