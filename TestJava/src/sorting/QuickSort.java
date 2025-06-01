package sorting;

public class QuickSort {
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;

		return i;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);

			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 11, 3, 4, 8, 9, 13,1 ,0 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);

		for (int i : arr)
			System.out.print(i + " ");
	}

}
