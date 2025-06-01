package java8;

import java.util.Arrays;
import java.util.List;

public class CountSpecificWord {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "apple", "kiwi", "grapes", "apple", "apple");

		long count = words.stream().filter(x -> x == "apple").count();
		System.out.println(count);
	}

}
