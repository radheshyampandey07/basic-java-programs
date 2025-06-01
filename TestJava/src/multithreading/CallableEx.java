package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//class CallableDemo implements Runnable, Callable<Integer> {
//	int num;
//
//	@Override
//	public void run() {
//		for (int i = 1; i < 10; i++) {
//			try {
//				System.out.println(i * num + " ");
//			} catch (Exception e) {
//				e.getMessage();
//			}
//		}
//	}
//
//	@Override
//	public Integer call() throws Exception {
//		int factorial = 1;
//		for (int i = num; i > 0; i--)
//			factorial = factorial * i;
//		return factorial;
//	}
//
//}

public class CallableEx {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Runnable using lambda
		Runnable runnable = () -> {
			for (int i = 1; i < 10; i++)
				System.out.println(i);
		};

		Thread t = new Thread(runnable);
		t.start();

		// execute callable
		int num = 9;

		ExecutorService service = Executors.newFixedThreadPool(2);

		Future<Integer> future = service.submit(() -> {
			int fact = 1;
			for (int i = num; i > 1; i--) {
				fact = fact * i;
			}
			return fact;
		});

		try {
			int result = future.get();
			System.out.println("factorial of " + num + " is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
