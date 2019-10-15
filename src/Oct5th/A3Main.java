package Oct5th;

class ArrayOperation {
	// return sum of elements in array
	public int getTotal(int arr[][]) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				res += arr[i][j];
		}
		return res;
	}

	// return avg of elements in array
	public double getAverage(int arr[][]) {
		double res = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				res += arr[i][j];
			count++;
		}
		return res / count;
	}
	// return row total in array
	public int getRowTotal(int arr[][], int row) {
		int res = 0;
		for (int i = 0; i < arr[row].length; i++) {
			res += arr[row][i];
		}
		return res;
	}
	// return col total in array
	public int getColTotal(int arr[][], int col) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i][col];
		}
		return res;
	}
	// return max element in array
	public int getHighestTotal(int arr[][], int row) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[row][i])
				max = arr[row][i];
		}
		return max;
	}
	// return min element in array
	public int getLowestTotal(int arr[][], int row) {
		int min = 1000;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[row][i])
				min = arr[row][i];
		}
		return min;
	}
}

public class A3Main {
	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		int arr[][] = { { 1, 2, 3, 4, 5 }, { 2, 6, 7, 32, 76 }, { 4, 12, 13, 16, 19 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

		System.out.println("Total : " + ao.getTotal(arr));
		System.out.println("Average : " + ao.getAverage(arr));
		System.out.println("Row 1 total :" + ao.getRowTotal(arr, 1));
		System.out.println("Col 1 total :" + ao.getColTotal(arr, 1));
		System.out.println("Highest in row 1  :" + ao.getHighestTotal(arr, 1));
		System.out.println("Lowest in col 1  :" + ao.getLowestTotal(arr, 1));

	}
}
