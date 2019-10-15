package oct255th;

import java.util.ArrayList;

/**
 * A simulated critter.
 */
class Critter {
	private int position;
	private double weight;
	private ArrayList<String> history;

	/**
	 * Constructs a critter at position 0 with blank history.
	 */
	public Critter(double theWeight) {
		position = 0;
		weight = theWeight;
		history = new ArrayList<String>();
	}

	/**
	 * Gets the history of this critter.
	 * 
	 * @return the history
	 */
	public ArrayList<String> getHistory() {
		return history;
	}

	/**
	 * Adds to the history of this critter.
	 * 
	 * @param event
	 *            the event to add to the history
	 */
	public void addHistory(String event) {
		history.add(event);
	}

	/**
	 * Gets the position of this critter.
	 * 
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Moves this critter.
	 * 
	 * @param steps
	 *            the number of steps by which to move.
	 */
	public void move(int steps) {
		position = position + steps;
		addHistory("move to " + position);
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Critter [position=" + position + ", weight=" + weight + ", history=" + history + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((history == null) ? 0 : history.hashCode());
		result = prime * result + position;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Critter other = (Critter) obj;
		if (history == null) {
			if (other.history != null)
				return false;
		} else if (!history.equals(other.history))
			return false;
		if (position != other.position)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
}

/**
 * Lethargic critter only eats and sleeps.
 *
 */
class LethargicCritter extends Critter {
	private boolean timeToEat;

	/**
	 * Constructor for objects of class LethargicCritter with the given weight
	 * and a position of 0
	 * 
	 * @param weight
	 *            weight of this critter
	 */
	public LethargicCritter(double weight) {
		super(weight);
		timeToEat = true;
	}

	@Override
	public void move(int steps) {
		if (timeToEat) {
			addHistory("eat");
		} else {
			addHistory("sleep");
		}

		timeToEat = !timeToEat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (timeToEat ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LethargicCritter other = (LethargicCritter) obj;
		if (timeToEat != other.timeToEat)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LethargicCritter [timeToEat=" + timeToEat + "] "+super.toString();
	}
}

public class CritterOverrideTester {
	public static void main(String[] args) {
		Critter critter = new Critter(25.2);
		System.out.println(critter.toString());
		System.out.println("Expected: Critter[position=0,weight=25.2,history=[]]");
		critter.move(15);
		critter.move(-20);
		System.out.println(critter.toString());
		System.out.println("Expected: Critter[position=-5,weight=25.2,history=[move to 15, move to -5]]");

		LethargicCritter lethargic = new LethargicCritter(10.1);
		System.out.println(lethargic.toString());
		System.out.println("Expected: LethargicCritter[position=0,weight=10.1,history=[]][timeToEat=true]");
		lethargic.move(2);
		lethargic.move(5);
		lethargic.move(1);
		System.out.println(lethargic.toString());
		System.out.println(
				"Expected: LethargicCritter[position=0,weight=10.1,history=[eat, sleep, eat]][timeToEat=false]");

		Critter critter2 = new Critter(25.2);
		critter2.move(15);
		System.out.println(critter.equals(critter2));
		System.out.println("Expected: false");
		critter2.move(-20);
		System.out.println(critter.equals(critter2));
		System.out.println("Expected: true");

		LethargicCritter lethargic2 = new LethargicCritter(10.1);
		System.out.println(lethargic.equals(lethargic2));
		System.out.println("Expected: false");
		lethargic2.move(1);
		lethargic2.move(1);
		lethargic2.move(1);
		System.out.println(lethargic.equals(lethargic2));
		System.out.println("Expected: true");

		LethargicCritter lethargic3 = new LethargicCritter(10.1);
		Critter critter3 = new Critter(10.1);
		System.out.println("super equals sub: " + lethargic3.equals(critter3));
		System.out.println("Expected: false");

		System.out.println("Different classes:" + critter.equals("dog"));
		System.out.println("Expected: false");
		System.out.println("null: " + critter.equals(null));
		System.out.println("Expected: false");

	}
}
