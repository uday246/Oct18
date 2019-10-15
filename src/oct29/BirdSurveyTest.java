package oct29;

import java.util.Scanner;

public class BirdSurveyTest {

	// main method
	public static void main(String[] args) {

		// variable declaration
		String bird;
		// create object for BirdSurvey Class
		BirdSurvey bs = new BirdSurvey();
		// create object for scanner class
		Scanner input = new Scanner(System.in);
		// prompt user for data of bird
		System.out.print("Enter the name of bird('done' for stop):");
		bird = input.next();
		// verify whether the name of bird is done
		while (!bird.equals("done")) {
			// add the bird to the BirdSurvey object
			bs.add(bird);
			// prompt user for data of bird
			System.out.print("Enter the name of bird('done' for stop):");
			bird = input.next();
		}
		// display the datails of the birds store in the list
		System.out.println("\n the birds store in the list are.");
		bs.getReport();
		// prompt user for a bird name to find its count//
		System.out.print("\nEnter the name of bird:");
		bird = input.next();
		// display the count result of a bird
		System.out.println("The number of birds of the" + bird + "type in the list" + bs.getCount(bird));
	}

	
}

class BirdSurvey {
	// reference to head node
	private BirdNode head;

	// default constructor
	public BirdSurvey() {
		// set head to null
		head = null;
	}

	// method of implementation
	public void add(Object bird) {
		// if the list is empty
		if (head == null)
			head = new BirdNode(bird, null, 1);
		else// if head !=null
		{
			// variable to find result
			boolean isFound = false;
			// reference to front
			BirdNode current = head;
			// repeat the loop to display all items
			while (current != null && !isFound) {
				// verify bird info
				if (current.getBird().equals(bird))
					isFound = true;
				else
					// go to next node
					current = current.getNextNode();
			}

			// verify if bird is found
			if (isFound)
				current.setCount(current.getCount() + 1);
			else
				// set new node at the beginning of the list//
				head = new BirdNode(bird, head, 1);
		}
	}

	// getCount method implementation
	public int getCount(Object bird) {
		// reference to front
		BirdNode current = head;
		// repeat the loop to display all items
		while (current != null) {
			if (current.getBird().equals(bird))
				return current.getCount();

			// go to next node
			current = current.getNextNode();
		}
		// return 0 if the bird is not found
		return 0;
	}

	// method to display all items in list
	// method implementation
	public void getReport() {
		// create a reference to the front
		BirdNode current = head;
		// repeat loop
		while (current != null) {
			// display item in the list
			System.out.println("The name of the bid is" + current.getBird() + "and the number of this type of bird is"
					+ current.getCount() + ".");
			// go to next node
			current = current.getNextNode();
		}
	}

	// method to return true if list is empty
	// isEmpty method implementation
	public boolean isEmpty() {
		// return result of (head==null)
		return (head == null);
	}

	// BirdNote class
	private class BirdNode {
		// variable declaration
		private Object BirdName;
		private BirdNode nextNode;
		private int count;

		// default constructor
		public BirdNode() {
			BirdName = null;
			nextNode = null;
			count = 0;
		}

		// parameterized constructor
		public BirdNode(Object newBird, BirdNode nextNewNode, int newCount) {
			BirdName = newBird;
			nextNode = nextNewNode;
			count = newCount;
		}

		// NextNode method implementation
		public void setNextNode(BirdNode nextNewNode) {
			nextNode = nextNewNode;
		}

		// get nextnode method implementation
		public BirdNode getNextNode() {
			return nextNode;
		}

		// bird method implementation
		public void setBird(String newBird) {
			BirdName = newBird;
		}

		// get bird method implementation
		public Object getBird() {
			return BirdName;
		}

		// count method implementation
		public void setCount(int newCount) {
			count = newCount;
		}

		// get count method implementation
		public int getCount() {
			return count;
		}
	}
}
