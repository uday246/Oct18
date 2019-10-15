package Oct5th;

class Investment {
	private String name;
	private double amount;
	private static double interestRate;

	public Investment() {

	}

	public Investment(String aName, double aAmount) {
		super();
		name = aName;
		amount = aAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double aAmount) {
		amount = aAmount;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double aInterestRate) {
		interestRate = aInterestRate;
	}

	public String toString() {
		return "Investment [name=" + name + ", amount=" + amount + ", Interest rate = "+interestRate+"]";
	}

	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investment other = (Investment) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public double futureValue(int years) {
		// I have used the formula for compound interest
		return amount * Math.pow((1 + (interestRate/100)/12),12* years);
	}
}

public class TestInvestment {
	public static void main(String[] args) {
		Investment.setInterestRate(5);
		Investment invt = new Investment("Koteswari", 5000);
		System.out.println(invt);
		System.out.println("5 years : " + invt.futureValue(5));
		System.out.println("10 years : " + invt.futureValue(10));
		System.out.println("20 years : " + invt.futureValue(20));

	}
}
