package streamApis;

import java.util.Arrays;

public class ArrayWithStream {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 54, 67, 89, 90, 12, 14, 10 };
		int sum = Arrays.stream(arr).filter(x -> x%2 == 0).sum();
		System.out.println(sum);
	}

}
