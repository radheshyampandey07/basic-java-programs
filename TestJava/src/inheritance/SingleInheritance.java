package inheritance;

class Parent {
	String name;
	int age;
	
	public Parent() {
		
	}

	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("Parent's name is " + name);
		System.out.println("Parent's age is " + age);
	}
}

class Child extends Parent {

	String name;
	int age;

	public Child(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printChildInfo() {
		System.out.println("Child's name is " + name);
		System.out.println("Child's age is " + age);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {

		Parent parent = new Parent("radhe", 22);
		parent.printInfo();

		Child c = new Child("rahul", 10);
		c.printChildInfo();

	}

}
