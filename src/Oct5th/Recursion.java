package Oct5th;

public class Recursion {
public static void main(String[] args) {
	mystery1(314159);
	System.out.println();
	System.out.println(mystery2(314159));
	int arr[] = {3,1,4,1,5,9};
	System.out.println(mystery3(arr,arr.length-1));
	if(mystery4(arr,0))
		System.out.println("RETURNED TRUE");
	else
		System.out.println("RETURNED false");
	mystery5(5);
	System.out.println();
	mystery6(5);
	System.out.println();
	mystery7(5);
	System.out.println();

}

private static void mystery7(int n) {
	if(n==0)
		return;
	System.out.print(n+" ");
	mystery7(n-1);	
	System.out.print(n+" ");
}

private static void mystery6(int n) {
	if(n==0)
		return;
	mystery6(n-1);	
	System.out.print(n+" ");
}

private static void mystery5(int n) {
	if(n==0)
		return;
	System.out.print(n+" ");
	mystery5(n-1);
}

private static boolean mystery4(int[] arr, int i) {
	if(i==arr.length-1) return false;
	if(arr[i]>arr[i+1]) return true;
	return mystery4(arr, i+1);
}

private static int mystery3(int[] aArr, int aI) {
	if(aI==-1) return 0;
	return aArr[aI]+mystery3(aArr, aI-1);
}

private static int mystery2(int n) {
	if(n==0) return 0;
	return (n%10)+mystery2(n/10);
}

private static void mystery1(int n) {

	if(n==0) return;
	System.out.print(n%10);
	mystery1(n/10);
}
}
