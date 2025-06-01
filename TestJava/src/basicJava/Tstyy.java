package basicJava;

public class Tstyy {

	public static void main(String[] args) {
		int n = 102;
		checknum(n);
	}

	static void checknum(int n) {
		if (n > 9) {
			int k = check(n);
			if (k > 9)
				checknum(k);
			else {
				System.out.println(k);
			}
		} else
			System.out.println(n);
	}

	static int check(int s) {
		int mul = 1;
		int n = s;
		while (n != 0) {
			int d = n % 10;
			mul = mul * d;
			n = n / 10;
		}
		return mul;
	}
}
