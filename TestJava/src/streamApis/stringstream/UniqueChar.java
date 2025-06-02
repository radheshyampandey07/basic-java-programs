package streamApis.stringstream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class UniqueChar {

	public static void main(String[] args) {

		String input = "programming";

		Stream<Character> map = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s -> s.getValue() == 1).map(Map.Entry::getKey);

		map.forEach(System.out::print);
	}

}
