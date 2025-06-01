package multithreading;

// thread that has called join will execute first
class FirstJoin extends Thread {
	int n;

	FirstJoin(int n) {
		this.n = n;
	}

	public void run() {
		for (int i = 1; i < n; i++) {
			System.out.println(i * 1 + " : " + Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		FirstJoin join = new FirstJoin(5);
		FirstJoin join1 = new FirstJoin(6);
		FirstJoin join2 = new FirstJoin(4);
		join2.setName("third");
		join.setName("first");
		join1.setName("second");

		join.start();
		join.join(); // if i will not call the join method here on thread 1 then other thread will
						// start execution

		join1.start();
		join1.join();
		join2.start();
//		join2.wait();
	}

}
