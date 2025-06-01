package multithreading;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			int num = 200;
			for (int i = 1; i < 5; i++) {
				try {
					System.out.println(num * i + Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted : " + e);

				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.setName("first thread");
		thread.setPriority(5);
		thread.start();
		thread.interrupt();
		Thread thread1 = new Thread(runnable);
		thread1.setName("second thread");

		thread1.start();
//		thread1.join(); 
//		thread.wait();

	}

}
