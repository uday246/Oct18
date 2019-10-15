package oct29;

import java.util.Random;

public class TestMul {
	static int arr[] = new int[10];

	public static void main(String[] args) throws Exception {
		Random r = new Random();
		for (int i = 0; i < 10; i++){
			arr[i] = r.nextInt(100) + 1;
			System.out.print(arr[i]+" ");
		}
		Thread.sleep(1000);
		System.out.println("\nNow we start to print out!");
		// average thread
		new Thread(new Runnable() {

			@Override
			public void run() {
				double sum = 0;
				for (int i = 0; i < 10; i++)
					sum += TestMul.arr[i];
				System.out.println("Average : " + sum / 10);
			}

		}).start();
		// max thread
		new Thread(new Runnable() {

			@Override
			public void run() {
				int max = -1;
				for (int i = 0; i < 10; i++)
					if (max < TestMul.arr[i])
						max = TestMul.arr[i];
				System.out.println("Max : " + max);

			}
		}).start();
		// min thread
		new Thread(new Runnable() {

			@Override
			public void run() {
				int min = 1000;
				for (int i = 0; i < 10; i++)
					if (min > TestMul.arr[i])
						min = TestMul.arr[i];
				System.out.println("Min : " + min);
			}
		}).start();
		Thread.sleep(1000);
		System.out.println("we finished");
	}
}
