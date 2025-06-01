package basicJava;

public class CommonElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 4, 11, 12, 12, 5, 6 };
		int[] arr1 = { 2, 0, 3, 7, 4, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == arr[i])
					System.out.println(arr1[j]);
			}
		}
	}
}
