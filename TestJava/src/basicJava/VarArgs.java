package basicJava;

public class VarArgs {
	// A method that takes variable
	// number of integer arguments.
	static void fun(int... a) {
		System.out.println("Number of arguments: " + a.length);

		// using for each loop to display contents of a
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		// Calling the varargs method with
		// different number of parameters

		// one parameter
		fun(100);

		// four parameters
		fun(1, 2, 3, 4);

		// no parameter
		fun();
	}

}
