package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student {
	Long id;
	String name;
	int age;

	public Student(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class ComparatorEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(11);
		list.add(21);
		list.add(1);

		Collections.sort(list);
		System.out.println("Sorting using collections-> " + list);

		// comparator using functional interface
		Collections.sort(list, (a, b) -> b - a);
		System.out.println("Sorting using comparator-> " + list);
		System.out.println("***********************************************");

		// comparator interface has only one method compare(Object o1, Object o2)
		// which takes two arguments and compare them and return integer value
		// comparator is used for sorting

		Integer[] arr = { 21, 1, 3, 90, 100, 33, 44, 19 };
		List<Integer> list1 = Arrays.asList(arr);
//		for (Integer n : list1)
//			System.out.println(n);

		list1.stream().sorted((a, b) -> b - a).forEach(System.out::println);
		System.out.println("****************** Comparable **********************");

		String[] data = { "ac", "ab", "abc" };
		List<String> stringList = Arrays.asList(data);
		Collections.sort(stringList, (a, b) -> a.compareTo(b));
		System.out.println(stringList);
		System.out.println("***********************************************");
		// now play with students
		Student s = new Student(1L, "Radhe", 20);
		Student s2 = new Student(11L, "Shyam", 20);
		Student s3 = new Student(121L, "Akash", 20);
		Student s4 = new Student(22L, "Krishna", 20);
		Student s5 = new Student(32L, "Ram", 20);
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(s);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		System.out.println("before sorting ->  " + studentsList);
		Collections.sort(studentsList, (a, b) -> b.id.compareTo(a.id));
		System.out.println("after sorting -> " + studentsList);
	}

}
