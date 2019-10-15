package Oct14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class WorldSeries {
	private String winners[] = new String[115];

	WorldSeries() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("WorldSeriesWinners.txt"));
			int count = 0;
			String line = br.readLine();
			while (line != null) {
				winners[count++] = line.trim();
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayWinners() {
		for (String str : winners) {
			System.out.println(str);
		}
	}

	public void displayWinnersByYear() {
		int year = 1903;
		System.out.println("Year\tWinner");
		for (int i=114;i>=0;i--) {
			System.out.println(year + "\t" + winners[i]);
			year++;
		}
	}

	public void findWinner(String s) {
		int count = 0;
		for (String str : winners) {
			if (s.equalsIgnoreCase(str))
				count++;
		}
		if (count == 0)
			System.out.println("Sorry the " + s + " did't won world series");
		else
			System.out.println("The " + s + "  won world series " + count + " times");

	}

	public void findYears(String s) {
		int count = 0;
		int year = 2017;
		for (String str : winners) {
			if (s.equalsIgnoreCase(str)) {
				System.out.println(year);
				count++;
			}
			year--;
		}
		if (count == 0)
			System.out.println("Sorry the " + s + " did't won world series");
	}

	public void winner(int year) {
		int index = 2017 - year;
		System.out.println("Winner of " + year + " is : " + winners[index]);
	}

}

public class TestWorldSeries {
	public static void main(String[] args) {
		WorldSeries w = new WorldSeries();
		boolean flag=true;
		int ch=0;
		Scanner sc = new Scanner(System.in);
		String name="";
		while(flag){
			System.out.println("1 - show all winners-descending years");
			System.out.println("2 - show all winners-ascending years");
			System.out.println("3 - show how many times a particulat team has won");
			System.out.println("4 - show the years that particulat team has won");
			System.out.println("5 - show the winner for particular year");
			System.out.println("6 - Exit");
			ch = sc.nextInt();
			
			sc.nextLine();
			switch(ch){
			case 1: w.displayWinners();break;
			case 2: w.displayWinnersByYear();break;
			case 3: System.out.println("Enter a team name");
				name = sc.nextLine();
				w.findWinner(name);
				break;	
			case 4: System.out.println("Enter a team name");
				name = sc.nextLine();
				w.findYears(name);
				break;
			case 5: System.out.println("Enter year");
			int y  = sc.nextInt();
			w.winner(y);
			break;
			case 6:flag=false;break;
			}
			
		}
		
		
	}
}
