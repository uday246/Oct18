package oct255th;

class BankAccount {
	private double balance;
	public final static double MINIMUM_BALANCE = 1500;
	public final static double BELOW_MINIMUM_FEE = 10.0;

	/**
	 * Constructs a bank account with a given balance.
	 * 
	 * @param initialBalance
	 *            the initial balance
	 */
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	/**
	 * Deposits money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Do end of month processing for the account
	 */
	public void endOfMonth() {
		if (balance < MINIMUM_BALANCE) {
			balance = balance - BELOW_MINIMUM_FEE;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
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
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}
	
}

/**
 * An account that earns interest every month
 */
class SavingsAccount extends BankAccount {
	private double annualInterestRate;

	/**
	 * Creates a InterestAccount object with a starting balance and account id
	 * 
	 * @param initialBalance
	 *            the starting balance
	 * @param rate
	 *            the annual interest rate
	 */
	public SavingsAccount(double initialBalance, double rate) {
		super(initialBalance);
		annualInterestRate = rate;
	}

	public double getInterestRate() {
		return annualInterestRate;
	}

	@Override
	public void endOfMonth() {
		double interest = getBalance() * annualInterestRate / 100 / 12;
		deposit(interest);
	}

	@Override
	public String toString() {
		return "SavingsAccount [annualInterestRate=" + annualInterestRate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(annualInterestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(annualInterestRate) != Double.doubleToLongBits(other.annualInterestRate))
			return false;
		return true;
	}
	
}

public class AccountsOverrideTester {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1500);
		BankAccount account2 = new BankAccount(1500);
		BankAccount account3 = new BankAccount(5000);

		SavingsAccount savings1 = new SavingsAccount(1500, .01);
		SavingsAccount savings2 = new SavingsAccount(3000, .02);
		SavingsAccount savings3 = new SavingsAccount(3000, .02);

		System.out.println(account1);
		System.out.println("Expected: BankAccount[balance=1500.0]");
		System.out.println(savings3);
		System.out.println("Expected: SavingsAccount[balance=3000.0][anualInterstRate=0.02]");

		System.out.println(account1.equals(account2));
		System.out.println("Expected: true");
		System.out.println(account1.equals(account3));
		System.out.println("Expected: false");
		System.out.println("super equals sub: " + account1.equals(savings1));
		System.out.println("Expected: false");

		System.out.println(savings1.equals(savings2));
		System.out.println("Expected: false");
		System.out.println(savings3.equals(savings2));
		System.out.println("Expected: true");

		System.out.println("Different classes:" + savings1.equals("account"));
		System.out.println("Expected: false");
		System.out.println("null: " + savings1.equals(null));
		System.out.println("Expected: false");
	}

}
