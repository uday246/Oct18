public class InsertionSort {
	/* Function to sort array using insertion sort */
	static int sort(int values[], int numValues) {
		int n = numValues;
		int count=0;
		for (int i = 1; i < n; ++i) {
			int key = values[i];
			int j = i - 1;

			while (j >= 0 && values[j] > (key)) {
				values[j + 1] = values[j];
				j = j - 1;
				count++;
			}
			values[j + 1] = key;
			printArray(values);
		}
		return count+2;
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ",");

		System.out.println();
		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = {7,6, 12, 9, 3, 4, 5, 11, 9, 14, 2, 8};
		int c=sort(arr, arr.length);
		System.out.println("Number of comparions : "+c);
	}
}
