package streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Radhe", "Pragai", "Krisha", "Rahul", "Priti");
		
		Map<Boolean, List<String>> partioningBy = names.stream().collect(Collectors.partitioningBy(l -> l.length() > 5));
		
		System.out.println(partioningBy);
		
		// to get only true values 
		System.out.println(partioningBy.get(true));
		
		
	}

}

