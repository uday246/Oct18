import java.util.Date;

/**
 * An application that uses the PhoneCard class.
 *
 */
public class PhoneDriver {
	/**
	 * The entry point of the application.
	 *
	 * @param args
	 *            The command-line arguments
	 */
	public static void main(String[] args) {
		Date end, now, start;
		long availableMillis;
		PhoneCard card;

		now = new Date();
		card = new PhoneCard(10.00, 2, 0.10);
		start = new Date(now.getTime());
		end = new Date(start.getTime() + 600000);

		// Get the status of the card
		availableMillis = card.getAvailableMilliseconds();
		// Make a call if possible
		if (availableMillis > 0) {
			card.startCall("540-568-1671", start);
			card.endCall(end);
		}

		// Get the status of the card
		availableMillis = card.getAvailableMilliseconds();
		// Make a call if possible
		if (availableMillis > 0) {
			start = new Date(end.getTime() + 1200000);
			card.startCall("540-568-1667", start);
			end = new Date(start.getTime() + 2400000);
			card.endCall(end);
		}

		// Get the status of the card
		availableMillis = card.getAvailableMilliseconds();
		// Make a call if possible
		if (availableMillis > 0) {
			start = new Date(end.getTime() + 60000);
			card.startCall("540-568-8771", start);
			end = new Date(start.getTime() + 90000);
			card.endCall(end);
		}
	}
}

/**
 * An encapsulation of a pre-paid fixed-rate phone card.
 *
 * This particular implementation has a limit on the number of calls that can be
 * made as well as on the total dollar value.
 */
class PhoneCard {
	private static final double MINUTES_PER_MILLISECOND = 1. / (1000. * 60.);

	private Date[] callEnds, callStarts;
	private double balance; // In dollars
	private double rate; // In dollars per millisecond
	private int calls, maxCalls;
	private String[] callNumbers;

	/**
	 * Explicit Value Constructor.
	 *
	 * @param initialBalance
	 *            The initial balance (in dollars)
	 * @param maxCalls
	 *            The number of calls that can be made
	 * @param dollarsPerMinute
	 *            The rate (in dollars per minute)
	 */
	public PhoneCard(double initialBalance, int maxCalls, double dollarsPerMinute) {
		calls = 0;
		balance = initialBalance;
		callStarts = new Date[maxCalls];
		callEnds = new Date[maxCalls];
		callNumbers = new String[maxCalls];
		this.maxCalls = maxCalls;

		rate = dollarsPerMinute * MINUTES_PER_MILLISECOND;
	}

	/**
	 * End a call.
	 *
	 * @param end
	 *            The ending date/time of the call
	 */
	public void endCall(Date end) {
		double cost;
		long length;

		callEnds[calls] = end;

		length = callEnds[calls].getTime() - callStarts[calls].getTime();
		cost = length * rate;

		balance -= cost;

		++calls;
	}

	/**
	 * Get the length of the longest call that can be made using this card
	 * (based on the rate and the balance).
	 *
	 * @return The length of the longest call (in milliseconds)
	 */
	public long getAvailableMilliseconds() {
		long available;

		available = 0;
		if (calls < maxCalls) {
			available = (long) (balance / rate);
		}

		return available;
	}

	/**
	 * Start a call.
	 *
	 * @param number
	 *            The number that was called
	 * @param start
	 *            The starting date/time of the call
	 */
	public void startCall(String number, Date start) {
		callNumbers[calls] = number;
		callStarts[calls] = start;
	}
}
