package basicJava;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 29, 8, 7, 10, 20, 19, 31 };
		int l = arr[0];
		int sl = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > l) {
				sl = l;
				l = arr[i];
			} else if (arr[i] > sl) {
				sl = arr[i];
			}
		}
		System.out.println(l + " " + sl);
	}

}
