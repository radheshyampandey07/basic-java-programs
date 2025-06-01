package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("rade", 101);
		hashmap.put("radhe", 102);
		hashmap.put("shyam", 103);
		hashmap.put("pandey", 104);
		hashmap.put("sattu", 104);

		System.out.println("printing hashmap first time : " + hashmap);

		// print hashmap using Entry Set
		for (Map.Entry<String, Integer> e : hashmap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("hashmap size : " + hashmap.size());

		System.out.println();
		hashmap.remove("rade");

		System.out.println("printing hashmap second time : " + hashmap);

		System.out.println(hashmap.containsValue(104));

		System.out.println("*****  print key only using keySet  ******");
		for (String key : hashmap.keySet())
			System.out.println(key);

		System.out.println("------ print hashmap using lambda ------");

		// print hashmap using lambda
		hashmap.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println("Find every number's occurrences in array using map......");
		Integer[] arr = { 14, 12, 10, 13, 3, 14, 19, 9, 10, 14, 14, 13 };
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int n : arr) {
			if (m.containsKey(n))
				m.put(n, m.getOrDefault(n, 0) + 1);
			else
				m.put(n, 1);
		}
		System.out.println(m);

		System.out.println("Find duplicate in array using map......");
		for (Map.Entry n : m.entrySet()) {
			int num = (Integer) n.getValue();
			if (num > 1) {
				System.out.println(n.getKey() + " -> " + n.getValue());
			}
		}

	}
}
