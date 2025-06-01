package singleLoop;

public class Pyramid {

	public static void main(String[] args) {
		int n = 7, row = 1, curr_row = 0, star = 0, k = 1;
		int l = 1;

		for (row = n; row > 0;) {
			if (curr_row < row) {
				System.out.print(" ");
				curr_row++;
				continue;
			}
			if (star < k) {
				System.out.print("*");
				star++;
				continue;
			}
			if (l < k) {
				System.out.print("*");
				l++;
				continue;
			}
			if (star == k) {
				System.out.println();
				row--;
				star = 0;
				k++;
				l = 1;
				curr_row = 0;
			}
		}
	}
}
