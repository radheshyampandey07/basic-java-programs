package streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.runtime.version"));

		List<Integer> list = Arrays.asList(2, 3, 4, 54, 67, 89, 89, 12, 14, 10);

		// Grouping by element and counting occurrences
		Map<Integer, Long> frequencyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Filter and print only duplicates
		frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(
				entry -> System.out.println("Duplicate Element: " + entry.getKey() + " => Count: " + entry.getValue()));

		List<String> names = Arrays.asList("Radhe", "Pragai", "Krisha", "Rahul", "Priti");
		Map<String, Integer> wordsMap = names.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(wordsMap);

		Map<Integer, List<String>> groupdNames = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupdNames);

//		Map<Integer, List<String>> groupedLetters = names.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));

		Map<Character, List<String>> groupedLetters = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println(groupedLetters);
	}

}
