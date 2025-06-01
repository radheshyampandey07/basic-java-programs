package arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 12, 23, 44, 56, 1, 0, 99, 13 };
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];
		}

		System.out.println("maximum: " + max);
		System.out.println("minimum: " + min);
	}

}
