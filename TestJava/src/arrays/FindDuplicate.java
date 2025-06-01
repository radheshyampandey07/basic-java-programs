package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 3, 3, 12, 12, 44, 56, 1, 1, 1, 2, 1 };

		Map<Integer, Integer> data = new HashMap<>();

		for (int num : arr) {
			// getOrDefault method return the value if present then thats key value
			// otherwise default value passed in it
			data.put(num, data.getOrDefault(num, 0) + 1);
		}

		// Find and display duplicate elements
		System.out.println("Duplicate values in the array:");
		for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
//			if (entry.getValue() > 1)
			System.out.println(entry.getKey() + " - Occurrences: " + entry.getValue());
		}

		data.forEach((k, v) -> System.out.println(k + "\t" + v));

	}

}
