package streamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String name;
	Integer salary;

	public Employee(String n, Integer s) {
		name = n;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	void printSalary() {
		System.out.println("salary of th emp is : " + salary);
	}
}

public class FindSalary {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(new Employee("Radhe", 50000), new Employee("Shyam", 10000),
				new Employee("ashish", 20000), new Employee("Ajay", 30000), new Employee("Ram", 40000),
				new Employee("Kashish", 50000));

		Map<String, Integer> employeeMap = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			employeeMap.put(list.get(i).getName(), list.get(i).getSalary());
		}
		System.out.println(employeeMap);
		
//		employeeMap.entrySet().stream().sorted(Comparator.comparing(x -> -x.())).collect(Collectors.toList());
		

	}

}
