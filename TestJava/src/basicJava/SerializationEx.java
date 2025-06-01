package basicJava;

class A {
	public int i = 0;
}

public class SerializationEx {

	public static void main(String[] args) {

		A a = new A();
		a.i = 10;

		A a1 = new A();
		// for this object value is not set so it will print default value
		System.out.println(a1.i);
		a1 = a;
		System.out.println(a1.i);

	}

}
