package java8;

// When you declare a interface with @FunctionalInterface then no other method can be in the interface.
// A @FunctionalInterface can have as many default and static method as needed.

@FunctionalInterface
interface Hello {
//	public void sayHello();
	public void sum(int a, int b);

	// since java 8 there can be default method also in functional interface
	// but this method requires the body;
	default void sayHi() {
		System.out.println("say hi");
	}

	default void sayBye() {
		System.out.println("say bye");
	}

	static void sayMorning() {
		System.out.println("Good morning");
	}
}

@FunctionalInterface
interface Hi extends Hello {
	// If a interface extends a @FunctionalInterface then it can not initialize a
	// method to remain a @FunctionalInterface.

}

public class LambdaExpression {

	public static void main(String[] args) {
		// Lambda expression works only with functional interface
		// Hello hello = () -> System.out.println("say hello to world");

		// you can remove type inference
		// instead of Hello hello = (int a, int b) -> System.out.println(a+b);;
		// we can use it as below;

		Hello hello = (a, b) -> System.out.println(a + b);

		hello.sum(12, 10);

		// child interface of a functional interface has access of that method also 
		Hi hi = (a, b) -> System.out.println(a + b);
		hi.sum(12, 10);

		hello.sayHi();
//		hello.sayHello();
		hello.sayBye();
		Hello.sayMorning();
	}
}
