package patterns;

public class RightLeftNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 1; i < n + 1; i++) {
			for (int j = i; j < n + 1; j++) {
				System.out.print(j + " ");
			}
			for (int k = 1; k < i; k++)
				System.out.print(k + " ");
			System.out.println();
		}
	}
}
