package basicJava;

class MethodFirst {
	int a, b;

	public MethodFirst sayHello() {
		System.out.println(a);
		return this;
	}

	public MethodFirst sayHi() {
		System.out.println(b);
		return this;
	}

	public void display() {
		System.out.println("display " + a + " " + b);
	}
}

public class MethodChaining {

	public static void main(String[] args) {
		MethodFirst mf = new MethodFirst();
		mf.a = 2;
		mf.b = 6;
		mf.sayHello().sayHi().display();

	}

}
