package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 25, 6, 7, 15, 10 };
		int num = 5;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				found = true;
				System.out.println("given num is present at : " + i);
			}
		}

		if (!found)
			System.out.println("number not found.");

	}

}
