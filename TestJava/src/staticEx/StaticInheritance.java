package staticEx;

class X {

	static int x = 20;

	public static void print() {
		System.out.println(x);
	}

}

class Y extends X {
	static int x = 10;

	public static void print() {
		System.out.println("hello from Y");
	}

}

public class StaticInheritance {

	public static void main(String[] args) {
		X x = new X();
		X.print();
		X y = new Y();
		X.print();
	}

}
