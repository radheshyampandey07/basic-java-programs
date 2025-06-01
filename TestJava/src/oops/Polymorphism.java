package oops;

class Shapes {
	int radius;
	final int area;

	public Shapes() {
		// blank final instance variable can be initialized in a constructor.
		this.area = 0;
		System.out.println("Shape class constructor.");
	}

	void sayName() {
		System.out.println(getClass().getName());
		System.out.println("Shape class behaviour.");
	}

	void area(int r) {
		System.out.println("area is " + r * r);
	}

	// we can't overload a method only by changing its return type
//	int area(int r) {
//		return r;
//	}
}

class Rectangel extends Shapes {

	// if I comment this method then it will search this method in parent class otherwise
	// object will search method in it's own class
	void sayName() {
		System.out.println(getClass().getName());
		System.out.println("Reactangle class behaviour.");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Rectangel r = new Rectangel();
		r.sayName();
		r.area(5);

//		Shapes s = new Shapes();
//		s.sayName();
	}
}
