package collections;

import java.util.HashMap;

public class HashMapMethods {
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED = "\u001B[31m";

	public static final String ANSI_purple = "\u001B[35m";

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_BOLD = "\u001B[1m";

	public static void main(String[] args) {

//		System.out.println(ANSI_BOLD + ANSI_YELLOW + " hashmap important methods example ..." + ANSI_RESET);

		System.out.println(ANSI_BOLD + ANSI_YELLOW + " hashmap important methods example ...");

		System.out.println("All important hashmap methods...");
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 10);
		map.put("Banana", 5);
		map.put("Mango", 15);

		System.out.println("1. put(K key, V value) : to store a value in hashmap");
		System.out.println(map);

		System.out.println("2. get(Object key) : to get value from key");
		System.out.println(map.get("Apple")); // 10
		System.out.println(map.get("Orange")); // null as this key does not exist in hashmap

		System.out.println("3. containsKey(Object key) : to check if this key holds any value");
		System.out.println(map.containsKey("Banana")); // true

		System.out.println("4. containsValue(Object value)  : Checks if a specific value exists in the HashMap");
		System.out.println(map.containsValue(5)); // true

		System.out.println("5. remove(Object key) :  to remove a value from key");
		map.remove("Banana");
		System.out.println("Hashmap after value removal : " + map);

		System.out
				.println("6. remove(Object key, Object value) : Removes the key only if the associated value matches");
		map.remove("Apple", 10); // Removes only if value is 10

		System.out.println("7. isEmpty() : check if hashmap is empty");
		System.out.println(map.isEmpty());

		System.out.println("9. clear() : Removes all key-value pairs");
		map.clear();
		System.out.println(map);

		map.put("Banana", 9);
		map.put("Grapes", 19);

		System.out.println("10. putIfAbsent(K key, V value) : Inserts the key if it is not already present");
		map.putIfAbsent("Grapes", 12);
		System.out.println(map);

		System.out.println("13. keySet() : Returns a set of all the keys");
		System.out.println(map.keySet());

		System.out.println("14. forEach(BiConsumer) : Performs the given action for each entry.");
		map.forEach((fruit, qty) -> System.out.println(fruit + " : " + qty));

	}

}
