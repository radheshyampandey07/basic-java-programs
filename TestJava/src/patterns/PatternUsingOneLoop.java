
//Java program to print a pattern using single
//loop and continue statement
package patterns;

public class PatternUsingOneLoop {

	// printPattern function to print pattern
	static void printPattern(int n) {

		int row = 1;

		int curr_star = 0;
		for (row = 1; row <= n;) {
			// If current star count is less than
			// current line number
			if (curr_star < row) {
				System.out.print("* ");
				curr_star++;
				continue;
			}

			// Else time to print a new line
			if (curr_star == row) {
				System.out.println("");
				row++;
				curr_star = 0;
			}
		}
	}

	// Driver code
	public static void main(String[] args) {
		printPattern(7);
	}
}

//This code is contributed by vt_m
