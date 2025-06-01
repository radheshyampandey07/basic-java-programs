package oops;

class Base1 {
	public void sayBase() {
		String s = "hello";
		System.out.println("im a base class......." + s);
	}
}

// an Abstract class is a restricted class that can not be used to create objects.
// to access it, it must be inherited from another class.
// 
// An abstract class must be declared with an abstract keyword.
abstract class Shape extends Base1 {

	// It can have constructors and static methods also.
//	public Shape() {
//		System.out.println("inside shape class constructor");
//	}

	// It can have abstract and non-abstract methods.
	abstract double area(double r);

	// abstract class can have non-abstract method
	// which is also available for child's classes
	void sayHello() {
		System.out.println("non-abstract method in abstract class.");
	}
}

class Circle extends Shape {
	double radius;

	double area(double d) {
		System.out.println("abstract method is overridden by child class.");
		this.radius = d;
		System.out.print("area of circle is : ");
		return radius * radius;
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// Abstract class cannot be instantiated.
		// Shape s = new Shape(); illegal

		Circle c1 = new Circle();
		c1.sayHello();
		System.out.println(c1.area(4.5) + " unit.");
	}

}
