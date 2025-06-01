package java8;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String str1 = null;
		Optional<String> optional1 = Optional.ofNullable(str1);
		System.out.println(optional1.isPresent());
		// if no value is present then it will throw exception
//		System.out.println(optional1.get());
		System.out.println(optional1.orElse("no value is stored....."));

		String str = "not null";
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
	}

}
