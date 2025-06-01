package inheritance;

class A {

	public A() {
		System.out.println("I am class A");
	}
}

class B extends A {

	public B() {
		// this will call super class constructor before any other statements.
		System.out.println("I am class B");
	}
}

class C extends B {

	public C() {
		System.out.println("I am class C");
	}

}

public class Multilevel {

	public static void main(String[] args) {
		A a = new A();
		A a2 = new B();
//		A a3 = new C();

	}

}
