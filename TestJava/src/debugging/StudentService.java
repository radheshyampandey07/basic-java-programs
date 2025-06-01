package debugging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService {

	List<Student> students = new ArrayList<Student>();

	public StudentService() {
		List<Student> studs = Arrays.asList(new Student(1, "Radhe"), new Student(2, "Shyam"), new Student(3, "Pandey"));
		this.students.addAll(studs);
	}

	public List<Student> getAll() {
		return students;
	}

}
