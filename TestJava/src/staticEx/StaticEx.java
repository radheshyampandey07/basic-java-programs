package staticEx;

// Note: we can apply static keyword with variables, methods, blocks, and nested classes
class First {
	static int age = 18;
	static int srNo = 2;

	// static block is executed when first instance of class is created.
	// static block is executed even before constructor is called.

	static {
		age = 30;
		System.out.println("this is static block");
	}

	static public void print() {
		System.out.println("inside static method  " + age);
	}

	// static method can use only static variables.
	static void increment() {
		for (int n = 0; n < 5; n++) {
			srNo++;
			System.out.println(srNo * n);
		}
	}

}

public class StaticEx {

	public static void main(String[] args) {

		System.out.println(First.age);
		First.print();
		First.age = 23;
		System.out.println(First.age);
		First.increment();
		First.increment();

	}

}
