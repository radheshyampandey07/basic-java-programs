package collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class MyClass implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		return b - a;
	}
}

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		List<String> newData = new ArrayList();

		/*----------------------- Add the values ----------------------- */

		data.add(1);
		data.add(2);
		data.add(9);
		data.add(0);
		data.add(99);
		data.add(3);
		data.add(3);
		data.add(1);

		newData.add("radhe ");
		newData.add("shyam ");
		newData.add("pandey ");

		/*----------------------- Print the values ----------------------- */

		// ArrayList maintains the insertion order
		System.out.println("original array list -> " + data);
//		System.out.println(newData);

		System.out.println("print using for each loop: ");
		for (Integer n : data)
			System.out.print(n + " ");
		System.out.println();

		System.out.println("print using for loop: ");
		for (int i = 0; i < data.size(); i++)
			System.out.print(data.get(i) + " ");

		System.out.println("\n print using iterator");
		Iterator<Integer> it = data.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");

		/*----------------------- Add the values at given place ----------------------- */

		// add data at desired index
		data.add(2, 5);
		System.out.println();
		System.out.println("\n get the value at 0 index   " + data.get(0));

		// to change existing value
		data.set(2, 999);

		System.out.println("\nget the size of array list using size method   " + data.size());

		// A whole list can be add into a existing ArrayList of same data types.
		// data.addAll(newData);

		/*----------------------- Sort the list ----------------------- */

		// sort the array list
		// it will sort in asc order
		Collections.sort(data);
		System.out.println("after sorting the list is  " + data);

		// if you want to sort in desc then use Comparator
		Collections.sort(data, new MyClass());

		// using lambda expression it can be written in this way
		Collections.sort(data, (a, b) -> b - a);
		System.out.println("after sorting in desc order  " + data);

		Predicate<Integer> p = x -> x > 20;
		System.out.println("to check the condition using predicate -  " + p.test(30));

//		data.clear();
//		newData.clear();

		/*----------------------- Convert list to set----------------------- */

		Set<Integer> set = new HashSet<>();

		set = data.stream().collect(Collectors.toSet());
		System.out.println(set);

	}

}
