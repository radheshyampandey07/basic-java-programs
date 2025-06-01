package java8;

interface Defaultable {
	default void sayHello() {
		System.out.println("default method in first interface...");
	}
	
	static void sayHi() {
		System.out.println("saying Hi.......");
	}
}


class DefaultChild implements Defaultable {

}

public class DefaultInterfaceExamples {
	public static void main(String[] args) {
		DefaultChild child = new DefaultChild();
		child.sayHello();
		
		// static methods can be accessed through only Interface name
		Defaultable.sayHi();
	}

}
