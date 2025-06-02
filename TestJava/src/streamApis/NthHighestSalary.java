package streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees {
	private int empId;
	private String name;
	private int salary;

	// Constructor
	public Employees(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Getters
	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

//	@Override
	public String toString() {
		return "Employee{" + "empId=" + empId + ", name='" + name + "', salary=" + salary + '}' + "\n";
	}

}

public class NthHighestSalary {

	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(new Employees(4, "Laxman", 90000), new Employees(5, "Bharat", 70000),
				new Employees(6, "Keshav", 30000), new Employees(7, "Ajay", 50000), new Employees(8, "Vijay", 60000),
				new Employees(9, "Sita", 80000), new Employees(10, "Geeta", 90000));

		List<Employees> emps = employees.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
				.collect(Collectors.toList());
		System.out.println();
		emps.forEach(System.out::println);
		Employees emp = emps.stream().skip(0).findFirst().get();
		System.out.println("Highest salary employee : " + emp);

	}

}
