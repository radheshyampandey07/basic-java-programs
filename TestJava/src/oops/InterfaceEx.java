package oops;

// An interface which has no member is known as a marker or tagged interface.
// for example Serializable, Cloneable,Remote etc.
interface Marker{
	
}
interface Cars {
	// interfaces are 100% abstract
	// by default interface have all the fields public, static and final.
	public void start();
}

class Audi implements Cars {
	// we can not change visibility of the method in sub-class
	public void start() {
		System.out.println("Audi Q6 is starting.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {

		Audi audi = new Audi();
		audi.start();
	}

}
