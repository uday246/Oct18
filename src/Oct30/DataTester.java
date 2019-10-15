package Oct30;

class Data{
	private int [][]values;

	public Data(int[][] aValues) {
		super();
		values = aValues;
	}
	public int rowSum(int row){
		int sum=0;
		for(int i=0;i<values[row].length;i++)
			sum+=values[row][i];
		return sum;
	}
	public void fillColumn(int column,int fillValue){
		for(int i=0;i<values.length;i++){
			values[i][column]=fillValue;
		}
	}
}
public class DataTester {

}
