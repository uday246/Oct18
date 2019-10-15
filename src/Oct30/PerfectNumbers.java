package Oct30;

public class PerfectNumbers {
public static void main(String[] args) {
	for(int i=1;i<1000;i++){
		if(isPerfectNumber(i)){
			System.out.println(i);
		}
	}
}

private static boolean isPerfectNumber(int aI) {
	int sum=0;
	for(int i=1;i<aI;i++){
		if(aI%i==0)
			sum+=i;
	}
	return sum==aI;
}
}
