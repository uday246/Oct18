package Oct5th;

/**
 * This class uses three constructors.
 */

class InventoryItem {
	private String description; // Item description
	private int units; // Units on-hand

	/**
	 * copy constructor to copy the data
	 */
	public InventoryItem(InventoryItem item) {
		this.description = item.description;
		this.units = item.units;
	}

	/**
	 * No-arg constructor
	 */

	public InventoryItem() {
		description = "";
		units = 0;
	}

	/**
	 * The following constructor accepts a String argument that is assigned to
	 * the description field.
	 */

	public InventoryItem(String d) {
		description = d;
		units = 0;
	}

	/**
	 * The following constructor accepts a String argument that is assigned to
	 * the description field, and an int argument that is assigned to the units
	 * field.
	 */

	public InventoryItem(String d, int u) {
		description = d;
		units = u;
	}

	/**
	 * The setDescription method assigns its argument to the description field.
	 */

	public void setDescription(String d) {
		description = d;
	}

	/**
	 * The setUnits method assigns its argument to the units field.
	 */

	public void setUnits(int u) {
		units = u;
	}

	/**
	 * The getDescription method returns the value in the description field.
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * The getUnits method returns the value in the units field.
	 */

	public int getUnits() {
		return units;
	}
}

/**
 * This program demonstrates the InventoryItem class's three constructors.
 */

public class InventoryDemo {
	public static void main(String[] args) {
		// Variables to reference 3 instances of
		// the InventoryItem class.
		InventoryItem item1, item2, item3;
		InventoryItem copyItem;

		// Instantiate item1 and use the
		// no-arg constructor.
		item1 = new InventoryItem();
		System.out.println("Item 1:");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Units: " + item1.getUnits());
		System.out.println();

		// Instantiate item2 and use the
		// second constructor.
		item2 = new InventoryItem("Wrench");
		System.out.println("Item 2:");
		System.out.println("Description: " + item2.getDescription());
		System.out.println("Units: " + item2.getUnits());
		System.out.println();

		// Instantiate item3 and use the
		// third constructor.
		item3 = new InventoryItem("Hammer", 20);
		System.out.println("Item 3:");
		System.out.println("Description: " + item3.getDescription());
		System.out.println("Units: " + item3.getUnits());

		copyItem = new InventoryItem(item3);
		System.out.println("Copy Item ");
		System.out.println("Description: " + copyItem.getDescription());
		System.out.println("Units: " + copyItem.getUnits());

	}
}
