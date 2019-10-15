package gui;

public class Configuration {
	private int score;
	private String config;

	public Configuration(int aScore, String aConfig) {
		super();
		score = aScore;
		config = aConfig;
	}

	public int getScore() {
		return score;
	}

	public String getStringConfiguration() {
		return config;
	}
}
