package arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int[] arr = {33, 42, 11, 49, 12, 23, 34};
		int l1 = arr[0], l2 = arr[0], l3 = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>l1)
				l1 = arr[i];
			else if(arr[i]< l1 && arr[i]> l2)
				l2 = arr[i];
			else if(arr[i]<l2 && arr[i]> l3)
				l3 = arr[i];
		}

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}
