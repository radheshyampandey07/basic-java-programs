package patterns;

public class Pyramid {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i < n; i++) {
			for (int j = n - i; j >=1; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print(k+ " ");
			for (int l = i-1; l >= 1; l--)
				System.out.print(l+ " ");
			System.out.println();
		}
	}
}
