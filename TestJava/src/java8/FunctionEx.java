package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		Function<String, String> names = x -> x.substring(0, 3);
		System.out.println(names.apply("radhe"));

		Function<List<Student>, List<Student>> nameWithRad = s -> {
			List<Student> result = new ArrayList<>();
			for (Student s1 : s) {

				if (names.apply(s1.getName()).equalsIgnoreCase("rad"))
					result.add(s1);
			}
			return result;
		};

		Student s = new Student(1, "radhe");
		Student s1 = new Student(2, "Radhe");
		Student s2 = new Student(3, "Rahul");
		Student s3 = new Student(4, "ashika");
		List<Student> list = Arrays.asList(s, s1, s2, s3);
		List<Student> finalResult = nameWithRad.apply(list);
		System.out.println(finalResult);

	}

	public static class Student {
		int id;
		String name;

		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
