package java8;

public class ThreadUsingLambda {
	static Runnable runnable = () -> {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 10);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	};

	public static void main(String[] args) {

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
