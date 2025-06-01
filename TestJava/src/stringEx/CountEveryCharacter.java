package stringEx;

import java.util.HashMap;
import java.util.Map;

public class CountEveryCharacter {

	public static void main(String[] args) {
		String str = "Call me Phenomenal";
		Map<Character, Integer> data = new HashMap<>();
		for (char c : str.toCharArray())
			data.put(c, data.getOrDefault(c, 0) + 1);

		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
