package oct12;

public class PriceExceptionDemo {

	public static void main(String[] args) {
		Car rOne =new Car();
		rOne.setPrice(18000);
		Car rTwo =new Car();
		rTwo.setPrice(45000);
		Car rThree =new Car();
		rThree.setPrice(500);
		Customer stOne = new Customer();
		Dealer.serveCustomer(stOne, rOne);
		Dealer.serveCustomer(stOne, rTwo);
		Dealer.serveCustomer(stOne, rThree);
		
						
	}

}

class PriceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class TooExpensive extends PriceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class TooCheap extends PriceException {
	private static final long serialVersionUID = 1L;
}

class Car {

	private int price = 5000;

	public void setPrice(int value) {

		price = value;

	}

	public int getPrice() {

		return price;

	}

}

class Customer {

	private static final int tooExpensive = 30000;

	private static final int tooCheap = 1000;

	public void buyCar(Car car) throws

	TooExpensive, TooCheap

	{

		int price = car.getPrice();

		if (price <= tooCheap)

		{

			throw new TooCheap();

		}

		else

		if (price >= tooExpensive)

		{

			throw new TooExpensive();

		}

	}

}

class Dealer {

	public static void serveCustomer(Customer cust, Car car) {

		try {

			cust.buyCar(car);

			System.out.println("Car price is right for me");

		} catch (TooExpensive e) {

			System.out.println("Car is too expensive");

		} catch (TooCheap e) {

			System.out.println("Car is too cheap");

		}

	}
}