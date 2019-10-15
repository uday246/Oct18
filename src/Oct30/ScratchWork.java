package Oct30;

public class ScratchWork {
public static void main(String[] args) {
	System.out.println(computeAreaOfRectangle(4,6));
	System.out.println(computeCost(3,9.99));
	System.out.println(computeCostAfterDiscount(10.0,0.2));
	System.out.println(computeAreaOfTrapezoid(8,10,5));
	
}

private static double computeAreaOfTrapezoid(int a, int b, int h) {
	return ((a+b)/2)*h;
}

private static double computeCostAfterDiscount(double aD, double aD2) {
	return aD-aD*aD2;
}

private static double computeCost(int aI, double aD) {
	return aI * aD;
}

private static int computeAreaOfRectangle(int aI, int aI2) {
	// TODO Auto-generated method stub
	return aI * aI2;
}

}
