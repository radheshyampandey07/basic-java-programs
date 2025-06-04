package streamApis.arraystream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Radhe", "Shyam", "Krishna", "Radhe", "Govind", "Hari", "Mohan", "Radha");

		List<String> collect = names.stream().sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());

		System.out.println(collect);
	}

}
