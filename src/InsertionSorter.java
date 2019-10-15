
public class InsertionSorter {
	/* Function to sort array using insertion sort */
	int sort(Comparable arr[]) {
		int count = 0;
		if (arr == null || arr.length == 0)
			return 0;

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			Comparable key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
				count++;
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return count;
	}

	// Driver method
	public static void main(String args[]) {
		Integer arr[] = { 50,21,34,26, 18, 31, 37, 54 };

		InsertionSorter ob = new InsertionSorter();
		int comp = ob.sort(arr);
		System.out.println("Comparisons required : "+comp);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
