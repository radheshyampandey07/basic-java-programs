package basicJava;

public class Factorial {

	public static void main(String[] args) {

		int x = 9;
		int y = findFactorial(x);
		System.out.println("y : " + y);
	}

	static int findFactorial(int x) {
		int f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * i;
			System.out.println("f : " + f);
		}
		System.out.println(x);

		return f;

	}

}
