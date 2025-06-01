package basicJava;

// this class can not have any child
final class X {
	// this variable can not be modified
	final int x = 20;
	
	// this method can not be overridden
	final void print() {
		System.out.println(x);
	}

}


public class FinalEx {

	public static void main(String[] args) {
		X x =  new X();
		// final variable can not be assigned
//		x.x = 20;
		x.print();
	}

}
