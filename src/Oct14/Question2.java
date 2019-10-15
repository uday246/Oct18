package Oct14;

import java.util.ArrayList;

class Track {
	private String title;
	private int duration;

	public Track(String aTitle, int aDuration) {
		super();
		title = aTitle;
		duration = aDuration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String aTitle) {
		title = aTitle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int aDuration) {
		duration = aDuration;
	}

}

public class Question2 {
	public static void main(String[] args) {
		Track track1 = new Track("Main Title", 134);
		Track track2 = new Track("Imperial Attack", 403);
		Track track3 = new Track("The Dune Sea", 302);
		ArrayList<Track> list = new ArrayList<Track>();
		list.add(track1);
		list.add(track2);
		list.add(track3);

		Track t = Question2.LongestTrack(list);
		System.out.println(t.getTitle());

	}

	public static Track LongestTrack(ArrayList<Track> list) {
		int max = -1;
		Track res = null;
		for (Track t : list) {
			if (t.getDuration() > max) {
				max = t.getDuration();
				res = t;
			}
		}
		return res;
	}
}
