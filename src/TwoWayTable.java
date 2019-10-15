
public class TwoWayTable {
	int arr[][];
	int grandTotal;
	int rowSum[];
	int colSum[];
	
	public TwoWayTable(int[][] aArr) {
		super();
		arr = aArr;
		rowSum= new int[arr.length];
		colSum=new int[arr[0].length];
	}
	// calculating the sum of rows and putting in single dimensional array
	private void calculateRowSum(){
		for(int i=0;i<arr.length;i++){
			int s=0;
			for(int j=0;j<arr[i].length;j++)
				s+=arr[i][j];
			
			rowSum[i]=s;
		}
	}
	// calculating the sum of cols and putting in single dimensional array
	private void calculateColSum(){
		for(int i=0;i<arr.length;i++){
			int s=0;
			for(int j=0;j<arr[i].length;j++)
				s+=arr[j][i];
			
			colSum[i]=s;
		}
	}
	//calculating the sum of all elements in array
	private void calculateGrandTotal(){
		int s=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				s+=arr[j][i];
			
		}
		
		grandTotal=s;
	}
	public String toString(){
		String res="";
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				res=res+" "+arr[i][i];
			res+="\n";
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[][]={{5,8},{10,12}};
		TwoWayTable t = new TwoWayTable(arr);
		System.out.println(t);
	}
}
