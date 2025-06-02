package streamApis.stringstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {

        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");
        
		Map<String, List<String>> collect = words.stream()
        		.collect(Collectors.groupingBy(w -> w.chars().sorted()
        				.mapToObj(c -> String.valueOf((char)c))
        				.collect(Collectors.joining())));
	
        System.out.println(collect);
	}

}
