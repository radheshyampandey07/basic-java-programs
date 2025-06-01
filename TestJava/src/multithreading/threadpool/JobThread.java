package multithreading.threadpool;

public class JobThread implements Runnable {

	int num;

	public JobThread(int y) {
		num = y;
	}

	@Override
	public void run() {
		try {
			System.out.println("my job  " + num);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("job done successfully..." + num);
	}

}
