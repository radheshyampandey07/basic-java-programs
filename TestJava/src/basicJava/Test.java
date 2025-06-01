package basicJava;

public class Test {

	static void print(int n) {
		int row = 1;

		int curr_star = 0;
		for (row = 1; row <= n;) {

			if (curr_star < row) {
				System.out.print(row);
				curr_star++;
				continue;
			}

			if (curr_star == row) {
				System.out.println("");
				row++;
				curr_star = 0;
			}
		}
	}

	public static void main(String[] args) {

		print(7);

		String s1 = "hello"; // Automatically interned
		String s2 = "hello"; // Reuses s1 reference from the string pool

		String s3 = new String("hello"); // Not interned

		// String interning is a concept in Java that refers to the process of storing
		// only one copy of each unique string literal in a pool and reusing that copy
		// whenever the same string literal is encountered again.
		String s4 = s3.intern(); // Explicitly interned and reused

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1 == s4); // true

	}

}
