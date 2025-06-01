package basicJava;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1;
		for (int i = 1; i < 10; i++) {
			int next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}

	}

}
