package patterns;

public class NumberPattern {

	public static void main(String[] args) {

		int num = 6;
		for (int i = 1; i < num; i++) {
			for (int j = i; j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}

}
