package multithreading;

class Y1 extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(10 * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class YieldEx {

	public static void main(String[] args) {

		Y1 y1 = new Y1();
		y1.start();
		
		Y1 y2 = new Y1();
		y2.start();
	}

}
