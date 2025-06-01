package number_programs;

public class PerfectNumber {

	static boolean checkNumber(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s += i;
			}
		}
		if (n == s) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		int num = 30;
		int k = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				k += i;
			}
		}
		// if (num == n)
		// System.out.println("number is perfect " + n);
		// else
		// System.out.println("number is not perfect");

		int count = 0;
		int m = 2;
		while (count < 5) {
			if (checkNumber(m)) {
				System.out.println("perfect num - " + m);
				count++;
			}
			m++;
		}
	}

}
