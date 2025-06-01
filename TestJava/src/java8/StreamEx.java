package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 45, 24, 898, 922, 91, 2, 1, 0 };
		int sum = 0;
		// filter out some data on list
		sum = Arrays.stream(numbers).filter(x -> x % 2 == 0).sum();
		System.out.println("sum is : " + sum);

		// stream doesn't change original data
		System.out.print("printing data : ");
		for (int n : numbers) {
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");
		List<Integer> number = Arrays.asList(2, 3, 45, 24, 898, 922, 91, 2, 1, 0);
		// multiple operations on stream simultaneously
		number = number.stream().filter(x -> x % 2 != 0).map(n -> n * 2).distinct().sorted((a, b) -> (b - a))
				.peek(x -> System.out.println(x)) // peek is used to perform any action, it can be used at any point
				.collect(Collectors.toList());
		System.out.println("printing list : " + number);
		// stream on List
		List<String> fruits = Arrays.asList("apple", "banana", "grapes", "cherry");

		// filter array
		int[] arr = { 11, 2011, 21, 56, 34, 16, 27, 38 };
		List<Integer> list = new ArrayList<>();
		for (Integer n : arr) {
			list.add(n);
		}
		List<Integer> filtered = new ArrayList<>();
		filtered = list.stream().filter(x -> x.toString().charAt(0) == '2').collect(Collectors.toList());
		System.out.println(filtered);
	}

}
