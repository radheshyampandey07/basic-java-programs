package oops;

class Car {
	String name;

	public void whatIsCarName() {
		System.out.println("My car name is Honda Amaze.");
	}

	// overloading is performed by changing number of parameters.
	public void whatIsCarName(String name) {
		System.out.println("My car name is " + name);
	}

	public String whatIsCarName(String name, int speed) {
		return "My car name is " + name + " and it is running at speed " + speed + "kmph.";
	}

	// overloading can not be done only changing by it's return type.
//	public String whatIsCarName(String name) {
//		return "My car name is " + name;
//	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Car car = new Car();
		car.whatIsCarName();
		car.whatIsCarName("Renault Kiger.");
		System.out.println(car.whatIsCarName("Tata nexon", 200));

	}

}
