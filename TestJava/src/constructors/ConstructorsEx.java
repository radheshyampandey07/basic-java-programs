package constructors;

class First {
	String name = "radhe";

	First() {
		// this(); can not call same constructor 
		System.out.println("this constructor is without parameter");
	}

	First(int x) {
		// this() will call default constructor
		this();
		System.out.println(this.name);
		System.out.println("this constructor is with one parameter");
	}

	First(int x, int y) {
		// using this with parameter we can call parameterized constructors.
		this(5);
		// we can not call multiple constructor from one constructor.
//		 this();

		System.out.println("this constructor is with two parameter");
	}

	// you cannot call a constructor from a method.
//	public void call() {
//		this();
//	}

}

public class ConstructorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f1 = new First();
		System.out.println();
		First f2 = new First(2);
		System.out.println();
		First f3 = new First(2, 3);

	}

}
