package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students {
	int id;
	String name;

	public Students(int a, String b) {
		this.id = a;
		name = b;
	}

	public String toString() {
		return id + " " + name;
	}
}

public class SortListUsingComparator {

	public static void main(String[] args) {
		Students s1 = new Students(1, "Radhe");
		Students s2 = new Students(2, "Krisha");
		Students s3 = new Students(3, "Shyam");
		Students s4 = new Students(4, "Gyan");
		Students s5 = new Students(5, "Akash");
		Students s6 = new Students(6, "Zebra");
		Students s7 = new Students(7, "Lalit");

		List<Students> list = new ArrayList<>();
		list.add(s7);
		list.add(s6);
		list.add(s5);
		list.add(s4);
		list.add(s1);
		list.add(s3);
		list.add(s2);
		System.out.println("Original List");
		System.out.println(list);

		System.out.println("\nSorted List using comparator");
		Collections.sort(list, (a, b) -> b.id - a.id);
		System.out.println("sorted list using id : " + list);
		Collections.sort(list, (a, b) -> b.name.compareTo(a.name));
		System.out.println("sorted list using name : " + list);

	}

}
