package streamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

interface Addition {
	public void sayHi();

	public int add(int n, int m);

	static void sayHello() {
		System.out.println("say h");
	}
}

class Student {
	int id;
	String name;
	int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class CompleteStream {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();

		studentList.add(new Student(1, "Radhe", 12));
		studentList.add(new Student(2, "shyam", 15));
		studentList.add(new Student(3, "Shivam", 22));
		studentList.add(new Student(4, "Satyam", 32));
		studentList.add(new Student(5, "ashish", 42));
		studentList.add(new Student(6, "Akash", 19));
		studentList.add(new Student(7, "Rahul", 32));

		studentList.stream().filter(x -> x.age > 30)
				.forEach(p -> System.out.println(p.getName() + " -> " + p.getAge()));
		System.out.println();

		// method reference example
		studentList.stream().filter(x -> x.age > 30).map(Student::getName).forEach(System.out::println);

		// print list using method reference
		studentList.stream().filter(x -> x.age > 30).forEach(System.out::println);

		// find minimum
		Student st = studentList.stream().min((s1, s2) -> s1.age > s2.age ? 1 : -1).get();
		System.out.println("min age " + st);

		// find count
		long count = studentList.stream().filter(x -> x.age > 30).count();
		System.out.println("students whose age is greater than 30 " + count);

		// convert list into set
		Set<String> set = studentList.stream().filter(s -> s.age > 20).map(s -> s.getName())
				.collect(Collectors.toSet());
		System.out.println("list converted to set : " + set);

		// convert list into map
		Map<String, Integer> map = studentList.stream().collect(Collectors.toMap(s -> s.name, l -> l.name.length()));
		System.out.println("converted map : " + map);

		map.entrySet().stream().filter(s -> s.getValue() > 5).map(s -> s.getKey()).forEach(System.out::println);

		int[] rr = { 23, 1, 22, 11, 10 };
//		Arrays.stream(rr).filter((a, b) -> (b - a)).forEach(System.out::println);

	}

}
