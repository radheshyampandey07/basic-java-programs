package streamApis;

import java.util.Arrays;
import java.util.Comparator;

public class NthHighestLength {

	public static void main(String[] args) {
		// for 3rd highest length
		int n = 2;

		String str = "I am learning java complex programs";

		String l1 = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(n)
				.findFirst().get();
		System.out.println(l1);
	}

}
