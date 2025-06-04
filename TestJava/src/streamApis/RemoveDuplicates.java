package streamApis;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Radhe", "Shyam", "Krishna", "Radhe", "Govind", "Hari", "Shyam", "Radha");

		List<Entry<String, Long>> collect = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() == 1).collect(Collectors.toList());

		System.out.println(collect);

		List<String> name = names.stream().distinct().collect(Collectors.toList());
		System.out.println(name);
	}

}
