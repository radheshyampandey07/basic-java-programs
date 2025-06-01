package oops;

class College {
	String name;

	public College() {
		System.out.println("parent class  " + getClass().getName());
	}

	public College(String n) {
		name = n;
	}

	void printName() {
		System.out.println("College name is  " + name);
	}
}

class Student extends College {
	String name;

	public Student() {
		System.out.println("child class name is   -> " + getClass().getName());
	}

	public Student(String n) {
		name = n;
	}

	void sayName() {
		super.name = " pandey";
		System.out.println("student name: " + name + " & super class name:" + super.name);
	}

	void printName() {
		System.out.println("child class print method " + name);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Student s = new Student("radhe shyam");
		College c = new College("IGNOU");
		College c1 = new Student("Siya");

		s.printName();
		c.printName();
		s.sayName();

		// even this is parent class method but child class method get preference.
		c1.printName();
	}
}
