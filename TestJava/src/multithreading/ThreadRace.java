package multithreading;

class Laptop {
	int price;
}

class Dell extends Laptop implements Runnable {
	int price;

	public Dell(int y) {
		price = y;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			price += 1000;

	}
}

class HP extends Laptop implements Runnable {
	int price;

	public HP(int x) {
		price = x;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			price -= 1000;
	}
}

public class ThreadRace {

	public static void main(String[] args) {
		Dell l1 = new Dell(21000);
		Laptop hp = new HP(31000);

		Thread t = new Thread(l1);
		t.start();
		System.out.println(l1.price);

	}

}
