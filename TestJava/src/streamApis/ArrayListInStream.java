package streamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Students {
	int id;
	String name;

	public Students(int x, String y) {
		id = x;
		name = y;
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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
}

public class ArrayListInStream {

	public static void main(String[] args) {

		Students s1 = new Students(11, "Radhe");
		Students s2 = new Students(32, "Shyam");
		Students s3 = new Students(13, "Pandey");
		Students s4 = new Students(14, "Shubhi");
		Students s5 = new Students(21, "Shivam");
		Students s6 = new Students(22, "Ashish");
		Students s7 = new Students(23, "Bob");
		ArrayList<Students> list = new ArrayList<>();
		list.addAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7));

		for (Students l : list)
			System.out.println(l);

		System.out.println("--------print list in stream---------");
		// strea in list
//		 list.stream().filter(id -> id.getId() % 2 == 0)
//				.forEach(System.out::println);

		List<Integer> data = list.stream().filter(x -> x.getId() % 2 != 0).map(x -> x.getId() * 10)
				.collect(Collectors.toList());
		System.out.println(data);
	}

}
