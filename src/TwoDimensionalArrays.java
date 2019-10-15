import java.util.Random;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		int arr[][] = create2DIntArray(5, 5);
		int max = getMax2D(arr);
		System.out.println("Max element in 2D array : " + max);
		int tar = 5;
		int index = indexOFRow2D(arr, tar);
		System.out.println("Index of " + tar + " in 2D array " + index);
	}

	private static int indexOFRow2D(int[][] aArr, int tar) {
		for (int i = 0; i < aArr.length; i++)
			for (int j = 0; j < aArr[i].length; j++) {
				if (aArr[i][j] == tar) {
					return i;
				}
			}
		return -1;
	}

	private static int getMax2D(int[][] aArr) {
		int max = -1;
		for (int i = 0; i < aArr.length; i++)
			for (int j = 0; j < aArr[i].length; j++) {
				if (aArr[i][j] > max) {
					max = aArr[i][j];
				}
			}
		return max;
	}

	private static int[][] create2DIntArray(int aI, int aI2) {
		int arr[][] = new int[aI][aI2];
		Random r = new Random();
		for (int i = 0; i < aI; i++) {
			for (int j = 0; j < aI2; j++) {
				arr[i][j] = r.nextInt(11);
			}
		}
		return arr;
	}
}
