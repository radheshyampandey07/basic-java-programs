package number_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n = scn.nextInt();

		boolean b = checkPrimeNum(n);
		if (b) {
			System.out.println("given number is prime  : " + n);
		} else {
			System.out.println("given number is not prime  : " + n);
		}

	}

	static boolean checkPrimeNum(int n) {
		boolean flag = false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			return true;
		else
			return false;
	}

}
