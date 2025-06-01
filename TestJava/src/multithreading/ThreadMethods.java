package multithreading;

class XY extends Thread {
	int x = 10;

	public XY() {
		System.out.println("in XY class");
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}

public class ThreadMethods {

	public static void main(String[] args) {

		XY x = new XY();
		System.out.println("main thread  " + Thread.currentThread().getName());
//		Thread t = new Thread(x);
		x.setName("XY class thread");
		x.start();
		XY x1 = new XY();
		x1.start();
		System.out.println("thread state "+Thread.currentThread().isAlive());
		
		XY x2= x1;
		x2.start(); 

	}

}
