package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class TestWithThread {

	TestWithThread() {
		checkArrayList();
	}

	public void checkArrayList() {
		System.out.println("default constructor is called.....");

		List<String> list = new ArrayList<>();

		list.add("Radhe");
		list.add("Shyam");
		list.add("Pandey");

		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(500);
				list.add("Hello");
				System.out.println("new item added to the list..");
				Thread.sleep(300);
				list.remove("Pandey");
				System.out.println("item removed from the list..");

			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		thread.start();
		System.out.println(list);
		System.out.println("default constructor is called.....");

	}

}

public class CopyOnWriteArrayListEx {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<>();

		list.add("Radhe");
		list.add("Shyam");
		list.add("Pandey");

		for (String s : list) {
			if (s.equals("Radhe")) {
				list.add("Name Found...");
			}
			System.out.println(s);
		}

		System.out.println(list);
		System.out.println("***********************");
		TestWithThread withThread = new TestWithThread();
	}

}
