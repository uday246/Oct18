package Oct30;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class DeliveryOrder {

	String item;

	double quantity;

	double totalPrice;

	String accntID;

	String authnum;

	public void SetItem(String item) {

		this.item = "";

		this.quantity = 0.0;

		this.totalPrice = 0.0;

		this.accntID = "";

		this.authnum = "";

	}

	public DeliveryOrder(String item, double quantity, double totalPrice, String acctID, String authnum) {

		this.item = item;

		this.quantity = quantity;

		this.totalPrice = totalPrice;

		this.accntID = acctID;

		this.authnum = authnum;

	}

	public DeliveryOrder(String aAcctID) {
			accntID=aAcctID;
	}

	public String GetItem() {

		return item;

	}

	public void SetQuantity(double quantity) {

		this.quantity = quantity;

	}

	public double GetQuantity() {

		return quantity;

	}

	public void SetTotalPrice(double totalPrice) {

		this.totalPrice = totalPrice;

	}

	public double GetTotalPrice() {

		return totalPrice;

	}

	public void SetID(String acctID) {

		this.accntID = acctID;

	}

	public String GetID() {

		return accntID;

	}

	public void SetAuthnum(String authnum) {

		this.authnum = authnum;

	}

	public String GetAuthnum() {

		return authnum;

	}

	public void OrderDetails() {

		System.out.println("The item is: " + this.GetItem());

		System.out.println("The quantity is: " + this.GetQuantity());

		System.out.println("The totalPrice is: $" + this.GetTotalPrice());

		System.out.println("The account ID is: " + this.GetID());

		System.out.println("The authorization number is: " + this.GetAuthnum());

	}

}

class CustomerAccount extends DeliveryOrder {

	public CustomerAccount(String acctID) {

		super(acctID);

	}

}

class CustomerInterface extends DeliveryOrder {

	public CustomerInterface(String aItem, double aQuantity, double aTotalPrice, String aAcctID, String aAuthnum) {
		super(aItem, aQuantity, aTotalPrice, aAcctID, aAuthnum);
		// TODO Auto-generated constructor stub
	}

	public CustomerInterface(String aAcctID) {
		super(aAcctID);
		// TODO Auto-generated constructor stub
	}

	
}

class BankInterface {

	public String cardnum;

	public BankInterface(String cardnum) {

		this.cardnum = cardnum;

	}

	public void SetCardnum(String cardnum) {

		this.cardnum = "";

	}

	public String GetCardnum() {

		return cardnum;

	}

}

class Email {

	public String custemail;

	public Email(String custemail) {

		this.custemail = custemail;

	}

	public void SetEmail(String custemail) {

		this.custemail = "";

	}

	public String GetEmail() {

		return custemail;

	}

}

class OrderManager extends DeliveryOrder {

	public OrderManager(String aItem, double aQuantity, double aTotalPrice, String aAcctID, String aAuthnum) {
		super(aItem, aQuantity, aTotalPrice, aAcctID, aAuthnum);
	}

	public OrderManager(String aAcctID) {
		super(aAcctID);
	}

	

}

public class TestOrder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your card number.");

		String cardnum = input.next();

		if (cardnum == "12345678") {

			System.out.println("Order approved.");

			DeliveryOrder order1 = new DeliveryOrder("Note", 3, 20, "Alex", "3333");

			DeliveryOrder order2 = new DeliveryOrder("Book", 1, 50, "John", "5555");

			DeliveryOrder order3 = new DeliveryOrder("Pencil", 20, 10, "Sam", "7777");

			order1.OrderDetails();

			order2.OrderDetails();

			order3.OrderDetails();
		}

		else {

			System.out.println("Not a valid card number.");

		}

	}

}
