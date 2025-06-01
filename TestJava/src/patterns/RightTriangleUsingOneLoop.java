package patterns;

public class RightTriangleUsingOneLoop {

	public static void main(String[] args) {
		int n = 8;
		int line_no = 1;

		// Loop to print desired pattern
		int curr_star = 0;
		for (line_no = 1; line_no <= n;) {
			// If current star count is less than
			// current line number
			if (curr_star < line_no) {
				System.out.print("* ");
				curr_star++;
				continue;
			}

			// Else time to print a new line
			if (curr_star == line_no) {
				System.out.println("");
				line_no++;
				curr_star = 0;
			}
		}
	}
}
