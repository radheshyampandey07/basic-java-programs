package arrays;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 3, 5, 7, 8, 9 };

		int sum = Arrays.stream(arr).filter(x -> x % 2 == 0).sum();
		System.out.println(sum);
	}
}
