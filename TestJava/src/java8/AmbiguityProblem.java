package java8;

interface A {
	default void sayHello() {
		System.out.println("say hello");
	}
}

interface B {
	default void sayHello() {
		System.out.println("say hello");
	}
}

public class AmbiguityProblem implements A, B {
	int x = 0;

	public static void main(String[] args) {
// since main is static method so it can use only static variables
//		System.out.println(x);

		AmbiguityProblem ap = new AmbiguityProblem();
		ap.sayHello();
	}

	// if two or more interface has same method name and signature then
	// there comes the ambiguity problem which is also known as Diamond problem.
	// so compiler d'ont know which method will be called
	// to overcome this problem we need to call the method using Interface super
	// keyword.
	@Override
	public void sayHello() {
		A.super.sayHello();
	}

}
