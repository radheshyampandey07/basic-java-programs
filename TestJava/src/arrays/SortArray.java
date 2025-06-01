package arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] arr = { 11, 3, 12, 2, 6, 7, 9, 10, 13, 14, 0 };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[i]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int ar : arr)
//			System.out.print(ar + " ");
		System.out.println("start");

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}

		for (int ar : arr)
			System.out.print(ar + " ");
		System.out.println("sorted array");
	}

}
