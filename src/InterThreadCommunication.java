

// comment notify calls to enter this program into dead lock
public class InterThreadCommunication {
	public static void main(String[] args) {
		String lock = "";
		PrintA a = new PrintA(lock);
		PrintB b = new PrintB(lock);
		a.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.start();
	}
}

class PrintA extends Thread {
	String lock;

	public PrintA(String aLock) {
		super();
		lock = aLock;
	}

	public void run() {
		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Uday");
				try {
					//Thread.sleep(1000);
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lock.notify();
		}
		
	}
}

class PrintB extends Thread {
	String lock;

	public PrintB(String aLock) {
		super();
		lock = aLock;
	}

	public void run() {
		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Koti");
				try {
					//Thread.sleep(1000);
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//lock.notify();
		}
	}
}