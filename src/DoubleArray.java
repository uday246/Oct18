
public class DoubleArray {
	public static void main(String[] args) {
		//double a[]={48,32,51,62,12,55,66,4,8,7};
		//System.out.println("Min Element is : "+min(a));
		int[] b = new int[10];
		int   i;

		for ( i=1; i<b.length; i++ )
		{
		   b[i] = 5 * i;
		} 
	}

	//method which returns the min element from the array
	public static double min(double[] list) {
		double min = list[0];
		if(list==null || list.length==0)
				return -1;
		for(int i=1;i<list.length;i++){
			if(list[i]<min)
				min=list[i];
		}
		return min;
	}
}
