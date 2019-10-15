package Oct5th;

import java.util.ArrayList;
import java.util.List;

class MarketProduct {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int aPrice) {
		price = aPrice;
	}

	public MarketProduct(String aName, int aPrice) {
		super();
		name = aName;
		price = aPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		MarketProduct other = (MarketProduct) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

}
class Basket{
	MarketProduct [] list;
	private int index=0;
	int size;
	public Basket(int size) {
		super();
		this.size = size;
		list = new MarketProduct[size];
	}
	public void add(MarketProduct mp){
		list[index++] = mp;
	}
}
class Customer {
	private String name;
	private int balance;
	private List<MarketProduct> basket;

	public Customer(String aName, int aBalance) {
		super();
		name = aName;
		balance = aBalance;
		basket = new ArrayList<MarketProduct>();
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getBalance() {
		return balance;
	}

	public void addFunds(int aBalance) {
		if (aBalance < 0)
			throw new IllegalArgumentException("Funds can not be negative");
		balance = aBalance;
	}

	public List<MarketProduct> getBasket() {
		return basket;
	}

	public void addToBasket(MarketProduct mp) {
		basket.add(mp);
	}

	public boolean removeFromBasket(MarketProduct mp) {
		return basket.remove(mp);
	}

	public String checkOut() {
		int total = 0;
		for (MarketProduct m : basket) {
			total += m.getPrice();
		}
		if (total >= balance) {
			throw new IllegalStateException("Insufficient balance");
		}
		balance-=total;
		return "Name : " + getName() + "\nTotal Bill : " + total;
	}
}

public class TestCustomer {
	public static void main(String[] args) {
		Customer c1= new Customer("Koteswari", 2000);
		c1.addToBasket(new MarketProduct("Product1", 10));
		c1.addToBasket(new MarketProduct("Product2", 120));
		c1.addToBasket(new MarketProduct("Product3", 150));
		c1.addToBasket(new MarketProduct("Product4", 40));
		c1.addToBasket(new MarketProduct("Product5", 50));
		System.out.println(c1.checkOut());
	}
}
