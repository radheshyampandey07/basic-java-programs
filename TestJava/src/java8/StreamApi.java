package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test {
	private int rollno;
	private String name;

	public Test(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [rollno=" + rollno + ", name=" + name + "]";
	}

}

public class StreamApi {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(2, 22, 33, 44, 90, 1);
//		System.out.println(list);
//
		Test t = new Test(123, "Radhe");

		Test t1 = new Test(223, "Shyam");

		Test t2 = new Test(323, "Pandey");

		List<Test> tests = new ArrayList<Test>();
		tests.add(t);
		tests.add(t1);

		tests.add(t2);

		System.out.println("1. students : " + tests);
		tests.stream().filter(x -> x.getRollno() > 222).map(Test::getName).forEach(System.out::println);

		tests.stream().filter(x -> x.getRollno() > 222).map(Test::getName).collect(Collectors.toList());
		System.out.println("2. students : " + tests);

	}

}
