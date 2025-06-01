package patterns;

public class BinaryRightTriangle {

	public static void main(String[] args) {

		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				int k = (j % 2 == 0) ? 1 : 0;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
