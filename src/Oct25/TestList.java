package Oct25;

import java.sql.Date;
import java.util.ArrayList;

// created loan class to store in ArrayList
class Loan {
	int amount;

	public Loan(int aAmount) {
		super();
		amount = aAmount;
	}

}
//created Circle class to store in ArrayList
class Circle {
	double radius;

	public Circle(double aRadius) {
		super();
		radius = aRadius;
	}

}

public class TestList {
	public static void main(String[] args) {
		// creating arraylist with type Object so that it can store all type objects
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Test");
		list.add(new Circle(10));
		list.add(new Date(1000));
		list.add(new Loan(1000));
		// iterating the list and printing the values
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());

	}
}
