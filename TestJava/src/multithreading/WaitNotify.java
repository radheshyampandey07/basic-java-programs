package multithreading;

class MovieCollection extends Thread {
	int total = 0;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			total += 100;
		}
		System.out.println(total);
	}
}

public class WaitNotify {

	public static void main(String[] args) {
		MovieCollection collection = new MovieCollection();
		collection.start();
		System.out.println("Total earnings : " + collection.total);
 
	}

}
