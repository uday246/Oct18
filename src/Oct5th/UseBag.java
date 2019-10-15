package Oct5th;

class Bag {
	// A class representing a bag of items
	private int weight;

	// Construct a bag, initially empty, with the indicated weight that it can
	// hold (in ounces)

	public Bag(int weight) {
		this.weight = weight;
	}

	// Construct a bag, initially empty, with an assumed weight of 20 ounces.
	public Bag() {

	}

	// return the current weight of items in the bag

	public int currentWeight() {
		return weight;
	}

	// put moreOunces into the bag - but never more than the weight that it can
	// hold.

	public void addItems(int moreOunces) {
		weight += moreOunces;
	}

	// remove amount ounces from the bag (or as many as possible when not enough
	// is present) // return how many were actually removed.
	public int removeItems(int amount) {
		if (weight < amount) {
			weight = 0;
			return weight;
		} else {
			weight = weight - amount;
			return amount;
		}
	}
}

public class UseBag {
	public static void main(String[] args) {

		Bag b = new Bag(10);
		System.out.println(b.currentWeight());

		b.addItems(3);

		System.out.println(b.currentWeight());

		b.addItems(50);

		System.out.println(b.currentWeight());

		int got = b.removeItems(8);

		System.out.println("removed " + got + " ounces");

		System.out.println(b.currentWeight());

		got = b.removeItems(5);

		System.out.println("removed " + got + " ounces");
		System.out.println(b.currentWeight());

		Bag b2 = new Bag();
		b2.addItems(30);
		System.out.println(b2.currentWeight());
	}
}
