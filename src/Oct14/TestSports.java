package Oct14;

import java.util.Arrays;
import java.util.List;

class Sport {
	private int numPlayerInTeam;
	private int numCountriesPlay;
	private String nameOfSport;
	private List leagues;
	private int numOfMatchesPlayed;

	public Sport(int players, int numCountry, String name, List leagues, int matches) {
		this.leagues = leagues;
		this.nameOfSport = name;
		this.numCountriesPlay = numCountry;
		this.numPlayerInTeam = players;
		this.numOfMatchesPlayed = matches;
	}

	public int getNumPlayerInTeam() {
		return numPlayerInTeam;
	}

	public void setNumPlayerInTeam(int numPlayerInTeam) {
		this.numPlayerInTeam = numPlayerInTeam;
	}

	public int getNumCountriesPlay() {
		return numCountriesPlay;
	}

	public void setNumCountriesPlay(int numCountriesPlay) {
		this.numCountriesPlay = numCountriesPlay;
	}

	public String getNameOfSport() {
		return nameOfSport;
	}

	public void setNameOfSport(String nameOfSport) {
		this.nameOfSport = nameOfSport;
	}

	public List getLeagues() {
		return leagues;
	}

	public void setLeagues(List leagues) {
		this.leagues = leagues;
	}

	public int getNumOfMatchesPlayed() {
		return numOfMatchesPlayed;
	}

	public void setNumOfMatchesPlayed(int numOfMatchesPlayed) {
		this.numOfMatchesPlayed = numOfMatchesPlayed;
	}
}

class BaseBall extends Sport {
	private int size = 33;

	public BaseBall(int players, int numCountry, List leagues, int matches) {
		super(players, numCountry, "BaseBall", leagues, matches);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return getNameOfSport() + ":- Bat size=" + size + ", Num of Players In Team=" + getNumPlayerInTeam()
				+ ", Num of Countries Play=" + getNumCountriesPlay() + ", Leagues=" + getLeagues()
				+ ", Num Of Matches Played=" + getNumOfMatchesPlayed();
	}
}

class Cricket extends Sport {
	private int pitchSize = 22;

	public Cricket(int players, int numCountry, List leagues, int matches) {
		super(players, numCountry, "Cricket", leagues, matches);
	}

	public int getPitchSize() {
		return pitchSize;
	}

	public void setPitchSize(int pitchSize) {
		this.pitchSize = pitchSize;
	}

	@Override
	public String toString() {
		return getNameOfSport() + ":- Pitch size=" + getPitchSize() + ", Num of Players In Team=" + getNumPlayerInTeam()
				+ ", Num of Countries Play=" + getNumCountriesPlay() + ", Leagues=" + getLeagues()
				+ ", Num Of Matches Played=" + getNumOfMatchesPlayed();
	}}

	public class TestSports {
		public static void main(String[] args) {
			List leaguesBaseball = Arrays.asList("NPB", "MLB", "IBL", "ABL");
			List leaguesCricket = Arrays.asList("USA", "IND", "ENG", "WI", "BAN", "NZ", "AUS");
			Sport s1 = new BaseBall(9, 75, leaguesBaseball, 1865);
			Sport s2 = new Cricket(11, 20, leaguesCricket, 1124);
			System.out.println("Details of game:");
			System.out.println(s1.toString());
			System.out.println("Details of game:");
			System.out.println(s2.toString());
		}
}
