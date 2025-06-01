package multithreading;

class Tables {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class MyThread1 extends Thread {
	Tables t;

	MyThread1(Tables t) {
		this.t = t;
	}

	public void run() {
		t.printTable(6);
	}

}

class MyThread2 extends Thread {
	Tables t;

	MyThread2(Tables t) {
		this.t = t;
	}

	public void run() {
		t.printTable(7);
	}

}

public class SynchronizationEx {
	static synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Tables obj = new Tables();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t1.join();
		t2.start();
		t2.join();

		Runnable runnable = () -> {
			printTable(9);
		};
		Thread t = new Thread(runnable);
		t.start();
	}

}
