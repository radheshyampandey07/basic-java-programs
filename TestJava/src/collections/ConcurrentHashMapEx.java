package collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Concurrent {
	int number;
	String name;

	public Concurrent(int x, String n) {
		number = x;
		name = n;
	}
}

public class ConcurrentHashMapEx {
	public static void main(String[] args) {

		// Create a ConcurrentHashMap
		Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

		// Add elements to the map
		concurrentMap.put("Alice", 25);
		concurrentMap.put("Bob", 30);
		concurrentMap.put("Charlie", 28);

		// Modify values concurrently
		concurrentMap.compute("Alice", (key, value) -> key.length() + value);
		concurrentMap.merge("Bob", 2, Integer::sum);

		// Retrieve values
		int ageAlice = concurrentMap.get("Alice");
		int ageBob = concurrentMap.get("Bob");
		int ageCharlie = concurrentMap.get("Charlie");

		System.out.println("Age of Alice: " + ageAlice);
		System.out.println("Age of Bob: " + ageBob);
		System.out.println("Age of Charlie: " + ageCharlie);
	}

}
