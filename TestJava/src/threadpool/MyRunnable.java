package threadpool;

public class MyRunnable implements Runnable {

	private int x;

	public MyRunnable(int a) {
		x = a;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + "*" + i + "=" + x * i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}
}
