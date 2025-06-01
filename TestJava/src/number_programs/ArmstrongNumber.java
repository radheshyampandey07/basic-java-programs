package number_programs;

/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int k = n;
		int sum = 0;
		while (n > 0) {
			int m = n % 10;
			System.out.println("m : " + m);
			sum += m * m * m;
			n = n / 10;
		}
		if (sum == k)
			System.out.println("number is armstrong " + sum);
		else
			System.out.println("number is not armstrong " + sum);
	}
}