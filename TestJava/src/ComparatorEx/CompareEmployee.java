package ComparatorEx;

import java.util.Comparator;

public class CompareEmployee implements Comparator<Employee> {

	private String sortBy;

	public CompareEmployee(String ex) {
		this.sortBy = ex;
	}

	@Override
	public int compare(Employee o, Employee o1) {

		switch (sortBy) {
		case "name":
			return o.getName().compareToIgnoreCase(o1.getName());
		case "id":
			return Integer.compare(o.getId(), o1.getId());
		case "email":
			return o.getEmail().compareTo(o1.getEmail());

		case "address":
			return o.getAddress().compareTo(o1.getAddress());
		default:
			throw new IllegalArgumentException("Invalid sorting option: " + sortBy);
		}
	}

}
