package java8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfLetters {

	public static void main(String[] args) {
		String str = "allahabad";
		char[] ch = str.toCharArray();
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : ch)
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		System.out.println(freq);

		// second way to get
		Map<Character, Integer> freq1 = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (freq1.containsKey(ch[i])) {
				Integer n = freq1.get(ch[i]);
				freq1.put(ch[i], n + 1);
			} else {
				freq1.put(ch[i], 1);
			}
		}
		System.out.println(freq1);
	}
}
