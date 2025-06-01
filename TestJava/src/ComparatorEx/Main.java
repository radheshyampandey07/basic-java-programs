package ComparatorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(0, "Radhe", "radhe@shyam.com", new Address("china town", 230112));
		Employee e2 = new Employee(111, "shyam", "abc@shyam.com", new Address("dagoer town", 130112));
		Employee e3 = new Employee(2, "pandey", "adhe@shyam.com", new Address("Devband town", 330112));
		Employee e4 = new Employee(3, "ashish", "eefe@shyam.com", new Address("mohali town", 220112));
		Employee e5 = new Employee(12, "Ashish", "dddhe@shyam.com", new Address("chandigarh town", 200112));
		Employee e6 = new Employee(22, "Prakash", "hhhe@shyam.com", new Address("shimla town", 130812));

		List<Employee> data = new ArrayList<>();
		data.add(e6);
		data.add(e5);
		data.add(e4);
		data.add(e1);
		data.add(e2);
		data.add(e3);

//		System.out.println("unsorted list   ->  "+data);
		System.out.println();

		Collections.sort(data, new CompareEmployee("address"));

		for (Employee d : data)
			System.out.println(d);

	}

}
