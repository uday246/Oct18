import java.util.*;

public class Account

{

	public static void main(String[] args)

	{
		String[] userid = { "John", "test2", "test3" }; // Stringing names
																// and passwords
																// as stored
		String[] passwords = { "College", "test2", "test3" };

		Scanner input = new Scanner(System.in); // input via scanner

		boolean valid = false; // using boolean for the two options as
								// username/id can only be correct or incorrect
		String testname = null, password;

		System.out.println("Welcome to College Online Shop!");

		while (!valid) {
			System.out.println("Please enter your login ID: ");
			testname = input.next(); 
			System.out.println("Please enter your password: ");
			password = input.next();
			
			// after taking the inputs from the user we need to validate them using the values in the arrays
			boolean flag = false;
			int i;
			for (i = 0; i < userid.length; i++) {
				// checking for userid in the array
				if (userid[i].equalsIgnoreCase(testname)) {
					flag = true;
					break;
				}
			}
			// if user founds than checking the equalant password
			if (flag && passwords[i].equals(password))
				valid = true;
		}

		System.out.println("*************** Welcome *********************");
	}

	private String userid;

	private String password;

	private double balance;

	private int items; // number of items

	Account(String id, String pass) // constructor account with no balance

	{
		userid = id;
		password = pass;
		balance = 0;
		items = 0;
	}

	Account(String user, String pass, double balance)// constructor account with
														// balance, using double
														// for decimal values

	{

		userid = user;
		password = pass;
		this.balance = balance;
		items = 0;

	}

	public double check_balance() // check the balance of account

	{
		return balance;
	}

	public int check_items() // check number of items purchased

	{
		return items;
	}

	public void order_item(int i) // modifier to order item

	{
		items = items + i;
	}

	public void add_balance(double balance) // modifier to add balance
	{
		balance += balance;
	}

}