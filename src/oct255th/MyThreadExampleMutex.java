package oct255th;

public class MyThreadExampleMutex {
	public static void main(String[] args) {

		new HelloThread(1).start();
		new HelloThread(2).start();
		new HelloThread(3).start();
		System.out.print("Global.buffer Content = ");
		for (int i = 0; i < 9; i++) {

			System.out.print(Global.buffer[i] + "; ");

		}
	}
}

class Global {
	public static int[] buffer = new int[15];
	public static int index = 0;

}

class HelloThread extends Thread {

	int threadID;

	HelloThread(int ID) {

		this.threadID = ID;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {

			Global.buffer[Global.index] = this.threadID;

			Global.index++;
		}

	} // run
} // end Thread
