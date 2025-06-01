package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyMain {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		for (int i = 1; i <= 10; i++) {
			final int num = i;
			service.submit(new Runnable() {

				@Override
				public void run() {
					printTable(num);

				}
			});
		}
		service.shutdown();
	}

	private static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
		
	}

}
