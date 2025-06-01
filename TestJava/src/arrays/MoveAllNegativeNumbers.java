package arrays;

public class MoveAllNegativeNumbers {

	public static void main(String[] args) {

		int[] arr = { 1, -2, 3, 0, -3, -4, -5, 8, -20, 90 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int n : arr)
			System.out.print(n + " ");
	}

}
