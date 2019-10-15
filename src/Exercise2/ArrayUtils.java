package Exercise2;

import java.util.Scanner;

public class ArrayUtils {
	/**
	 * @param array sorts array using bubble sort
	 */
	public static void sort(int array[]) {
		int i, j, temp;
		int count = array.length;
		for (i = 0; i < count - 1; ++i) {

			for (j = 0; j < count - 1 - i; ++j) {

				if (array[j] > array[j + 1]) {

					temp = array[j + 1];

					array[j + 1] = array[j];

					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements into the array: ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		System.out.println("Before Sort: ");
		printArray(ar);
		sort(ar);
		System.out.println("After sort: ");
		printArray(ar);
		System.out.println("Highest: " + getHighets(ar));
		System.out.println("Lowest: " + getLowest(ar));
		System.out.println("Average: " + getAverage(ar));

	}

	/**
	 * @param arr
	 * @return the average of arr elements
	 */
	private static double getAverage(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum / arr.length;
	}
	/**
	 * @param arr
	 * @return highest element from the array elements
	 */
	private static int getHighets(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		return max;
	}

	/**
	 * @param arr
	 * @return lowest element from the array elements
	 */
	private static int getLowest(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		return min;
	}

	/**
	 * @param arr
	 *	Prints the elements in the array
	 */
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}
}
