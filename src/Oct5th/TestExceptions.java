package Oct5th;

import java.util.Scanner;

class EndOfSentenseException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public EndOfSentenseException(String aMsg) {
		super();
		msg = aMsg;
	}

	public EndOfSentenseException() {
	}
}

class PunctuationException extends EndOfSentenseException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public PunctuationException() {
		super();
	}

	public PunctuationException(String aMsg) {
		super();
		msg = aMsg;
	}
}

class CommaException extends PunctuationException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public CommaException() {
		super();
	}

	public CommaException(String aMsg) {
		super();
		msg = aMsg;
	}
}

public class TestExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentense");
		String str = sc.nextLine();
		sc.close();
		try {
			if (str.endsWith(","))
				throw new CommaException("You can't end Sentense with comma");
			if (!(str.endsWith(".") || str.endsWith("!") || str.endsWith("?")))
				throw new PunctuationException("Sentense does not ends correctly");
			
			System.out.println("The sentense ends correctly");

		} catch (EndOfSentenseException e) {
			e.printStackTrace();
			System.out.println(e.getMsg());
		}

	}
}
