package Oct14;

public class PalindromePrimce {
	public static void main(String[] args) {
		int count=0;
		for (int i = 0;; i++) {
			if(isPrime(i) && isPlaindrome(i) && i>10){
				count++;
				System.out.print(i+" ");
				if(count%10==0)
					System.out.println();
				if(count==50)
					break;
			}
		}
	}
	// checks given number is prime or not
	private static boolean isPrime(int aI) {
		if(aI==2)
			return true;
		if(aI%2==0)
			return false;
			for(int i=2;i<aI;i++){
				if(aI%i==0)
					return false;
			}
		return true;
	}
	// checks given number is palindrom or not
	public static boolean isPlaindrome(int n) {
		int temp = n, sum = 0, r = 0;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		return (temp == sum);
	}
}
