/**
 * Java 8 Stream API - Complete Overview with Examples and Explanations
 */
package streamApis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Java8StreamOperations {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Radhe", "Shyam", "Krishna", "Radhe", "Govind", "Hari", "Mohan", "Radha");

        // 1. filter() - filter elements based on a condition
        List<String> filtered = names.stream()
                .filter(s -> s.startsWith("R"))
                .collect(Collectors.toList());

        // 2. map() - transform elements
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        // 3. flatMap() - flatten nested streams
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"));
        List<String> flatMapped = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        // 4. distinct() - remove duplicates
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        // 5. sorted() - sort elements
        List<String> sorted = names.stream()
                .sorted()
                .collect(Collectors.toList());

        // 6. sorted(Comparator) - custom sort
        List<String> sortedByLength = names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        // 7. peek() - perform action without modifying stream
        List<String> peeked = names.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        // 8. limit() - take first n elements
        List<String> limited = names.stream()
                .limit(3)
                .collect(Collectors.toList());

        // 9. skip() - skip first n elements
        List<String> skipped = names.stream()
                .skip(3)
                .collect(Collectors.toList());

        // 10. forEach() - terminal operation for side-effects
        names.stream().forEach(System.out::println);

        // 11. toArray() - collect to array
        String[] nameArray = names.stream().toArray(String[]::new);

        // 12. reduce() - reduce to a single value
        String concatenated = names.stream()
                .reduce("", (a, b) -> a + b);

        // 13. collect() - collect elements into container
        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());

        // 14. count() - count elements
        long count = names.stream().count();

        // 15. anyMatch(), allMatch(), noneMatch()
        boolean anyStartsWithR = names.stream().anyMatch(s -> s.startsWith("R"));
        boolean allHaveLength5 = names.stream().allMatch(s -> s.length() == 5);
        boolean noneStartsWithX = names.stream().noneMatch(s -> s.startsWith("X"));

        // 16. findFirst() and findAny()
        Optional<String> first = names.stream().findFirst();
        Optional<String> any = names.stream().findAny();

        // 17. groupingBy()
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));

        // 18. partitioningBy()
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(s -> s.startsWith("R")));

        // 19. joining()
        String joined = names.stream()
                .collect(Collectors.joining(", "));

        // 20. summarizingInt()
        IntSummaryStatistics stats = names.stream()
                .collect(Collectors.summarizingInt(String::length));

        // 21. mapToInt(), mapToDouble(), mapToLong()
        int sumOfLengths = names.stream()
                .mapToInt(String::length)
                .sum();

        // 22. boxed() - convert primitive to wrapper
        List<Integer> lengths = names.stream()
                .mapToInt(String::length)
                .boxed()
                .collect(Collectors.toList());

        // 23. parallelStream() - parallel processing
        long parallelCount = names.parallelStream()
                .filter(s -> s.startsWith("R"))
                .count();

        // 24. takeWhile() and dropWhile() (Java 9+ but conceptually useful)
        // Use with caution for pre-Java 9: mimic with filter and limit

        // Print some of the results
        System.out.println("Filtered: " + filtered);
        System.out.println("FlatMapped: " + flatMapped);
        System.out.println("Sorted by length: " + sortedByLength);
        System.out.println("Grouped by length: " + groupedByLength);
        System.out.println("Partitioned: " + partitioned);
        System.out.println("Joined: " + joined);
        System.out.println("Stats: " + stats);
    }
}
