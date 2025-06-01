package singleLoop;

public class Pattern {

	public static void main(String[] args) {
		int n = 8, row = 1;
		int curr_row = 0, star = 0;
//		for (row = 1; row < n;) {
//			if (curr_row < row) {
//				System.out.print("* ");
//				curr_row++;
//				continue;
//			}
//			if (curr_row == row) {
//				System.out.println();
//				row++;
//				curr_row = 0;
//			}
//		}

		for (int i = n; i > 0;) {
			if (curr_row < i) {
				System.out.print(" ");
				curr_row++;
				continue;
			}
			if (star < row) {
				System.out.print("*");
				star++;
				continue;
			}
			if (curr_row == i) {
				System.out.println();
				i--;
				row++;
				star = 0;
				curr_row = 0;
			}
		}
	}

}
