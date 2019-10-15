package Oct26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Player

{ private String Name;

private int Score;

private int Shirt;

   public Player() {

   Name = "";

   Score = 0;

Shirt = 0; }

   public Player(String newName, int newScore, int newShirt) {

   this.Name=newName;

this.Score=newScore;

this.Shirt=newShirt; }

   public Player(Player P) {

   this.Name=P.Name;

   this. Score=P.Score;

this.Shirt=P.Shirt; }

   public void setName(String name) {

   Name=name; }

   public String getName() {

return Name; }

public void setScore(int scr) {

Score=scr; }

   public int getScore() {

return Score;}

public void setShirt(int shrt) {

Shirt=shrt; }

public int getShirt(){

return Shirt; }

@Override

   public String toString() {

   return "Name=" + Name + ", Score=" + Score + ", Shirt=" + Shirt; }}

class PlayerDatabase

{
	private Player[] players;

	private int numPlayers;

	int index = 0;

	private int num;

	public PlayerDatabase(int numPlayers)

	{

		this.numPlayers = num;

		players = new Player[numPlayers];

	}

	public void AddPlayer() {

		Scanner input = new Scanner(System.in);

		if (numPlayers < 10) // upto 10 objcts

		{
			players[numPlayers] = new Player();

			System.out.println("Enter the player name:");

			players[numPlayers].setName(input.next());

			System.out.println("Enter the player Score:");

			players[numPlayers].setScore(input.nextInt());

			System.out.println("Enter the player Shirt:");

			players[numPlayers].setShirt(input.nextInt());

			numPlayers++;
		}

		else {
			System.out.println(" Error");

		}
	}

	public void AddPlayer(String PlayersFile)

	{
		String line;

		try

		{
			FileReader fileReader = new FileReader(PlayersFile);

			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

				while ((line = bufferedReader.readLine()) != null) {

					players[numPlayers] = new Player();

					String temp[] = line.split(" ");

					players[numPlayers].setName(temp[0]);
					if(temp[2].trim().length()>0)
					players[numPlayers].setShirt(Integer.parseInt(temp[2]));
					if(temp[1].trim().length()>0)
					players[numPlayers].setScore(Integer.parseInt(temp[1]));
					numPlayers++;

				}
			}
		}

		catch (IOException e) // if not found/error

		{
			System.out.println("Error; cant read file'" + PlayersFile + "'");
		}
	}

	public void DisplayPlayers(Player[] players)

	{
		for (int i = 0; i < players.length - 1; i++)

		{
			System.out.println(players[i].getName() + " " + players[i].getScore() + " " + players[i].getShirt());
		}
	}

	public void SearchPlayersByName(String playerName)

	{
		int index = 0;

		for (int i = 0; i < numPlayers; i++)

		{
			if (playerName.equals(players[i].getName()))

			{
				index = i;

				break;
			}
		}

		System.out
				.println(players[index].getName() + " " + players[index].getScore() + " " + players[index].getShirt());

	}

	public void SearchPlayersByshirt(int playerShirtNumber)

	{
		int index = 0;

		for (int i = 0; i < numPlayers; i++) {

			if (playerShirtNumber == players[i].getShirt())

			{
				index = i;

				break;
			}
		}

		System.out
				.println(players[index].getName() + " " + players[index].getScore() + " " + players[index].getShirt());
	}

	public void SearchPlayersByScore(int playerScore)

	{
		for (int i = 0; i < numPlayers; i++) {

			if (playerScore == players[i].getScore())

			{
				System.out.println(players[i].getName() + " " + players[i].getScore() + " " + players[i].getShirt());
			}
		}
	}

	public void RemovePlayerByName(String name)

	{
		int index = 0;

		for (int i = 0; i < numPlayers; i++)

		{
			if (name.equals(players[i].getName()))

			{
				index = i;

				break;
			}
		}

		for (int j = index; j < numPlayers - 1; j++)

		{
			players[j] = players[j + 1];
		}

		numPlayers--;
	}

public void DisplayPlayers()

   {System.out.println("***Players-Data base***");

for(int i=0;i<numPlayers;i++){

System.out.println(players[i].getName()+" "+players[i].getScore()+" "+players[i].getShirt()); }}
}


public class PlayerDatabaseDemo

{
	public static void main(String[] args)

	{
		Scanner input = new Scanner(System.in);

		String tempName;

		Player p1 = new Player("Sam", 20, 1);

		Player p2 = new Player(p1);

		p1.setName("John");

		System.out.println(p1.getName().equals(p2.getName()));

		PlayerDatabase Sim = new PlayerDatabase(10);

		Sim.AddPlayer("players.txt");

		Sim.DisplayPlayers();

		while (true) {

			System.out.println(
					"**Menu**\n1.Add aplayer\n2.SearchPlayersByName\n3.SearchPlayersByshirt\n4.SearchPlayersByScore\n5.RemovePlayerByName\n6.DisplayPlayers\n7.Exit\nEnter your choice:");

			switch (input.nextInt()) {

			case 1:
				Sim.AddPlayer();
				break;

			case 2:
				System.out.println("Enter the player Name:");

				tempName = input.next();

				Sim.SearchPlayersByName(tempName);
				break;

			case 3:
				System.out.println("Enter the player shirt number:");

				int tempShirt = input.nextInt();

				Sim.SearchPlayersByshirt(tempShirt);
				break;

			case 4:
				System.out.println("Enter the player score to search:");

				int tempScore = input.nextInt();

				Sim.SearchPlayersByScore(tempScore);
				break;

			case 5:
				System.out.println("Enter the player Name:");

				tempName = input.next();

				Sim.RemovePlayerByName(tempName);
				break;

			case 6:
				Sim.DisplayPlayers();
				break;

			case 7:
				System.exit(0); // close

			default:
				System.out.println("Enter correct choice");
				break;
			}

			Sim.DisplayPlayers();

		}
	}
}
