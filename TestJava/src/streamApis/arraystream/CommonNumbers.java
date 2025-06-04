package streamApis.arraystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonNumbers {

	public static void main(String[] args) {

		int[] numbers1 = { 1, 2, 3, 4, 8, 9, 6 };
		int[] numbers2 = { 2, 3, 4 };

		List<Integer> commonElements = Arrays.stream(numbers1)
				.filter(num -> Arrays.stream(numbers2).anyMatch(num2 -> num2 == num)) 
				.boxed() // Returns a Stream consisting of the elements of this stream,each boxed to an Integer. 
				.collect(Collectors.toList());

		System.out.println(commonElements);
	}

}
