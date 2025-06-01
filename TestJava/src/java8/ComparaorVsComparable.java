package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparable if that is the clear natural way to sort the class.

class College implements Comparable<College> {

	public int est;
	public String name;

	public College(int est, String name) {
		this.est = est;
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [est=" + est + ", name=" + name + "]";
	}

	@Override
	public int compareTo(College that) {
		return that.est > this.est ? -1 : 1;
	}

}

public class ComparaorVsComparable {
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(4);
		data.add(93);
		data.add(12);
		data.add(43);
		data.add(51);
		data.add(75);
		System.out.println("All data : " + data);
		System.out.println("------- Let's sort ------- ");
		Collections.sort(data);
		System.out.println("After sorting : " + data);
		System.out.println("------- Let's sort descending order------- ");
		Collections.sort(data, (a, b) -> b - a);
		System.out.println("After sorting desc : " + data);
		System.out.println("------- Let's sort custom ------- ");
		Collections.sort(data, (i, j) -> {
			if (i % 10 > j % 10)
				return 1;
			else
				return -1;
		});
		System.out.println("After sorting custom : " + data);
		System.out.println("-------- Let's work with Model class ----------");
		/*
		 * Comparator - java.util.Comparator: int compare(Object o1, Object o2)
		 * 
		 * A comparator object is capable of comparing two different objects. The class
		 * is not comparing its instances, but some other class’s instances. This
		 * comparator class must implement the java.util.Comparator interface.
		 * 
		 * Capable of comparing any two Objects of Same Type.
		 */
		Comparator<College> colg = new Comparator<College>() {

			@Override
			public int compare(College o1, College o2) {
				return o1.est > o2.est ? -1 : 1;
			}
		};
		College s = new College(2011, "AU");
		College s1 = new College(1998, "DU");
		College s2 = new College(1985, "BU");
		College s3 = new College(2024, "JNU");
		College s4 = new College(2026, "LPU");
		List<College> college = new ArrayList<College>();
		college.add(s);
		college.add(s1);
		college.add(s2);
		college.add(s3);
		college.add(s4);
		System.out.println("College data before sorting  : " + college);

		Collections.sort(college, colg);
		System.out.println("College data comparator sorting  : " + college);

		Collections.sort(college);
		System.out.println("College data comparable sorting : " + college);

	}

}
