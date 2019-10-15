package oct12;

public class MethodPractice {
	public static void main(String[] args) {
		System.out.println(absValue(10));
		System.out.println(absValue(-10));
		System.out.println(absValue(26));
		
		
		System.out.println(repeatString("test", 3));
		System.out.println(repeatString("test", -1));
		System.out.println(repeatString("test", 0));
		
		System.out.println(divideself(128));
		System.out.println(divideself(81));
		System.out.println(divideself(101));
		
	}

	private static String repeatString(String aString, int aI) {
		String res = "";
		// start loop till the count n append string to res
		for (int i = 0; i < aI; i++)
			res += aString;
		return res;
	}

	private static int absValue(int aI) {
		// if num is negative multiply with *-1 to make it positive
		if (aI < 0)
			aI *= -1;
		return aI;
	}

	private static boolean divideself(int num) {
		int temp = num;
		if(num<=0)
			return false;
		while (temp > 0) {
			int t = temp % 10; // gives the last digit of number
			if (t == 0)
				return false;
			if (num % t != 0)
				return false;
			temp /= 10; // removes last digit of number
		}
		return true;
	}
}
