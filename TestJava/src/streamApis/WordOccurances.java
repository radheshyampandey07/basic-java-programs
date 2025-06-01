package streamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "I am learning java and java is very complex programs";
        
        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

	}

}
