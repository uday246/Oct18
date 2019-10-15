package oct12;

public class DoubleArrays {
public static void main(String[] args) {
	double arr1[] = {10,1,4,9,6,4,1,13,15};
	double arr2[] = new double[10];
	System.out.println("Output Before");
	printArray(arr1,arr2);
	for(int i=0;i<arr1.length;i++)
	arr2[i]=arr1[i];
	System.out.println("Output After");
	printArray(arr1,arr2);
	arr1[5]=100;
	arr2[2]=200;
	System.out.println("Output Change");
	printArray(arr1,arr2);
	
	
}

private static void printArray(double[] aArr1, double[] aArr2) {
	for(int i=0;i<aArr1.length;i++)
	{
		System.out.println(aArr1[i]+"\t"+aArr2[i]);
	}
}
}
