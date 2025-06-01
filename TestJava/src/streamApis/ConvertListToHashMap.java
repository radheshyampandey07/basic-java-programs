package streamApis;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Alice", "Bob", "Charlie");

		// Convert List<String> to HashMap<String, Integer>
		Map<String, Integer> nameMap = names.stream()
				.collect(Collectors.toMap(name -> name, name -> name.length()));

		System.out.println("Original List: " + names);
		System.out.println("Converted HashMap: " + nameMap);

		// Convert List<String> to Set<String>
		Set<String> data = names.stream().collect(Collectors.toSet());
		System.out.println(data);
	}

}
