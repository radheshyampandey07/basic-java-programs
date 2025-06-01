package number_programs;

public class LessThanNine {

	public static void main(String[] args) {

		int num = 876;
		int n = checkNumber(num);
		while (n > 9) {
			n = checkNumber(n);
		}
		System.out.println("value of n after manipulation : " + n);
	}

	static int checkNumber(int n) {
		if (n > 9) {
			n = n / 9;
			System.out.println(n);
		}
		return n;
	}

}
