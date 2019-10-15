package Oct30;

public class Part1 {
	public static void main(String[] args) {
		addEvenChecker(3);
		addEvenChecker(8);
		mulitpleChecker(16, 4);
		mulitpleChecker(11,3);
		
	}

	private static void addEvenChecker(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is an even number");
		else
			System.out.println(num + " is an odd number");
	}
	private static void mulitpleChecker(int num1,int num2) {
		if (num1 % num2 == 0)
			System.out.println(num1 + " is mulitple of "+num2);
		else
			System.out.println(num1 + " is not amulitple of "+num2);
	}
	
}
